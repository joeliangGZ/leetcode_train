LeetCode 刷题.

## 笔记
1. 链表操作，dummy节点: mergeTwoLists
2. 滑动窗口: findSubstring 
3. 二分查找: mySqrt
4. 动态规划: 转移方程，边界条件，验证 》climbStairs 
5. 链表删除重复元素: 链表严格升序，比较下一个和下下个 》deleteDuplicates
6. 两个数组排序：逆向双指针 》merge，要求原来的两个数组非递减，且第一个数据尾部有空间
7. 二叉树的三种遍历顺序 》BST.md
8. 相同的树
   9. 深度优先搜索，最优解，递归、栈，回溯，后进先出 》isSameTreeDFS
   10. 广度优先搜索，最短路径，队列，先进先出 》isSameTreeBFS
11. 树的镜像（相同的树思维） 》 深度优先搜索 isSymmetricDFS、广度优先搜索 isSymmetricBFS
12. 树的深度
    13. 深度优先搜索，递归，考虑最小子问题的处理模式 》maxDepthDFS 
    14. 广度优先搜索，队列，将每一层的所有子节点加入队列，然后 depth+1 》maxDepthBFS
15. 根据升序数组构建二叉树。递归-分治。》sortedArrayToBST
    16. 将构建好的二叉树重新按升序打印（中序遍历：左中右）》inorderTraversal
    17. 中序遍历重要应用，按升序访问整棵树 
18. 平衡二叉树 是指该树所有节点的左右子树的深度相差不超过 1。
19. 二叉树的最小深度 》minDepth 递归左右，比较出最小的+1。如果left or right为null, left+right+1
20. 路径总和 》 hasPathSum 递归判断左右，分解子问题为 sum - root.val
21. 杨辉三角 》 给出一个数，生成多少行的杨辉三角 》generate  curRow j = preRow j + j-1
22. 杨辉三角 II 》 给出一个数，生成杨辉三角中第n行的值 》getRow 滚动数组思想，只用到 O(rowIndex) 的空间复杂度
23. 买卖股票的最好时机 》maxProfit 有小记小，有大算利，比较最大利润，更新
24. 验证回文串 》isPalindrome 正则表达式，双指针，比较头尾
25. 只出现一次的数字 》singleNumber 异或运算，相同的数字异或为0，0异或任何数字为任何数字
26. 判断链表是否有环 》hasCycle 快慢指针，快指针每次走两步，慢指针每次走一步，如果快指针追上慢指针，则说明有环
27. 二叉树前序遍历 根-左-右
    28. preorderTraversal 递归，加入根节点，加入左节点，加入右节点，考虑最小子问题
    29. preorderTraversalIterate 迭代，维护栈，推到最左子树到底，加入右子树
    30. 中序遍历 前序遍历 迭代（使用栈）方式类似，区别只是在何时 add node.val
31. 二叉树后序遍历 左-右-根 》postorderTraversal
    32. lastVisited 的作用是验证 current.right 已经 visit 过了，可以加入根节点了。 
33. 二叉树中序遍历 左-根-右 》inorderTraversal
34. 常量内存O(1)解决问题 possible way: 快慢指针
    35. 正常的解决方式：O(m)的内存使用：哈希集合
36. 相交的链表，返回相交的部分 》getIntersectionNode 
37. 