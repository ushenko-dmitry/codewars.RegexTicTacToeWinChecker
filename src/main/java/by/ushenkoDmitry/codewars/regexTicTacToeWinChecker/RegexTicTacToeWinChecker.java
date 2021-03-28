package by.ushenkoDmitry.codewars.regexTicTacToeWinChecker;

import java.util.ArrayList;
import java.util.List;

public class RegexTicTacToeWinChecker {

    public static boolean regexTicTacToeWinChecker(String board) {
        List<String> trios = new ArrayList<>();
        trios.addAll(getHorizontalTrios(board));
        trios.addAll(getVerticalTrios(board));
        trios.addAll(getDiagonalTrios(board));
        for (String trio : trios) {
            if (trio.matches("^[X]{3}|[O]{3}$")) {
                return true;
            }
        }
        return false;
    }

    private static List<String> getDiagonalTrios(String board) {
        List<String> trios = new ArrayList<>();
        String trio1 = "";
        for (int i = 0; i <= 8; i += 4) {
            trio1 += board.charAt(i);
        }
        trios.add(trio1);
        String trio2 = "";
        for (int i = 2; i <= 6; i += 2) {
            trio2 += board.charAt(i);
        }
        trios.add(trio2);
        return trios;
    }

    private static List<String> getVerticalTrios(String board) {
        List<String> trios = new ArrayList<>();
        for (int i = 0; i < board.length() / 3; i++) {
            String trio = "" + board.charAt(i) + board.charAt(i + 3) + board.charAt(i + 6);
            trios.add(trio);
        }
        return trios;
    }

    private static List<String> getHorizontalTrios(String board) {
        List<String> trios = new ArrayList<>();
        for (int i = 0; i < board.length() / 3; i++) {
            trios.add(board.substring(i * 3, i * 3 + 3));
        }
        return trios;
    }
}