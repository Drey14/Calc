package Calculator;

public class Result {
    int arg1,arg2;
    char operation;
    int sum;
    Result(int arg1, int arg2, char operation){
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.operation = operation;
    }

    int calcComputing(int arg1, int arg2, char operation){
        switch (operation) {
            case '+':
                sum = arg1 + arg2;
                break;
            case '-':
                sum = arg1 - arg2;
                break;
            case '*':
                sum = arg1 * arg2;
                break;
            case '/':
                sum = arg1 / arg2;
                break;
            default:
                System.out.println("Вычисление не выполнено!");
                break;
        }
        return sum;
    }
}
