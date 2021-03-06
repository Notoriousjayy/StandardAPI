package Utility;

import java.io.IOException;

public class In {
    private static int c;

    private static boolean blank() {
        return Character.isWhitespace((char) c);
    }

    private static void readC() {
        try {
            c = System.in.read();
        } catch (IOException e) {
            c = -1;
        }
    }

    public static void init() {
        readC();
    }

    public static boolean empty() {
        return c == -1;
    }

    public static String getString() {
        if (empty()) {
            return null;
        }
        String s = "";

        /**
         * Initialization:
         * Maintenance:
         * Termination:
         */
        do {
            s += (char) c;
            readC();
        } while (!(empty()) | blank());

        /**
         * Initialization:
         * Maintenance:
         * Termination:
         */
        while (!empty() && blank()) {
            readC();
        }
        return s;
    }

    public static int getInt() {
        return Integer.parseInt(getString());
    }

    public static double getDouble() {
        return Double.parseDouble(getString());
    }
}
