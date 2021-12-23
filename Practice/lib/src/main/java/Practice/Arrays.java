package Practice;

import java.util.ArrayList;
import java.util.List;

public class Arrays {

    //    QUESTION 3 – LOGIC 2
    public static void countCharacters(String string) {
        int lettersCounter = 0;
        int numbersCounter = 0;
        int charactersCounter = 0;
        for (int i = 0; i < string.length(); i++) {
            char singleCharacter = string.charAt(i);
            if ((singleCharacter >= 65 && singleCharacter <= 90) || (singleCharacter >= 97 && singleCharacter <= 122)) {
                lettersCounter++;
            } else if (singleCharacter >= 48 && singleCharacter <= 57) {

                numbersCounter++;
            } else {
                charactersCounter++;
            }


        }
        System.out.println("Letters =>" + lettersCounter + "\n" + "Numbers =>" + numbersCounter + "\n" + "Special Characters (including spaces) =>" + charactersCounter);
        System.out.println(string.length());

    }


//    QUESTION 2 – LOGIC 1

    public static void printCustomization(String[] stringsArr) {
        List newList = new ArrayList();

        for (int i = 0; i < stringsArr.length; i++) {
            char firstCharacter = stringsArr[i].charAt(0);
            if (firstCharacter == 'A' || firstCharacter == 'E' || firstCharacter == 'I' || firstCharacter == 'O' || firstCharacter == 'U') {
                newList.add(stringsArr[i]);
            }
        }
        System.out.println(newList.toString());

    }

    public static void printNamesLongerThanFive(String[] stringsArr) {
        List newList = new ArrayList();

        for (int i = 0; i < stringsArr.length; i++) {
            int productElement = stringsArr[i].length();
            if (productElement > 5) {
                newList.add(stringsArr[i]);
            }
        }
        System.out.println(newList.toString());

    }
}
