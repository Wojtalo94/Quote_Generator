package com.company;

import com.company.utils.QuiteTranslator;
import com.company.utils.QuoteGenerator;

public class Main {

    private static String frameBorder = "*";

    public static void main(String[] args) {

        System.out.println("\n ~~~ Zapraszamy do udziału! ~~~\n");
        String quote = QuoteGenerator.getQuote();
        String author = QuoteGenerator.getAuthor();
        String translatedQuote = QuiteTranslator.translate(quote);

        System.out.println("Cytat na dzisiaj: \n");

        int frameLength = quote.length() + 6;
        printFrameBorder(frameLength);
        printFrameEmptyLine(frameLength);

        printFrameQuoteLine(quote);
        printFrameAuthorLine(author, frameLength);
        printFrameEmptyLine(frameLength);
        printFrameBorder(frameLength);

        System.out.println("\nPo polsku: \n");
        frameLength = translatedQuote.length() + 6;
        printFrameBorder(frameLength);

        printFrameEmptyLine(frameLength);
        printFrameQuoteLine(translatedQuote);
        printFrameAuthorLine(author, frameLength);

        printFrameEmptyLine(frameLength);
        printFrameBorder(frameLength);
    }

    public static void printFrameAuthorLine (String author, int length)
    {
        System.out.print(frameBorder + "  ");
        int linePadding = length - (2 * 3) - 4 - author.length();
        for (int i = 0; i < linePadding; i++)
        {
            System.out.print(" ");
        }
        System.out.print("--- " + author);
        System.out.println("  " + frameBorder);
    }

    public static void printFrameQuoteLine(String quote)
    {
        System.out.println(frameBorder + "  " + quote + "  " + frameBorder);
    }

    public static void printFrameEmptyLine (int length)
    {
        for (int i = 0;i < length; i++)
        {
            if (i == 0 || i == length - 1)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void printFrameBorder (int length)
    {
        for (int i=0; i < length; i++)
        {
            System.out.print(frameBorder);
        }
        System.out.println();
    }
}
