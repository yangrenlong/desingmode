package com.yrl.study.design.respchain;

public abstract class FinanceLeader {
	public FinanceLeader nextLeader;

	abstract void process(int leave);
	/**
	 * @param nextLeader
	 *the nextLeader to set
	 */
	public void setNextLeader(FinanceLeader nextLeader) {
		this.nextLeader = nextLeader;
	}

}
