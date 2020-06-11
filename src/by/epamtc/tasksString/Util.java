package by.epamtc.tasksString;

public class Util {

    public static String[] decideOddAndEvenChars(String word) {
        if (word != null) {
            if (word.length() == 0) {
                return new String[0];
            }
            String[] changedWords = new String[2];
            StringBuilder leftSb = new StringBuilder();
            StringBuilder rightSb = new StringBuilder();


            for (int i = 0; i < word.length(); i++) {
                if (i % 2 == 0) {
                    rightSb.append(word.charAt(i));
                } else {
                    leftSb.append(word.charAt(i));
                }
            }
            changedWords[0] = new String(leftSb);
            changedWords[1] = new String(rightSb);
            return changedWords;

        } else {
            return null;
        }
    }

    public static String upperAndLowerCasePercentage(String word) {
        String upperCase = word.toUpperCase();
        int countUpper = 0;
        int countLower = 0;


        for (int i = 0; i < word.length(); i++) {
            char charAt = word.charAt(i);

            if (charAt != '.' && charAt != ','
                    && charAt != ' ' && charAt != '!' && charAt != ':'
                    && charAt != ';' && charAt != '?') {
                if (charAt == upperCase.charAt(i)) {
                    countUpper++;
                } else {
                    countLower++;
                }
            }
        }
        double percentUpper = (1.0 * countUpper * 100) / word.length();
        double percentLower = (1.0 * countLower * 100) / word.length();
        return percentUpper + "% uppercase letters, \n" + percentLower + "% lowercase letters";

    }

    public static String deleteDuplicateChars(String word) {
        if (word != null) {
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) == word.charAt(i - 1)) {
                    word = word.substring(0, i) + word.substring(i + 1);
                }
                for (int j = i + 1; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        word = word.substring(0, j) + word.substring(j + 1);
                    }
                }
            }
            return word;
        } else {
            return null;
        }
    }

    public static String reverseString(String inputString) {
        int stringLength = inputString.length();
        String result = "";
        for (int i = 0; i < stringLength; i++) {
            result = inputString.charAt(i) + result;
        }
        return result;
    }


    public static String insertSubstring(String input, int index, String substring) {
        if (index < 0 || index > input.length()) {
            return "Index is not valid";
        }
        return input.substring(0, index) + substring + input.substring(index);
    }

    public static String deleteSubstring(String input, String remove) {
        return input.replace(remove, "");
    }

    public static String copyPart(String input, int start, int end) {
        if (start < 0 || start >= input.length() || end < 0 || end >= input.length() || end < start) {
            return "Not valid arguments";
        }
        return input.substring(start, end + 1);
    }

    public static int size(String input) {
        if (input == null) {
            return 0;
        } else {
            return input.length();
        }
    }

    public static int countOccurrences(String input, String substring) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.startsWith(substring, i)) {
                count++;
                i = i + substring.length();
            }
        }
        return count;
    }

    public static String getWordsInReverseOrder(String words) {
        String[] arrayOfWords = words.split(" ");
        String reverseWords = "";
        for (int i = 0; i < arrayOfWords.length; i++) {
            reverseWords = arrayOfWords[i] + " " + reverseWords;
        }
        return reverseWords;
    }

    public static String replaceSpaceWithAsterisk(String words) {
        return words.replaceAll(" +", "*");
    }

    public static String replaceLettersInLongestWord(String input, String toReplace, String replace) {
        String[] arrayOfWords = input.split(" +");
        String max = "";
        int position = 0;
        for (int i = 0; i < arrayOfWords.length; i++) {
            if (arrayOfWords[i].length() > max.length()) {
                max = arrayOfWords[i];
                position = i;
            }
        }
        arrayOfWords[position] = max.replaceAll(toReplace, replace);
        return String.join(" ", arrayOfWords);
    }

    public static int lengthOfShortestWord(String input) {
        String[] arrayOfWords = input.split(" +");
        String min = arrayOfWords[0];
        for (int i = 1; i < arrayOfWords.length; i++) {
            if (arrayOfWords[i].length() < min.length()) {
                min = arrayOfWords[i];
            }
        }
        return min.length();
    }

    public static int countOfWords(String input) {
        String[] words = input.split("\\s+");
        return words.length;
    }

    public static String swapWords(String input, String swap, String toSwap) {
        if (input == null || swap == null || toSwap == null) {
            return "not valid arguments";
        }
        String[] words = input.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(swap)) {
                words[i] = toSwap;
                continue;
            }
            if (words[i].equals(toSwap)) {
                words[i] = swap;
            }
        }
        return String.join(" ", words);
    }

    public static String deleteLastWord(String input) {
        if (input == null) {
            return "not valid argument";
        }
        return input.substring(0, input.lastIndexOf(" "));
    }

    public static String addSpace(String input, int index) {
        return input.substring(0, index) + " " + input.substring(index);
    }

    public static boolean isPalindrome(String input) {
        if (input == null) return false;
        //input = input.replaceAll("[^\\w]", "");
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        String invertedText = sb.toString();

        return input.equalsIgnoreCase(invertedText);

    }

    public static String replaceSubstring(String input, String replace, String toReplace) {
        if (input == null || replace == null || toReplace == null) return "not valid argument";
        return input.replaceAll(replace, toReplace);
    }

    public static String addingIntegers(String integer1, String integer2) {
        String maxInteger = integer1.length() - integer2.length() > 0 ? integer1 : integer2;
        StringBuilder minInteger = new StringBuilder(integer1.length() - integer2.length() < 0 ? integer1 : integer2);
        int numberOfZeros = maxInteger.length() - minInteger.length();

        for (int i = 0; i < numberOfZeros; i++) {
            minInteger.insert(0, 0);
        }

        StringBuilder line = new StringBuilder("_");
        for (int i = 0; i < maxInteger.length(); i++) {
            line.append("_");
        }

        StringBuilder sb = new StringBuilder(maxInteger).append("\n").append("+").append("\n").append(minInteger)
                .append("\n").append(line).append("\n");

        boolean addOne = false;
        StringBuilder resultSum = new StringBuilder();
        for (int i = 0; i < maxInteger.length(); i++) {
            char charMax = maxInteger.charAt(maxInteger.length() - 1 - i);
            String stringMax = String.valueOf(charMax);
            int numberMax = Integer.parseInt(stringMax);

            char charMin = minInteger.charAt(minInteger.length() - 1 - i);
            String stringMin = String.valueOf(charMin);
            int numberMin = Integer.parseInt(stringMin);

            int sum = numberMax + numberMin;
            if (addOne) {
                sum++;
            }
            int rest = 0;
            if (sum >= 10) {
                rest = sum - 10;
                resultSum.insert(0, rest);
            } else {
                resultSum.insert(0, sum);
            }


            addOne = sum >= 10;

        }
        sb.append(resultSum);


        return new String(sb);
    }

    public static String deleteWordByLength(String input, int length) {
        if (input == null || length <= 0) {
            return "not valid argument";
        } else {
            String[] words = input.split(" +");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() == length) {
                    continue;
                }
                sb.append(words[i]).append(" ");
            }
            return new String(sb);
        }
    }

    public static String removeExtraSpaces(String input) {
        if (input == null) return "not valid";
        String twoSpaces = "  ";
        String oneSpace = " ";
        while (input.contains(twoSpaces)) {
            input = input.replace(twoSpaces, oneSpace);
        }
        return input;
    }

    public static String[] highlightWords(String input) {
        return input.replaceAll("[.,!?:;]+", " ").split(" +");
    }

}
