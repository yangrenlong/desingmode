package com.yrl.study.design.respchain;

public class Minster extends Leader {

	@Override
	void process(int leave) {
		if(leave>2 && leave <7){
			System.out.println("minster is processing leave "+leave+" day");
		}else{
			System.out.println("please put this leave to director");
		}

	}

}
