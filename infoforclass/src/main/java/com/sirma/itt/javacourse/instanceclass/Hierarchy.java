package com.sirma.itt.javacourse.instanceclass;

/**
 * Class which keeps the number of the workers in the firm, the name of the firm
 * and the income money.
 * 
 * @author Nikolay Ch
 * 
 */
public class Hierarchy {
	protected static int number;
	protected static String firmName;
	protected static int income;
	public boolean isFamous = false;

	public Hierarchy() {
		number = 5;
		firmName = "No name";
		income = 500;
		isFamous = false;
	}

	/**
	 * Initializes the attribtes.
	 * 
	 * @param number
	 *            the number of the workers
	 * @param name
	 *            the name of the firm
	 * @param income
	 *            the income money
	 */
	public Hierarchy(int number, String name, int income) {
		Hierarchy.number = number;
		Hierarchy.firmName = name;
		Hierarchy.income = income;
	}

	/**
	 * Calculates the payment for each worker.
	 */
	public static int calculate() {

		return income / number;

	}
}

/**
 * Interface with two methods.
 * 
 */
interface Work {

	/**
	 * Checks is the worker is useful and is not over rated .
	 * 
	 * @param work
	 *            the work he is doing for a month
	 * @param payment
	 *            the payment for month
	 * @return true if the worker is doing more than achieving
	 */
	public boolean isEconimic(int work, int payment);

	public String nameWorker();
}

class Worker extends Hierarchy implements Work {
	public int work;
	public String workerName;

	Worker() {
		super();
		work = 0;
	}

	/**
	 * Constructor for the child which calls the parent's constructor.
	 * 
	 * @param number
	 *            the number workers
	 * @param firmName
	 *            the name of the firm
	 * @param income
	 *            the income for the firm for one month
	 * @param work
	 *            the work that is done by one worker for a month
	 * @param workerName
	 *            the name of the worker
	 */
	Worker(int number, String firmName, int income, int work, String workerName) {
		super(number, firmName, income);
		this.work = work;
		this.workerName = workerName;
	}

	/**
	 * @see com.sirma.itt.javacourse.instanceclass.Work#isEconimic(int, int)
	 */
	public boolean isEconimic(int work, int payment) {
		if (payment >= work)
			return false;
		else
			return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sirma.itt.javacourse.instanceclass.Work#nameWorker()
	 */
	public String nameWorker() {
		return workerName;
	}

}