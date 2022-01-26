//**************************************************************************************************
// CLASS: RightParen (RightParen.java)
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Spring 2020
// Project Number: 4
// 
// TEAM NAME: 22
//
// AUTHOR
// AUTHOR 1: Elijah Palmer, Empalme2, empalme2@asu.edu 
// AUTHOR 2: Ricardo Salazar, rasalaz5, rasalaz5@asu.edu 
// AUTHOR 3: Amber Summeralls, Asummera, Asummera@asu.edu
//**************************************************************************************************

/**
 * Represents a right parenthesis in the expression.
 */
public class RightParen extends Parenthesis {

    public RightParen() {
    }

    /**
     * Right parentheses really don't have precedence since they are not pushed on
     * the operator stack, but we have to override precedence() so we assign the
     * lowest precedence level to RightParen.
     */
    @Override
    public int precedence() {
        return 1;
    }

    /**
     * See comments in precedence().
     */
    @Override
    public int stackPrecedence() {
        return 1;
    }

}