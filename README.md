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

### **<font color=YellowGreen>2023-2-21：</font>**

**-- LeetCode_94**：二叉树中序遍历，递归调用就行。

**-- LeetCode_96**：不同的二叉搜索树数量，可以用dp方法，从1到n依次为根节点，左右数量相乘，最后结果相加就对了。

**-- LeetCode_98**：判断是否是二叉搜索树，最关键是知道二叉搜索树的性质，二叉搜索树一定要是中序遍历升序的。

**-- LeetCode_101**：判断是否是对称二叉树。dfs就可。

**-- LeetCode_102**：二叉树层序遍历。可以结合队列来做，一层一层地压进队列然后一层一层地出队列。

**-- LeetCode_104**：二叉树最大深度，简单递归一下就好了。

**-- LeetCode_105**：前序和中序构建二叉树。可以生成根节点，再调用此方法递归生成根节点的子节点，注意子节点的边界。

### **<font color=YellowGreen>2023-2-23：</font>**

**-- Jizhi_20230223_1**：很简单不用讲。

**-- Jizhi_20230223_2**：一个队列就可以解决。

### **<font color=YellowGreen>2023-2-24：</font>**

**-- LeetCode_114**：二叉树平铺。用递归可以实现空间复杂度O(1)的原地改动。用递归把左子树接到右边并递归调用返回最后一个平铺的最后一个节点，再把原来的右子树接到此节点右边，再递归调用返回右子树平铺的最后一个节点作为函数返回值。

**-- LeetCode_121**：挺简单的。

**-- LeetCode_124**：最大路径和。最好用递归，但这次是巧妙的递归。

### **<font color=YellowGreen>2023-2-25：</font>**

**-- LeetCode_128**：最长连续序列。用hashset去重，遍历然后找到一个连续序列的边界，最后不断扩展到不连续，记录长度。

**-- LeetCode_139**：单词拆分。可以用dp或者dfs来做，dfs要注意可能会超时，所以需要备忘录来记录下标为i后面的子串能否拆分（当作缓存）。

### **<font color=YellowGreen>2023-2-26：</font>**

**-- LeetCode_141**：判断链表是否有环，快慢指针就可以。

**-- LeetCode_142**：返回链表入环的第一个点，快慢指针就可以，也可以用HashSet。

**-- LeetCode_146**：设计LRU缓存，官方用LinkedHashMap，我这里用HashMap+queue（但是效果较差）。queue用来找出最近没使用过的key。

### **<font color=YellowGreen>2023-2-8：</font>**

**-- Xinghuan_20230228_1**：面试题，二叉树根据前序和中序找后序。

### **<font color=YellowGreen>2023-3-3：</font>**

**-- LeetCode_148**：链表排序。跟正常排序区别不大，可以用冒泡（会超时）、归并、快排等方法。

### **<font color=YellowGreen>2023-3-4：</font>**

**-- LeetCode_152**：乘积最大子数组。可以用动态规划做，记录最大值和最小值。

### **<font color=YellowGreen>2023-3-6：</font>**

**-- Midea_20230306_1**：找出整数数组中两者间最大乘积。保存第一大和第二大以及第一小和第二小并互相乘比大小。

**-- Midea_20230306_2**：经典的整数矩阵从左上角到右下角最短路径，用dp做就可以。

### **<font color=YellowGreen>2023-3-7：</font>**

**-- Yuliangsheng_20230307_1**：矩阵中所在数为0的行列都改为0。

**-- Baidu_20230307_1**：整数数组拆分为k个子数组，求子数组平均值的和的最小值。

**-- Baidu_20230307_2**：一个k排列满足从1到k的所有值都有，求给定的排列中的满足条件的排列数。