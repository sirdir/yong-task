package space.sirdir;

public class WorkWithString {

    String countCharsInARow(String stringToParse) {
        StringBuilder sb = new StringBuilder();

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

        if (previousLetter != null) {
            sb.append(counter);
            sb.append(previousLetter);
        }

        return sb.toString();
    }

}
