package me.supern64.owoify.mappings.owo;

import me.supern64.owoify.Word;
import me.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class VOrWLeToWal implements Mapping {
    public static Pattern V_OR_W_LE_TO_WAL = Pattern.compile("[vw]le");
    public Word map(Word input) {
        return input.replace(V_OR_W_LE_TO_WAL, "wal");
    }
}
