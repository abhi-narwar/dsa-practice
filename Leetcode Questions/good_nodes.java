class good_nodes {
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }

    private int dfs(TreeNode node, int maxSoFar) {
        if (node == null) return 0;

        int good = 0;
        if (node.val >= maxSoFar) {
            good = 1;
        }

        int newMax = Math.max(maxSoFar, node.val);

        good += dfs(node.left, newMax);
        good += dfs(node.right, newMax);

        return good;
    }
}
