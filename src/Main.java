public class Main {

    public static void main(String[] args) {
        WordAnalyzer wordAnalyzer = new WordAnalyzer("hello");
        System.out.println("a)");
        System.out.println(wordAnalyzer.firstRepeatedCharacter());          // expected output: l
        System.out.println(wordAnalyzer.countGroupsRepeatedCharacters());   // expected output: 1
        System.out.println();

        wordAnalyzer = new WordAnalyzer("hoollaa");
        System.out.println("b)");
        System.out.println(wordAnalyzer.firstRepeatedCharacter());          // expected output: o
        System.out.println(wordAnalyzer.countGroupsRepeatedCharacters());   // expected output: 3
        System.out.println();

        wordAnalyzer = new WordAnalyzer("comprehensive");
        System.out.println("c)");
        System.out.println(wordAnalyzer.firstMultipleCharacter());          // expected output: e
        System.out.println(wordAnalyzer.firstRepeatedCharacter());          // expected output:
        System.out.println();

        wordAnalyzer = new WordAnalyzer("development");
        System.out.println("d)");
        System.out.println(wordAnalyzer.firstRepeatedCharacter());          // expected output:
        System.out.println(wordAnalyzer.countGroupsRepeatedCharacters());   // expected output: 0
        System.out.println();

        wordAnalyzer = new WordAnalyzer("mississippi!!!");
        System.out.println("e)");
        System.out.println(wordAnalyzer.firstMultipleCharacter());          // expected output: i
        System.out.println(wordAnalyzer.countGroupsRepeatedCharacters());   // expected output: 4
        System.out.println();

        wordAnalyzer = new WordAnalyzer("aabbcdaaaabb");
        System.out.println("f)");
        System.out.println(wordAnalyzer.countGroupsRepeatedCharacters());   // expected output: 4
        System.out.println(wordAnalyzer.firstRepeatedCharacter());          // expected output: a
        System.out.println(wordAnalyzer.firstMultipleCharacter());          // expected output: a
    }
}
