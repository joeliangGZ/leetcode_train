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
19. 