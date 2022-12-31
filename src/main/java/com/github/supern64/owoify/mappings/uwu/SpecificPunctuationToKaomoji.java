package com.github.supern64.owoify.mappings.uwu;

import com.github.supern64.owoify.Word;
import com.github.supern64.owoify.mappings.Mapping;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class SpecificPunctuationToKaomoji implements Mapping {
    // faces stolen from https://github.com/deadshot465/owoify-py
    public static Pattern PERIOD_COMMA_EXCLAMATION_SEMICOLON_TO_KAOMOJIS_FIRST = Pattern.compile("(?:[.,](?![0-9]))+");
    public static Pattern PERIOD_COMMA_EXCLAMATION_SEMICOLON_TO_KAOMOJIS_SECOND = Pattern.compile("[!;]+");
    public static List<String> FACES = Arrays.asList(
            "(・`ω´・)", ";;w;;", "owo", "UwU", ">w<", "^w^", "(* ^ ω ^)",
            "(⌒ω⌒)", "ヽ(*・ω・)ﾉ", "(o´∀`o)", "(o･ω･o)", "＼(＾▽＾)／",
            "(*^ω^)", "(◕‿◕✿)", "(◕ᴥ◕)", "ʕ•ᴥ•ʔ", "ʕ￫ᴥ￩ʔ", "(*^.^*)", "(｡♥‿♥｡)",
            "OwO", "uwu", "uvu", "UvU", "(*￣з￣)", "(つ✧ω✧)つ", "(/ =ω=)/",
            "(╯°□°）╯︵ ┻━┻", "┬─┬ ノ( ゜-゜ノ)", "¯\\_(ツ)_/¯");
    public Word map(Word input) {
        return input.replace(PERIOD_COMMA_EXCLAMATION_SEMICOLON_TO_KAOMOJIS_FIRST, " " + FACES.get((int)Math.floor(Math.random() * FACES.size())))
                .replace(PERIOD_COMMA_EXCLAMATION_SEMICOLON_TO_KAOMOJIS_SECOND, " " + FACES.get((int)Math.floor(Math.random() * FACES.size())));
    }
}
