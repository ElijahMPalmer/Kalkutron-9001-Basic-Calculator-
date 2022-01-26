//********************************************************************************************************
// CLASS: SubOperator (SubOperator.java)
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Spring 2020
// Project Number: 4
// 
// TEAM NAME: 22
// AUTHOR 1: Elijah Palmer, Empalme2, empalme2@asu.edu 
// AUTHOR 2: Ricardo Salazar, rasalaz5, rasalaz5@asu.edu 
// AUTHOR 3: Amber Summeralls, Asummera, Asummera@asu.edu
//********************************************************************************************************

/**
 * Represents the subtraction operator which is a specific type of binary operator.
 */
/**
 * Represents the subtraction operator which is a specific type of binary
 * operator.
 */
public class SubOperator extends BinaryOperator {
	public SubOperator() {
	}

	/**
	 * This method will evaluate the function by using the left and right values and
	 * dividing them.
	 */
	@Override
	public Operand evaluate(Operand pLhsOperand, Operand pRhsOperand) {
		return new Operand(pLhsOperand.getValue() - pRhsOperand.getValue());
	}

	/**
	 * This method returns the recidence of the stack.
	 */
	@Override
	public int precedence() {
		return 2;
	}

	/**
	 * This method returns the stackPrecidence of the stack.
	 */
	@Override
	public int stackPrecedence() {
		return 2;
	}
}