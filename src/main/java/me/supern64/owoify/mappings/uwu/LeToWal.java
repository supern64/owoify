package me.supern64.owoify.mappings.uwu;

import me.supern64.owoify.Word;
import me.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class LeToWal implements Mapping {
    public static Pattern LE_TO_WAL = Pattern.compile("le$");
    public Word map(Word input) {
        return input.replace(LE_TO_WAL, "wal");
    }
}
