package com.github.supern64.owoify.mappings;

import com.github.supern64.owoify.Word;

/**
 * Interface for a mapping.
 * @author SuperN64
 * @version 1.0.0, 1/1/23
 */
public interface Mapping {
    /**
     * Modifies the word object.
     * @param input the word object being modified
     * @return the modified word object
     */
    Word map(Word input);
}
