//*********************************************************************************************
//  CLASS: Operand (Operand.java)
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
 * An operand is a numeric value represented as a Double.
 */

public class Operand extends Token {

    private Double mValue;

    /**
     * This method will set the operand when called.
     */
    public Operand(Double pValue) {

        setValue(pValue);
    }

    public Double getValue() {
        /**
         * This method will return the mValue when called.
         */
        return mValue;
    }

    /**
     * This method will set the mValue when called.
     */
    public void setValue(Double pValue) {

        mValue = pValue;
    }
}