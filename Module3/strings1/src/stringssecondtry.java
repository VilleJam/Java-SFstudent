public class stringssecondtry {
        public static void main(String[] args) {
            System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));
        }

        private static String removeWhiteSpaces(String str) {
            String stroka = str.replace(" ", "");
            return stroka;
        }
    }
