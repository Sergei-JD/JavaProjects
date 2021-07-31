package itrex;

public class TaskOneMain {
    public static void main(String[] args) {

//        Input text as a string
        String source =
                "THE THe ThE tHE The tHe thE the a A An AN aN an all articles\n" +
                "the taeeblooEE, an ande a cacao CC Ce andE coffee, success\n" +
                        "coffee and cacao ieeiee";
        System.out.println("source text:\n" + source + "\nresult text:");

//        Divide lines into lines and simplify in a separate method
        source.lines().forEach(TaskOneMain::processLine);
    }

    private static void processLine(String line) {
//        Divide the string into words
        String[] words = line.split("[ ]|[.]|[,]|[:]|[;]|[!]|[?]");

        StringBuilder currentLineBuilder = new StringBuilder();
//        Simplify by words and add the result to the builder of the current line
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];

            currentWord = SimplifierTextUtils.fixArticle(currentWord);
            if (currentWord.length() > 0) {
                currentWord = SimplifierTextUtils.fixC(currentWord);
                currentWord = SimplifierTextUtils.fixDoubleLetters(currentWord);
                currentLineBuilder.append(SimplifierTextUtils.fixE(currentWord));
                if (i < words.length - 1) {
                    currentLineBuilder.append(" ");
                }
            }
        }
        if (currentLineBuilder.length() > 0) {
            System.out.println(currentLineBuilder);
        }
    }
}
