//**************************************************************************************************
// CLASS: Parenthesis (Parenthesis.java)
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
 * Parenthesis is the superclass of LeftParen and RightParen. These are treated
 * as a weird sort of Operator because we need to be able to push LeftParens on
 * the operator stack when evaluating the expression.
 */
public abstract class Parenthesis extends Operator {

    public Parenthesis() {
    }

    /**
     * Parenthesis are not really operators so return false.
     */
    @Override
    public boolean isBinaryOperator() {
        return false;
    }

}