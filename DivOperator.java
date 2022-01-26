/**
 * CLASS: DivOperator (DivOperator.java)
 * 
 * COURSE AND PROJECT INFO
 * CSE205 Object Oriented Programming and Data Structures, Spring Semester 2021
 * GROUP 22
 * AUTHOR 1: Elijah Palmer, Empalme2, empalme2@asu.edu
 * AUTHOR 2: Ricardo Salazar, rasalaz5, rasalaz5@asu.edu
 * AUTHOR 3: Amber Summeralls, Asummera, Asummera@asu.edu
 */

/**
 * Represents the division operator which is a specific type of binary operator.
 */
public class DivOperator extends BinaryOperator{
    /**
    * Constructor
    */
    public DivOperator() {
    }
    /**
    * Evaluates a Division expression with the
    * left hand side and right hand side operands
    */
    @Override
    public Operand evaluate(Operand pLhsOperand, Operand pRhsOperand) {
        return new Operand(pLhsOperand.getValue() / pRhsOperand.getValue());
    }
    /**
    * Returns the precedence of Division
    */
    @Override
    public int precedence() {
        return 3;
    }
    /**
    * Returns the stack precedence of Division
    */
    @Override
    public int stackPrecedence() {
        return 3;
    }
}