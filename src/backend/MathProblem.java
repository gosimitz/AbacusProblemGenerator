package backend;

import java.util.HashSet;

public class MathProblem {
        double firstNum;
        double secondNum;
        char operator; // * / + -

    /**
     * Creates a MathProblem object with two numbers and an operator. Any character is acceptable as an operator.
     * Validate that the operator is correct for your situation in calling method.
     * @param firstNum - the first operand (x in x/y)
     * @param secondNum - the second operand (y in x/y)
     * @param operator - should be an appropriate math operator.
     */
    public MathProblem(int firstNum, int secondNum, char operator) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.operator = operator;
    }

    /**
     * Formats the problem in x+y format
     * @return a string of the problem
     */
    @Override
    public String toString() {
        return firstNum + "" + operator + "" + secondNum;
    }

    /**
     * Formats the problem in XML format //TODO: Format it properly in XML.
     * @return a representation of a math problem in XML.
     */
    public String toXMLString() {
        return "MathProblem{" +
                "firstNum=" + firstNum +
                ", secondNum=" + secondNum +
                ", operator=" + operator +
                '}';
    }
}
