package me.supern64.owoify.mappings.word;

import me.supern64.owoify.Word;
import me.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class OverToOwor implements Mapping {
    public static Pattern OVER_TO_OWOR = Pattern.compile("([Oo])ver");
    public Word map(Word input) {
        return input.replace(OVER_TO_OWOR, "$1wor");
    }
}
