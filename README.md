# sast2024-java

这是 [2024 年清华大学计算机系学生科协暑期培训](https://summer24.net9.org/) Java 部分的作业。

本部分作业由三个小作业组成，本次作业采用**代码填空**的形式进行考察。

- 作业文件位于 `src/main/java/homework/` 中。你可以直接在 IntelliJ IDEA 中运行每一个作业，每一个作业都实现了 `main` 函数，方便用户交互。
- 测试点文件位于 `assets/testcases/` 中。

## 作业内容

### 作业 1：ThreeSumClosest

你只需要补全 `threeSumClosest` 函数中 `TODO begin` 和 `TODO end` 之间的代码即可。

- 题目：给定一个数组 `nums[]` 和一个整数 `target`。求 `nums[i] + nums[j] + nums[k]`，满足：
  - `i != j && j != k && i != k`，且
  - `nums[i] + nums[j] + nums[k]` 与 `target` 的差的绝对值最小。
- 数据范围：`3 <= nums.length <= 500`，`-1000 <= nums[i] <= 1000`，`-10000 <= target <= 10000`。

### 作业 2：LongestSubstringWithoutRepeatingCharacters

你只需要补全 `lengthOfLongestSubstring` 函数中 `TODO begin` 和 `TODO end` 之间的代码即可。

- 题目：给定一个字符串 `s`，求不含重复字符的最长子串的长度。
- 注意：**子串**指的是字符串中连续的一段。例如，空串、`abc`、`bcd` 和 `abcdef` 都是 `abcdef` 的子串，但 `abd`、`adf` 和 `xyz` 都不是。
- 数据范围：`0 <= s.length <= 50000`，`s` 中仅含 ASCII 码中的可见字符。

### 作业 3：Wordle

你只需要补全 `guess` 函数中 `TODO begin` 和 `TODO end` 之间的代码即可。

- 题目：给定 Wordle 游戏的一个状态，求下一个状态。具体的游戏规则不再赘述。

  - 输入：一个 `State` 类型的对象 `input`；
  - 输出：一个 `State` 类型的对象 `output`。

- `State` 类型的定义如下：

  ```java
  public class State {
      Color[] word_state;
      Color[] alphabet_state;
      int chance_left;
      String answer, word;
      GameStatus status;
  }
  ```

  - 其中 `Color` 是一个枚举类，成员可以为 `GRAY`、`RED`、`YELLOW` 或 `GREEN`。
  - `GameStatus` 也是一个枚举类，成员可以为 `RUNNING`、`LOST` 或 `WON`，分别代表着游戏未结束、失败、获胜。
  - `word_state` 是当前局面下此轮猜测的单词中每一个字母被猜测的状态。
  - `alphabet_state` 是当前局面下每一个字母被猜测的状态。
  - `chance_left` 是当前局面还剩多少次机会。若输入满足 `chance_left` 为 $1$ 且此轮猜错，则 `chance_left` 变为 $0$ 并游戏结束。
  - `answer` 是标准答案，`word` 是此轮猜测的答案。
  - `status` 是当前局面的运行状态。

- 注意：
  - `output` 的 `answer` 和 `word` 应与 `input` 相同。
  - `output` 的 `chance_left` 应恰比 `input` 少 $1$。在 `chance_left` 为 $1$ 且此轮猜错的情况下，除了将 `chance_left` 变为 $0$​，同时将 `status` 变为 `LOST`，你仍应更新 `word_state` 和 `alphabet_state`。
  - 当此轮猜对的情况下，除了将 `status` 变为 `WON`，你仍应更新 `word_state` 和 `alphabet_state`。
  - 当 `word` 中出现多个相同的字母 $\sigma$ 时，应：
    - 首先将位置正确的 $\sigma$ 标为绿色；
    - 再将位置不正确的 $\sigma$ 从左往右，标为黄色或红色。若此时已标记的 $\sigma$ 的个数未超过 `answer` 中的个数，则应标为黄色；否则应标为红色。
    - 举个例子，假设 `answer` 是 `aabba` 而 `word` 是 `abaaa`（这两个词都不存在，此例仅做演示），此为第一轮猜测，则 `word_state` 应为 `GYYRG`。首先将 `word` 中的第一个 `a` 和最后一个 `a` 均标记为绿色 `G`。然后将第二个 `a` 标为黄色 `Y`，此时标记的 `a` 的数量已经等于 `answer` 中  `a` 的数量。因此，第三个 `a` 标记为红色 `R`。
  - `answer` 和 `word` 都将在读入时转为大写。

## 如何测试

将代码补全完毕后，你可以选择：

- 在本地查看测试结果：
  - 在 IntelliJ IDEA 中运行 `src/test/java/homework/` 中对应的测试文件。
  - 或是运行脚本，
    - 对于 Windows 用户，运行 `gradlew.bat`；
    - 对于 Linux 或其他用户，运行 `gradlew`。
- 或是将代码提交至 GitHub。由于仓库已经配置好了 CI，故在每一次提交后你都可以通过查看 GitHub Actions 是否成功运行以判断你的代码是否正确。

## 如何提交

如果你完成了作业，可以将你的仓库链接发在本仓库的 issue 区。请遵循已提供的 issue 模板进行填写。
