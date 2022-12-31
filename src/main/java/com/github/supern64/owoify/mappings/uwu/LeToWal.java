package com.github.supern64.owoify.mappings.uwu;

import com.github.supern64.owoify.Word;
import com.github.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class LeToWal implements Mapping {
    public static Pattern LE_TO_WAL = Pattern.compile("le$");
    public Word map(Word input) {
        return input.replace(LE_TO_WAL, "wal");
    }
}
