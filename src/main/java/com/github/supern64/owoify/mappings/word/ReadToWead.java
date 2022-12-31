package com.github.supern64.owoify.mappings.word;

import com.github.supern64.owoify.Word;
import com.github.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class ReadToWead implements Mapping {
    public static Pattern READ_TO_WEAD_UPPER = Pattern.compile("Read");
    public static Pattern READ_TO_WEAD_LOWER = Pattern.compile("read");

    @Override
    public Word map(Word input) {
        return input.replace(READ_TO_WEAD_UPPER, "Wead")
                    .replace(READ_TO_WEAD_LOWER, "wead");
    }
}
