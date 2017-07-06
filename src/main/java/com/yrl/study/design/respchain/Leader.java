package com.yrl.study.design.respchain;

public abstract class Leader {
	public Leader nextLeader;

	abstract void process(int leave);
	/**
	 * @param nextLeader
	 *the nextLeader to set
	 */
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}

}
