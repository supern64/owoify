package me.supern64.owoify;

import java.util.*;
import java.util.function.BiFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Word {
    private String word;
    private final Set<String> replacedWords;

    Word(String word) {
        this.word = word.trim();
        this.replacedWords = new HashSet<>();
    }

    private boolean containedReplacedWords(Pattern searchValue, String replaceValue) {
        return replacedWords.stream().anyMatch(word -> !searchValue.matcher(word).replaceFirst(replaceValue).equals(word));
    }

    public Word replace(Pattern searchValue, String replaceValue) {
        return replace(searchValue, replaceValue, false);
    }
    public Word replace(Pattern searchValue, BiFunction<String, String, String> replaceFunction) {
        return replace(searchValue, replaceFunction, false);
    }
    public Word replace(Pattern searchValue, String replaceValue, boolean replaceReplacedWords) {
        if (!replaceReplacedWords && containedReplacedWords(searchValue, replaceValue)) return this;
        Matcher matcher = searchValue.matcher(this.word);
        String replacingWord = matcher.replaceAll(replaceValue).trim();
        List<String> matchList = Utils.getAllMatches(searchValue.matcher(this.word));
        List<String> replacedWords = matchList.size() != 0 ? matchList.stream().map(e -> e.replace(e, replaceValue)).collect(Collectors.toList()) : new ArrayList<>();
        if (!replacingWord.equals(this.word)) {
            this.replacedWords.addAll(replacedWords);
        }
        this.word = replacingWord;
        return this;
    }

    public Word replace(Pattern searchValue, BiFunction<String, String, String> replaceFunction, boolean replaceReplacedWords) {
        Matcher matcher = searchValue.matcher(this.word);
        List<String> matchList = Utils.getAllMatches(matcher);
        if (matchList.size() == 0) return this;
        List<String> splitGroup = Arrays.asList(matchList.get(0).split(""));
        String replaceValue = replaceFunction.apply(splitGroup.get(0), splitGroup.get(1)); // will be a bit silly but its 2am
        if (!replaceReplacedWords && containedReplacedWords(searchValue, replaceValue)) return this;
        String replacingWord = this.word.replaceAll(matchList.get(0), replaceValue).trim();
        List<String> replacedWords = matchList.size() > 1 ? matchList.stream().map(e -> e.replace(e, replaceValue)).collect(Collectors.toList()) : new ArrayList<>();
        if (!replacingWord.equals(this.word)) {
            this.replacedWords.addAll(replacedWords);
        }
        this.word = replacingWord;
        return this;
    }

    public String toString() {
        return this.word;
    }
}
