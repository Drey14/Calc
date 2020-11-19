package Calculator;

import java.io.*;
import java.util.*;
import java.lang.*;

public class DataEntry {
    int argument1;
    int argument2;
    private int countarab=0;
    private int countroma=0;
    char operation = '0';

    void abc() throws ExceptionCalcDobFlo,IOException,ExceptionArbRom,Exceptionoperation{
        BufferedReader bufRed = new BufferedReader(new InputStreamReader(System.in));
        String bufRedStr = bufRed.readLine();
        if (bufRedStr.contains(".") || bufRedStr.contains(",")) {
            throw new ExceptionCalcDobFlo("Исключение: вы ввели не целое число, а (float|double)");
        }
        if (bufRedStr.contains(" ") || bufRedStr.length() == 0) {
            throw new ExceptionCalcDobFlo("Вы ввели - либо пустую строку - либо в выражении пробелы");
        }
        String[] arrayArabic = {"1","2","3","4","5","6","7","8","9","10"};
        String[] arrayRomul = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        String[] arrayOperation = {"+", "-", "*", "/"};
        String[] bufRedsplit = bufRedStr.split("[+-/*]");

            if (bufRedStr.contains("+")) {
                operation='+';
            }
            if (bufRedStr.contains("-")) {
                operation='-';
            }
            if (bufRedStr.contains("*")) {
                operation='*';
            }
            if (bufRedStr.contains("/")) {
                operation='/';
            }
            if (operation == '0'){
                throw new Exceptionoperation("Знак не тот");
            }
        outloopromul:
        for (int i = 0; i <arrayRomul.length; i++) {
            if (bufRedsplit[0].equals(arrayRomul[i])){
                countroma=countroma+1;
                Converter romul = new Converter();
                romul.romulTOarabic(arrayRomul[i]);
                argument1 = romul.argument;
            }
            if (bufRedsplit[1].equals(arrayRomul[i])){
                countroma=countroma+1;
                Converter romul = new Converter();
                romul.romulTOarabic(arrayRomul[i]);
                argument2 = romul.argument;
            }
            if (countroma==2){
                Result res = new Result(argument1,argument2,operation);
                ArabicToRomul.goTo(res.calcComputing(argument1,argument2,operation));
                System.out.println(ArabicToRomul.intRomul);
                break outloopromul;
            }
        }
        outlooparabic:
        for (int i = 0; i <arrayArabic.length; i++) {

            if (bufRedsplit[0].equals(arrayArabic[i])){
                countarab=countarab+1;
                Converter arab = new Converter();
                arab.arabicStrTOarabic(arrayArabic[i]);
                argument1 = arab.argument;
            }
            if (bufRedsplit[1].equals(arrayArabic[i])){
                countarab=countarab+1;
                Converter arab = new Converter();
                arab.arabicStrTOarabic(arrayArabic[i]);
                argument2 = arab.argument;
            }
            if (countarab==2){
                Result res = new Result(argument1,argument2,operation);
                System.out.println(res.calcComputing(argument1,argument2,operation));
                break outlooparabic;
            }
        }

        if (countarab == 1 || countroma == 1){
            throw new  ExceptionArbRom(" Калькулятор умеет работать только с арабскими или римскими цифрами одновременно и числами из диапазона от 1 до 10");
        }
    }
}