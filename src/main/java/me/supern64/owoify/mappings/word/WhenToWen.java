package me.supern64.owoify.mappings.word;

import me.supern64.owoify.Word;
import me.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class WhenToWen implements Mapping {
    public static Pattern WHEN_TO_WEN = Pattern.compile("([Ww])hen");
    public Word map(Word input) {
        return input.replace(WHEN_TO_WEN, "$1hen");
    }
}
