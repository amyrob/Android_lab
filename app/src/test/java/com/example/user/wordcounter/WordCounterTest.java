package com.example.user.wordcounter;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/03/2018.
 */

public class WordCounterTest {

    @Test
    public void canBreakDownPhrase() {
        assertEquals(4, WordCounter.breakDownPhrase("word is a word"));
    }

}
