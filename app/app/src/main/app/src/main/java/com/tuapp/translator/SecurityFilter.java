package com.tuapp.translator;

public class SecurityFilter {
    private static final String CARD_PATTERN = ".*\\b(?:\\d[ -]*?){13,19}\\b.*";
    public static boolean containsSensitiveInfo(String text) {
        if (text == null) return false;
        return text.matches(CARD_PATTERN);
    }
}
