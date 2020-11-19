package Calculator;

import javax.imageio.IIOException;
import java.io.IOException;

public class Calculator {
    public static void main(String[] args) {
        DataEntry calc = new DataEntry();
        try {
            calc.abc();
        }catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (ExceptionCalcDobFlo e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (ExceptionArbRom e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (Exceptionoperation e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            System.out.println("");
        }
    }
}
