package me.supern64.owoify.mappings.owo;

import me.supern64.owoify.Word;
import me.supern64.owoify.mappings.Mapping;

import java.util.regex.Pattern;

public class SpecificConsonantsOToLetterAndWo implements Mapping {
    public static Pattern SPECIFIC_CONSONANTS_O_TO_LETTER_AND_WO_UPPER = Pattern.compile("([BCDFGHJKMNPQSTXYZ])([oO])");
    public static Pattern SPECIFIC_CONSONANTS_O_TO_LETTER_AND_WO_LOWER = Pattern.compile("([bcdfghjkmnpqstxyz])o");
    public Word map(Word input) {
        return input.replace(SPECIFIC_CONSONANTS_O_TO_LETTER_AND_WO_LOWER, "$1wo")
                    .replace(SPECIFIC_CONSONANTS_O_TO_LETTER_AND_WO_UPPER, (s1, s2) -> s1 + (s2.toUpperCase().equals(s2) ? "W" : "w"));
    }
}
