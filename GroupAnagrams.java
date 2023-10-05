public class GroupAnagrams {

    /**
     * TC: O(n k log k)
     * SC: O(nk)
     * 
     * @param strs
     * @return
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] _str = str.toCharArray();
            Arrays.sort(_str);

            String s = String.valueOf(_str);
            List<String> list = map.getOrDefault(s, new ArrayList<>());
            list.add(str);
            map.put(s, list);
        }

        return new ArrayList<>(map.values());
    }

}