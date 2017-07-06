package com.yrl.study.design.respchain;

public class FinancialDirector extends Leader {

	@Override
	void process(int leave) {
		if(leave>7){
			System.out.println("FinancialDirector am approval ");
		}

	}

}
