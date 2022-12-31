package com.github.supern64.owoify.mappings.owo;

import com.github.supern64.owoify.Word;
import com.github.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class VerToWer implements Mapping {
    public static Pattern VER_TO_WER = Pattern.compile("([Vv])er");
    public Word map(Word input) {
        return input.replace(VER_TO_WER, "wer");
    }
}
