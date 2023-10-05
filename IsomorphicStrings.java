public class IsomorphicStrings {

    /**
     * TC: O(n)
     * SC: O(1)
     * 
     * @param s
     * @param t
     * @return
     */
    public boolean isIsomorphic(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();

        if (l1 != l2) {
            return false;
        }

        Map<Character, Character> s_t_map = new HashMap<>();
        Map<Character, Character> t_s_map = new HashMap<>();

        for (int i = 0; i < l1; i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (s_t_map.containsKey(a)) {
                if (s_t_map.get(a) != b) {
                    return false;
                }
            } else if (t_s_map.containsKey(b)) {
                return false;
            } else {
                s_t_map.put(a, b);
                t_s_map.put(b, a);
            }
        }

        return true;
    }

}