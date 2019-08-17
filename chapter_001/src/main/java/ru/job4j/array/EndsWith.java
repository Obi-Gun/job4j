package ru.job4j.array;

/**
 * Обертка над строкой.
 * Class for "Слово заканчивается с ... [#156317]" task.
 *
 * @author Alexandr Sakhatyr (alexandr.010@yandex.ru)
 * @since 17.08.2019
 */
public class EndsWith {

    /**
     * Проверяет. что слово начинается с префикса.
     * @param post префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean endsWith(String word, String post) {
        boolean result = true;
        char[] wrd = word.toCharArray();
        char[] pst = post.toCharArray();
        if (wrd.length < pst.length) {
            result = false;
        } else {
            for (int i = 0; i < pst.length; i++) {
                if (pst[pst.length - 1 - i] != wrd[wrd.length - 1 - i]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}