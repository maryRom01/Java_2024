//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean compile(String input) {
        int openCurly = 0;
        int openSquare = 0;
        int openDiamond = 0;
        int openRound = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            switch (c) {
                case '{': openCurly++; break;
                case '}': if (openCurly < 1) return false; openCurly--;break;
                case '[': openSquare++; break;
                case ']': if (openSquare < 1) return false; openSquare--; break;
                case '<': openDiamond++; break;
                case '>': if (openDiamond < 1) return false; openDiamond--; break;
                case '(': openRound++; break;
                case ')': if (openRound < 1) return false; openRound--; break;
                default:
            }
        }
        return (openCurly == 0 & openSquare == 0 & openDiamond == 0 & openRound == 0);
    }

    // [] () {} <>
    // [({})<>{}]
    public static void main(String[] args) {
        String inputValid = """
                public void soSomething(double x) {
                  [({})<>{}]
                }
                """;
        String inputInvalid = """
                public void soSomething(double x) {
                  [({})><{}]
                }
                    """;

        // do we need to consider the correct syntax of the function or only braces?
        // function() { ... } - so the first and the last curly braces should be excluded
        String inputInvalid2 = """
                public void soSomething(double x) {
                  [(}{)[]{}]
                }
                    """;
        String inputInvalid3 = """
                public void soSomething(double x) {
                  [({<{
                }
                    """;
        String inputInvalid4 = """
                public void soSomething(double x) {
                  [(]])><{}]
                }
                    """;
        boolean result1 = compile(inputValid);  // true
        boolean result2 = compile(inputInvalid);// false
        boolean result3 = compile(inputInvalid2);// ?
        boolean result4 = compile(inputInvalid3);// false
        boolean result5 = compile(inputInvalid4);// false

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}