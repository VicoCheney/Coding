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

### **<font color=YellowGreen>2023-2-16：</font>**

**-- Bole_20230216_1**：房间找钥匙的问题，可以简单用递归调用遍历所有能进的房间。

**-- Bole_20230216_2**：二叉树后序遍历转层序遍历，首先就是要先递归找到root，然后用队列做层序遍历。

**-- Bole_20230216_3**：先归并排序，归并的子数组如果长度小于k，则子数组用插入排序。强调的是掌握两个排序算法。

**-- Bole_20230216_4**：n皇后问题有几种摆法，dfs暴力破解。

### **<font color=YellowGreen>2023-2-18：</font>**

**-- LeetCode_78**：找数组所有子集。可以使用回溯找。

### **<font color=YellowGreen>2023-2-19：</font>**

**-- LeetCode_79**：判断矩阵中有没有一片相邻的字符可以组成某单词。用visits数组保存访问过的点，然后dfs回溯从第一个字符开始检索，直到停止。

**-- LeetCode_84**：柱状图中最大的矩形。这个题很搞，核心思想是单调栈（栈储存index），当前高度比栈顶小，则可以确定栈顶对应高度的最大矩形，但一定要注意此矩形的左右边界，右边界就是当前高度对应的index，左边界是上一个栈顶元素。

### **<font color=YellowGreen>2023-2-20：</font>**

**-- LeetCode_85**：0和1组成的矩阵中找最大1矩阵。其实是LeetCode_84的升级版，每一行的高度相当于84题的输入，所以只需要每一行都计算柱状图中最大的矩形找最大值就可以了。