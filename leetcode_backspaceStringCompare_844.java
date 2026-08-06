class Solution {

    public boolean backspaceCompare(String s, String t) {

        int i = s.length() - 1;
        int j = t.length() - 1;

        while (i >= 0 || j >= 0) {

            i = getNextValidIndex(s, i);
            j = getNextValidIndex(t, j);

            if (i == -1 && j == -1) {
                return true;
            }

            if (i == -1 || j == -1) {
                return false;
            }

            if (s.charAt(i) != t.charAt(j)) {
                return false;
            }

            i--;
            j--;
        }

        return true;
    }

    private int getNextValidIndex(String s, int index) {

        int skip = 0;

        while (index >= 0) {

            if (s.charAt(index) == '#') {

                skip++;
                index--;

            } else if (skip > 0) {

                skip--;
                index--;

            } else {

                return index;
            }
        }

        return -1;
    }
}