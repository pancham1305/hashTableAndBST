
public class main {

    public static void main(String[] args) {
        WordManagementAnalyzer analyzer = new WordManagementAnalyzer();

        String paragraph = "Paranoids are not paranoid because they are paranoid " +
                "but because they keep putting themselves deliberately " +
                "into paranoid avoidable situations";

        analyzer.analyzeFrequency(paragraph);

        System.out.println("Original Paragraph Frequencies:");
        analyzer.printWordFrequencies();

        String modifiedParagraph = analyzer.removeWord(paragraph, "avoidable");

        System.out.println("\nAfter Removing 'avoidable':");
        analyzer.analyzeFrequency(modifiedParagraph);

        analyzer.printWordFrequencies();

        System.out.println("\nModified Paragraph:");
        System.out.println(modifiedParagraph);
    }
}