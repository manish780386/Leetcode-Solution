class Solution {

    public String[] findWords(String[] words) {

        String row1 = "qwertyuiopQWERTYUIOP";
        String row2 = "asdfghjklASDFGHJKL";
        String row3 = "zxcvbnmZXCVBNM";

        List<String> list = new ArrayList<>();

        for (String word : words) {

            if (check(word, row1) || check(word, row2) || check(word, row3)) {
                list.add(word);
            }
        }

        return list.toArray(new String[0]);
    }

    private boolean check(String word, String row) {

        for (char ch : word.toCharArray()) {

            if (row.indexOf(ch) == -1) {
                return false;
            }
        }

        return true;
    }
}