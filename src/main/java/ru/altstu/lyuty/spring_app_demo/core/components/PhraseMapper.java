package ru.altstu.lyuty.spring_app_demo.core.components;

public interface PhraseMapper {
    String toSentence(String target);

    default String toSentence(String target, char endCh) {
        int n = target.length();
        char[] chars = new char[n + 1];
        target.getChars(0, n, chars, 0);
        chars[0] = Character.toUpperCase(chars[0]);
        chars[n] = endCh;
        return new String(chars);
    }
}
