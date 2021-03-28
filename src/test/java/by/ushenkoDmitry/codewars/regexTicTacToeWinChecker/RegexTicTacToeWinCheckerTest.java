package by.ushenkoDmitry.codewars.regexTicTacToeWinChecker;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RegexTicTacToeWinCheckerTest {

    @Test
    public void test1() {
        assertFalse(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("XO-------"));
    }

    @Test
    public void test2() {
        assertTrue(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("XXX-O-O-O"));
    }

    @Test
    public void test3() {
        assertTrue(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("X--OOOX-X"));
    }

    @Test
    public void test4() {
        assertTrue(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("O--OO-XXX"));
    }

    @Test
    public void test5() {
        assertTrue(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("O-XOX-O-X"));
    }

    @Test
    public void test6() {
        assertTrue(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("OXOOXOXX-"));
    }

    @Test
    public void test7() {
        assertTrue(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("X-O-OOXXO"));
    }

    @Test
    public void test8() {
        assertTrue(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("XO--X-OOX"));
    }

    @Test
    public void test9() {
        assertTrue(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("X-OXOOOXX"));
    }

    @Test
    public void test10() {
        assertFalse(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("XX-XOO---"));
    }

    @Test
    public void test11() {
        assertFalse(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("-XX-OO-O-"));
    }

    @Test
    public void test12() {
        assertFalse(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("OXO--XXO-"));
    }

    @Test
    public void test13() {
        assertFalse(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("OOXXXO---"));
    }

    @Test
    public void test14() {
        assertFalse(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("OXXX-XOO-"));
    }

    @Test
    public void test15() {
        assertFalse(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("OOXXX----"));
    }

    @Test
    public void test16() {
        assertFalse(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("XXOOXXOO-"));
    }

    @Test
    public void test17() {
        assertFalse(RegexTicTacToeWinChecker.regexTicTacToeWinChecker("OXOXOX---"));
    }

}