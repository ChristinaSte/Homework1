package homework4;


public class Task2 {
    public static void main(java.lang.String args[]) {
        romanToArabic("xxiii");
    }

    public static void romanToArabic(String romanNumber) {
        int arabic = 0;
        int lastNumber = 0;
        String romanNumeral = romanNumber.toUpperCase();

        for (int x = romanNumeral.length() - 1; x >= 0; x--) {
            char convertToarabic = romanNumeral.charAt(x);

            switch (convertToarabic) {
                case 'M':
                    arabic = processArabic(1000, lastNumber, arabic);
                    lastNumber = 1000;
                    break;

                case 'D':
                    arabic = processArabic(500, lastNumber, arabic);
                    lastNumber = 500;
                    break;

                case 'C':
                    arabic = processArabic(100, lastNumber, arabic);
                    lastNumber = 100;
                    break;

                case 'L':
                    arabic = processArabic(50, lastNumber, arabic);
                    lastNumber = 50;
                    break;

                case 'X':
                    arabic = processArabic(10, lastNumber, arabic);
                    lastNumber = 10;
                    break;

                case 'V':
                    arabic = processArabic(5, lastNumber, arabic);
                    lastNumber = 5;
                    break;

                case 'I':
                    arabic = processArabic(1, lastNumber, arabic);
                    lastNumber = 1;
                    break;
            }
        }
        System.out.println(arabic);
    }

    public static int processArabic(int arabic, int lastNumber, int lastArabic) {
        if (lastNumber > arabic) {
            return lastArabic - arabic;
        } else {
            return lastArabic + arabic;
        }
    }

}