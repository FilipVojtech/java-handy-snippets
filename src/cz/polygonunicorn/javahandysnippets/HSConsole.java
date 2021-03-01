/*
MIT License

Copyright (c) 2021 PolygonUnicorn

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

package cz.polygonunicorn.javahandysnippets;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Handy Snippets Console package
 */
public class HSConsole {
    static Scanner sc = new Scanner(System.in);

    /**
     * Get an integer from a console
     *
     * @param errorMessage Error message when erroneous input is given
     * @return int
     */
    public static int getInt(String errorMessage) {
        int i;
        try {
            i = sc.nextInt();
        } catch (InputMismatchException mismatchException) {
            System.out.println(errorMessage);
            i = getInt(errorMessage);
        }
        return i;
    }

    /**
     * Get an integer from a console
     *
     * @param inputMessage Message for the user
     * @param nextLine     Put the input on a new line
     * @param errorMessage Error message
     * @return int
     */
    public static int getInt(String inputMessage, boolean nextLine, String errorMessage) {
        int i;
        if (nextLine) System.out.println(inputMessage);
        else System.out.print(inputMessage);
        try {
            i = sc.nextInt();
        } catch (InputMismatchException mismatchException) {
            System.out.println(errorMessage);
            i = getInt(inputMessage, nextLine, errorMessage);
        }
        return i;
    }

    /**
     * Get a string from a console
     *
     * @return String
     */
    public static String getString() {
        return sc.nextLine();
    }

    /**
     * Get a string from a console
     *
     * @param inputMessage Message for the user
     * @param nextLine     Put the input on a new line
     * @return String
     */
    public static String getString(String inputMessage, boolean nextLine) {
        if (nextLine) System.out.println(inputMessage);
        else System.out.print(inputMessage);
        return sc.nextLine();
    }
}
