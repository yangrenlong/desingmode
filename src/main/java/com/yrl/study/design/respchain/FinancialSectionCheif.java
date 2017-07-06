package com.yrl.study.design.respchain;

public class FinancialSectionCheif extends Leader{

	@Override
	void process(int leave) {
	       System.out.println("FinancialSectionCheif is approval");
	       if(this.nextLeader!=null){
	    	   this.nextLeader.process(leave);
	       }
	}

}
