class cal_equation{
    Map<String, Map<String, Double>> graph = new HashMap<>();

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        for (int i = 0; i < equations.size(); i++) {
            String a = equations.get(i).get(0);
            String b = equations.get(i).get(1);
            double v = values[i];

            graph.putIfAbsent(a, new HashMap<>());
            graph.putIfAbsent(b, new HashMap<>());

            graph.get(a).put(b, v);
            graph.get(b).put(a, 1.0 / v);
        }

        double[] res = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            String a = queries.get(i).get(0);
            String b = queries.get(i).get(1);
            res[i] = dfs(a, b, new HashSet<>());
        }
        return res;
    }

    private double dfs(String start, String end, Set<String> visited) {
        if (!graph.containsKey(start) || !graph.containsKey(end)) return -1.0;
        if (start.equals(end)) return 1.0;

        visited.add(start);

        for (String nei : graph.get(start).keySet()) {
            if (!visited.contains(nei)) {
                double val = dfs(nei, end, visited);
                if (val != -1.0) {
                    return graph.get(start).get(nei) * val;
                }
            }
        }
        return -1.0;
    }
}
