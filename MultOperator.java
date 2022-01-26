//*********************************************************************************************
//  CLASS: MultOperator (MultOperator.java)
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
 * Represents the multiplication operator which is a specific type of binary
 * operator.
 */
public class MultOperator extends BinaryOperator {
    /**
     * Constructor
     */
    public MultOperator() {
    }

    /**
     * 
     * Evaluates multiplication expression with left hand side operand and right
     * hand side operand.
     * 
     */
    @Override
    public Operand evaluate(Operand pLhsOperand, Operand pRhsOperand) {
        return new Operand(pLhsOperand.getValue() * pRhsOperand.getValue());
    }

    /**
     * Returns precedence of Multiplication
     */
    @Override
    public int precedence() {
        return 3;
    }

    /**
     * Returns stack precedence of Multiplication
     */
    @Override
    public int stackPrecedence() {
        return 3;
    }
}