package com.yrl.study.design.respchain;

public class Director extends Leader {

	@Override
	void process(int leave) {
		if(leave>7){
			System.out.println("director is processing leave "+leave+" day");
		}

	}

}
