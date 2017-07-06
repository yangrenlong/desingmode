package com.yrl.study.design.respchain;

public class FinancialMinster extends Leader {

	@Override
	void process(int leave) {
       System.out.println("FinancialMinster is approval");
       if(this.nextLeader!=null){
    	   this.nextLeader.process(leave);
       }

	}

}
