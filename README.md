# Vicoman的编程练习簿 

![](https://img.shields.io/badge/lanuage-Java-orange) ![](https://img.shields.io/badge/license-MIT-blue) ![](https://img.shields.io/badge/platform-leetcode-green)

### **<font color=YellowGreen >2023-2-9：</font>**

**-- LeetCode_48**：矩阵翻转，强调的是一个细节，不能覆盖以前的交换。可以采用由内到外的一圈一圈地交换，不难但细节多。

**-- LeetCode_49**：找同位素字符串，可以用Arrays.sort排序，然后HashMap存一下就可以了，简单。

**-- LeetCode_50**：用递归方法实现指数运算很简单，主要思想就是二拆分高阶指数最终转化为指数位为0或者1、-1。

### **<font color=YellowGreen>2023-2-10：</font>**

**-- LeetCode_55**：数组能否从第一位跳到最后一位，可以用一个简单的dp数组从后往前保存此位置能否到最后一位的状态。

**-- LeetCode_56**：合并区间，首先需要根据区间左边来排序，这样合并才更有秩序，然后就OK了，重要的是Java的排序重写需要知道。

### **<font color=YellowGreen>2023-2-11：</font>**

**-- LeetCode_62**：从数组左上角到右下角有多少条路径。是一个很简单的dp问题，f(i, j) = f(i + 1, j) + f(i, j + 1)。

**-- LeetCode_64**：从数组左上角到右下角的最小路径和。是上一个问题的升级版，还是那个思路。

**-- LeetCode_70**：爬楼梯，最简单的dp问题。dp[i] = dp[i - 1] + dp[i - 2]。

**-- LeetCode_72**：最小编辑距离，最经典的dp问题。可以通过计算word1的前i个和word2的前j个字符的最小编辑距离来递推获得最终结果。

**-- LeetCode_75**：颜色分类问题。归根结底还是排序问题，这里可以用遍历比较当前值与前一个值，如果<，则交换当前值与前一个值第一次出现位置，然后再进行一次上述比较。

### **<font color=YellowGreen>2023-2-13：</font>**

**-- CVTE_20230213_1**：很简单的map计一下数的问题。

**-- CVTE_20230213_2**：同样很简单。

### **<font color=YellowGreen>2023-2-15：</font>**

**-- LeetCode_76**：最小覆盖子串。核心是双指针滑动窗口。