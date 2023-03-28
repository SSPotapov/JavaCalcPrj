package calc; //+
public class Calc {
      public static String calc(ExpressionDTO expression) throws CustomException {
        int res = switch (expression.operator) {
            case "+" -> expression.firstOperand + expression.secondOperand;
            case "-" -> expression.firstOperand - expression.secondOperand;
            case "*" -> expression.firstOperand * expression.secondOperand;
            case "/" -> (int) (expression.firstOperand / expression.secondOperand);
            default -> 0;
        };
        if (expression.type == TypeOfExpression.ARABIC) { //Если использованы арабские цифры - возвращаем результат
            return Integer.toString(res);
        } else if (res <= 0) { //Если использованы римские цифры, то результат - только положительный
            throw new CustomException("т.к. в римской системе нет отрицательных чисел");
        } else {
            //Преводим результат в римские цифры и возвращаем
            return Convert.arabicToRoman(res);
        }
    }
}
