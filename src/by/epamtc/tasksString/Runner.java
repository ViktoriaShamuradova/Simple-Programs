package by.epamtc.tasksString;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        String name= "Шамурадова          Виктория Антоновна";
        String[] romen = Util.decideOddAndEvenChars(null);
        System.out.println(Arrays.toString(romen));

        System.out.println(Util.upperAndLowerCasePercentage("Vik a!"));

        System.out.println(Util.deleteDuplicateChars("Rooomaa"));

        System.out.println(Util.reverseString("Vikaa"));



        System.out.println(Util.insertSubstring(name, 4, "55"));


        System.out.println(Util.deleteSubstring(name, "ik"));

        System.out.println(Util.copyPart("Vika", 0, 3));
        System.out.println(Util.size(null));

        System.out.println(Util.countOccurrences("Vikaikaikaaikaaaika", "ika"));

        System.out.println(Util.getWordsInReverseOrder("Мама мыла раму"));
        System.out.println(Util.replaceSpaceWithAsterisk("    Мама   мыла раму   "));

        System.out.println(Util.replaceLettersInLongestWord(name, "а", "в"));

        System.out.println(Util.lengthOfShortestWord(name));
        System.out.println(Util.countOfWords(name));
        System.out.println(Util.swapWords("Мама мыла раму в доме", "раму", "мыла"));


        System.out.println( Util.deleteLastWord(name));
        System.out.println(Util.addSpace(name, 3));

        System.out.println(Util.isPalindrome("Потоп"));

        System.out.println(Util.replaceSubstring("Vika", "ik", "a"));
        System.out.println(Util.addingIntegers("12345", "12345"));
        System.out.println(Util.deleteWordByLength(name, 8));

        System.out.println(Util.removeExtraSpaces(name));

        System.out.println(Arrays.toString(Util.highlightWords("Мама. мыла, раму!")));
        System.out.println(Util.addingIntegers("12345", "12345"));

    }
}
