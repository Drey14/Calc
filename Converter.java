package Calculator;

public class Converter {
    int argument;

    void romulTOarabic(String a) {
        switch (a) {
            case "I":
                argument = 1;
                break;
            case "II":
                argument = 2;
                break;
            case "III":
                argument = 3;
                break;
            case "IV":
                argument = 4;
                break;
            case "V":
                argument = 5;
                break;
            case "VI":
                argument = 6;
                break;
            case "VII":
                argument = 7;
                break;
            case "VIII":
                argument = 8;
                break;
            case "IX":
                argument = 9;
                break;
            case "X":
                argument = 10;
                break;
            default:
                System.out.println("Конвертация римских чисел в арабские не произошла");
        }
    }
        void arabicStrTOarabic(String a) {
            switch (a) {
                case "1":
                    argument = 1;
                    break;
                case "2":
                    argument = 2;
                    break;
                case "3":
                    argument = 3;
                    break;
                case "4":
                    argument = 4;
                    break;
                case "5":
                    argument = 5;
                    break;
                case "6":
                    argument = 6;
                    break;
                case "7":
                    argument = 7;
                    break;
                case "8":
                    argument = 8;
                    break;
                case "9":
                    argument = 9;
                    break;
                case "10":
                    argument = 10;
                    break;
                default:
                    System.out.println("Конвертация строки арабских чисел в арабские цифры не произошла");
            }
        }
}

class ArabicToRomul {
    static String intRomul = "";
    static void goTo(int a) {
        switch (a) {
            case 1:
                intRomul = intRomul + "I";
                break;
            case 2:
                intRomul = intRomul + "II";
                break;
            case 3:
                intRomul = intRomul + "III";
                break;
            case 4:
                intRomul = intRomul + "IV";
                break;
            case 5:
                intRomul = intRomul + "V";
                break;
            case 6:
                intRomul = intRomul + "VI";
                break;
            case 7:
                intRomul = intRomul + "VII";
                break;
            case 8:
                intRomul = intRomul + "VIII";
                break;
            case 9:
                intRomul = intRomul + "IX";
                break;
            case 10:
                intRomul = intRomul + "X";
                break;
            case 50:
                intRomul = intRomul + "L";
                break;
            case 100:
                intRomul = intRomul + "C";
                break;
            default:
                break;
        }


        if (a >= 11 && a <= 49) {
            int cel = a / 10;
            int ost = a % 10;
            for (int i = 0; i < cel; i++) {
                intRomul = intRomul + "X";
            }
            ArabicToRomul.goTo(ost);
        }
        if (a >= 51 && a <= 99) {
            System.out.println("99");
            int cel = a / 10;
            int ost = a % 10;
            for (int i = 0; i < cel; i++) {
                intRomul = intRomul + "L";
            }
            ArabicToRomul.goTo(ost);
        }
    }
}