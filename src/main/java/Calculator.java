public class Calculator {
    public static float calculator(float txtFOperand, float txtSOperand, char operator) {
        switch (operator) {
            case '+':
                return txtFOperand + txtSOperand;
            case '-':
                return txtFOperand - txtSOperand;
            case '*':
                return txtFOperand * txtSOperand;
            case '/':
                if(txtSOperand !=0){
                    return txtFOperand / txtSOperand;
                }else {
                    throw new RuntimeException("khong the chia cho 0");
                }
            default:
                throw new RuntimeException("Invalid operation");
        }
    }
}
