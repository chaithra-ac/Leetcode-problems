class Solution {
        public boolean equationsPossible(String[] equations) {
        Map<Character, List<Character>> graph = new HashMap<>();
        for (String equation : equations) {
            char l = equation.charAt(0);
            char r = equation.charAt(3);
            if (equation.charAt(1) == '=') {
                graph.computeIfAbsent(l, k -> new ArrayList<>()).add(r);
                graph.computeIfAbsent(r, k -> new ArrayList<>()).add(l);
            } else if (l == r) {
                return false;
            }
        }

        boolean[] visited = new boolean[26];
        int[] index = new int[26];
        int components = 1;
        for (char c : graph.keySet()) {
            int i = c - 'a';
            if (!visited[i]) {
                dfs(c, graph, visited, index, components);
                components++;
            }
        }


        for (String equation : equations) {
            if (equation.charAt(1) == '=') {
                continue;
            }
            int l = equation.charAt(0) - 'a';
            int r = equation.charAt(3) - 'a';
            if (index[l] != 0 && index[l] == index[r]) {
                return false;
            }
        }
        return true;
    }

    void dfs(char v, Map<Character, List<Character>> graph, boolean[] visited, int[] index, int components) {
        int i = v - 'a';
        if (visited[i]) {
            return;
        }
        index[i] = components;
        visited[i] = true;
        for (char c : graph.get(v)) {
            dfs(c, graph, visited, index, components);
        }
    }

}