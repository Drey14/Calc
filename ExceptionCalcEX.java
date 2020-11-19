package Calculator;

public class ExceptionCalcEX extends Exception {
    ExceptionCalcEX(String s){
        super(s);
    }
}

class ExceptionCalcNum extends ExceptionCalcEX {
    ExceptionCalcNum(String s){
        super(s);
    }
}

class ExceptionCalcDobFlo extends ExceptionCalcEX {
    ExceptionCalcDobFlo(String s){
        super(s);
    }

}
class ExceptionArbRom extends ExceptionCalcEX {
    ExceptionArbRom(String s) {
        super(s);
    }
}

class Exceptionoperation extends ExceptionCalcEX {
    Exceptionoperation(String s) {
        super(s);
    }
}