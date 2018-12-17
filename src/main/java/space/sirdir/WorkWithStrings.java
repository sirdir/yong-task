package space.sirdir;

public class WorkWithStrings {

    String countCharsInARow(String stringToParse) {
        StringBuffer sb = new StringBuffer();

        int counter = 0;
        Character previousLetter = null;
        for (char letter : stringToParse.toCharArray()) {
            if (previousLetter == null) {
                previousLetter = letter;
            }

            if (letter == previousLetter) {
                counter++;
            }
            else {
                sb.append(counter);
                sb.append(previousLetter);
                previousLetter = letter;
                counter = 1;
            }
        }
        sb.append(counter);
        sb.append(previousLetter);

        return sb.toString();
    }

}
