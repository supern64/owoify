package com.github.supern64.owoify.mappings.word;

import com.github.supern64.owoify.Word;
import com.github.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class TimeToTim implements Mapping {
    public static Pattern TIME_TO_TIM = Pattern.compile("\\b([Tt])ime\\b");
    public Word map(Word input) {
        return input.replace(TIME_TO_TIM, "$1im");
    }
}
