//*********************************************************************************************
//  CLASS: AddOperator (AddOperator.java)
//  
//  COURSE AND PROJECT INFO
//  CSE205 Object Oriented Programming and Data Structures, Spring Semester 2021
//  Project Number: P4
//
//  GROUP 22
//  AUTHOR 1: Elijah Palmer, Empalme2, empalme2@asu.edu
//  AUTHOR 2: Ricardo Salazar, rasalaz5, rasalaz5@asu.edu
//  AUTHOR 3: Amber Summeralls, Asummera, Asummera@asu.edu
//*********************************************************************************************

/**
 * Represents the addition operator which is a specific type of binary operator.
 */
public class AddOperator extends BinaryOperator {

    public AddOperator() {
    }

    /**
     * Returns the sum of the left-hand side operand and the right-hand side operand.
     */
    @Override
    public Operand evaluate(Operand pLhsOperand, Operand pRhsOperand) {
        return new Operand(pLhsOperand.getValue() + pRhsOperand.getValue());
    }

    /**
     * Returns the normal precedence level of this operator.
     */
    @Override
    public int precedence() {
        return 2;
    }

    /**
     * Returns the precedence level of this operator when on it is on the operator stack.
     */
    @Override
    public int stackPrecedence() {
        return 2;
    }

}