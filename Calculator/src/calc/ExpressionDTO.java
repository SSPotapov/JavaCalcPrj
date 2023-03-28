package calc;

public class ExpressionDTO {
    int firstOperand;
    int secondOperand;
    String operator;
    TypeOfExpression type;
    public ExpressionDTO(int firstOperand, int secondOperand, String operator, TypeOfExpression type){
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.operator = operator;
        this.type = type;
    }
}
