package com.github.supern64.owoify.mappings.owo;

import com.github.supern64.owoify.Word;
import com.github.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class SpecificConsonantsLeToLetterAndWal implements Mapping {
    public static Pattern SPECIFIC_CONSONANTS_LE_TO_LETTER_AND_WAL = Pattern.compile("([DdFfGgHhJjPpQqRrSsTtXxYyZz])le$");

    public Word map(Word input) {
        return input.replace(SPECIFIC_CONSONANTS_LE_TO_LETTER_AND_WAL, "$1wal");
    }
}
