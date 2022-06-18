    class WordFilter {

        Map<String, Set<Integer>> prefixMap = new HashMap<>();
        Map<String, Set<Integer>> suffixMap = new HashMap<>();
        Set<String> avoidDuplicate = new HashSet<>();

        public WordFilter(String[] words) {
            for (int i = words.length - 1; i >= 0; i--) {
                String word = words[i];
                if (avoidDuplicate.add(word)) {
                    int length = word.length();
                    for (int j = 0; j < length; j++) {
                        String start = word.substring(0, j + 1);
                        Set<Integer> preSet = prefixMap.getOrDefault(start, new HashSet<>());
                        preSet.add(i);
                        prefixMap.put(start, preSet);

                        String end = word.substring(length - 1 - j);
                        Set<Integer> endSet = suffixMap.getOrDefault(end, new HashSet<>());
                        endSet.add(i);
                        suffixMap.put(end, endSet);
                    }
                }
            }
        }

        public int f(String prefix, String suffix) {
            Set<Integer> preSet = prefixMap.get(prefix);
            Set<Integer> endSet = suffixMap.get(suffix);
            if (preSet == null || endSet == null)
                return -1;

            HashSet<Integer> intersection = new HashSet<>(preSet);
            intersection.retainAll(endSet);

            if (intersection.isEmpty())
                return -1;
            return intersection.stream().max(Comparator.naturalOrder()).get();
        }
    }
