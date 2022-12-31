package com.github.supern64.owoify;

import com.github.supern64.owoify.mappings.Presets;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The main class for the owoify API.
 * @author SuperN64
 * @version 1.0.0, 1/1/23
 */
public class Owoify {

    public static Pattern WORD_REGEX = Pattern.compile("\\S+");
    public static Pattern SPACE_REGEX = Pattern.compile("\\s+");

    /**
     * Owoifies a string with level {@link OwoLevel#OWO}
     * @param string the string to owoify
     * @return the owoified string
     */
    public static String owoify(String string) {
        return owoify(string, OwoLevel.OWO);
    }

    /**
     * Owoifies a string with various levels of owoness.
     * @param string the string to owoify
     * @param level the level of owoness to apply
     * @return the owoified string
     * @see OwoLevel
     */
    public static String owoify(String string, OwoLevel level) {
        List<String> words = Utils.getAllMatches(WORD_REGEX.matcher(string));
        List<String> spaces = Utils.getAllMatches(SPACE_REGEX.matcher(string));
        words = words.stream().map(word -> {
            Word wordObject = new Word(word);
            Presets.SPECIFIC_WORD_MAPPINGS.forEach(mapping -> mapping.map(wordObject));
            switch (level) {
                case UVU:
                    Presets.UVU_MAPPINGS.forEach(mapping -> mapping.map(wordObject));
                case UWU:
                    Presets.UWU_MAPPINGS.forEach(mapping -> mapping.map(wordObject));
                case OWO:
                    Presets.OWO_MAPPINGS.forEach(mapping -> mapping.map(wordObject));
                default:
                    break;
            }
            return wordObject.toString();
        }).collect(Collectors.toList());
        return String.join("", Utils.interleaveList(words, spaces));
    }

}
