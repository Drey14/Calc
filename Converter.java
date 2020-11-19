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
            case 20:
                intRomul = intRomul + "XX";
                break;
            case 30:
                intRomul = intRomul + "XXX";
                break;
            case 40:
                intRomul = intRomul + "XL";
                break;
            case 50:
                intRomul = intRomul + "L";
                break;
            case 60:
                intRomul = intRomul + "LX";
                break;
            case 70:
                intRomul = intRomul + "LXX";
                break;
            case 80:
                intRomul = intRomul + "LXXX";
                break;
            case 90:
                intRomul = intRomul + "XC";
                break;
            case 100:
                intRomul = intRomul + "C";
                break;
            default:
                break;
        }

        if (a >= 11 && a <= 19) {
            int ost = a % 10;
            intRomul = intRomul + "X";
            ArabicToRomul.goTo(ost);
        }
        if (a >= 21 && a <= 29) {
            int ost = a % 10;
            intRomul = intRomul + "XX";
            ArabicToRomul.goTo(ost);
        }
        if (a >= 31 && a <= 39) {
            int ost = a % 10;
            intRomul = intRomul + "XXX";
            ArabicToRomul.goTo(ost);
        }
        if (a >= 41 && a <= 49) {
            int ost = a % 10;
            intRomul = intRomul + "XL";
            ArabicToRomul.goTo(ost);
        }
        if (a >= 51 && a <= 59) {
            int ost = a % 10;
            intRomul = intRomul + "L";
            ArabicToRomul.goTo(ost);
        }
        if (a >= 61 && a <= 69) {
            int ost = a % 10;
            intRomul = intRomul + "LX";
            ArabicToRomul.goTo(ost);
        }
        if (a >= 71 && a <= 79) {
            int ost = a % 10;
            intRomul = intRomul + "LXX";
            ArabicToRomul.goTo(ost);
        }
        if (a >= 81 && a <= 89) {
            int ost = a % 10;
            intRomul = intRomul + "LXXX";
            ArabicToRomul.goTo(ost);
        }
        if (a >= 91 && a <= 99) {
            int ost = a % 10;
            intRomul = intRomul + "XC";
            ArabicToRomul.goTo(ost);
        }
    }
}