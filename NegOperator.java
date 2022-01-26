//*********************************************************************************************
//  CLASS: NegOperator (NegOperator.java)
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
 * Represents the negation operator which is a specific type of unary operator.
 */
/**
 * Represents the negation operator which is a specific type of unary operator.
 */
public class NegOperator extends UnaryOperator {
    /**
     * Returns negative operand
     */
    @Override
    public Operand evaluate(Operand pOperand) {
        return new Operand(-pOperand.getValue());
    }

    /**
     * Returns precedence of an integer
     */
    @Override
    public int precedence() {

        return 4;
    }

    /**
     * Returns stack precedence of an integer
     */
    @Override
    public int stackPrecedence() {

        return 4;
    }
}