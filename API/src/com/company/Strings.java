package com.company;

public class Strings {

    /**
     * Input: A pattern to search for and text to search in.
     * Output: The count of occurences
     * Description: This method discovers all ocurrences of a pattern in a given text.
     */
    public static int countMatches(String pattern, String text) {

        int count = 0;
        int M = pattern.length();
        int N = pattern.length();

        if (M > N) {
            return 0;
        }
        /**
         * Initialization:
         * Maintenance:
         * Termination:
         */
        for (int i = 0; i < N; i++) {
            int j;
            /**
             * Initialization:
             * Maintenance:
             * Termination:
             */
            for (j = 0; j < M; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        break;
                    }
                }
                if (j == pattern.length()) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * input:
     * output:
     * description: This method returns a string that is the same as the string given
     * as its parameter except that each sequence of blank charachers is replaced with
     * a single black character.
     * <p>
     * NOTE
     * <p>
     * Since Java strings are immuatble objects and cannot be changed
     * to solve this issue we:
     * copy into a character array, then change the character array,
     * then create a new String with the result.
     */
    public static String squeeze(String word) {

        char[] a = word.toCharArray();

        // index N refers to the next character in the result.
        int N = 1;

        // The main loop copies the next string character into
        // a[N] if it is not an black of if a[N-1] is an black.
        /**
         * Initialization:
         * Maintenance:
         * Termination:
         */
        for (int i = 1; i < a.length; i++) {
            a[N] = a[i];
            if (a[N] != ' ') {
                N++;
            } else if (a[N - 1] != ' ') {
                N++;
            }
        }
        return new String(a, 0, N);
    }


}
