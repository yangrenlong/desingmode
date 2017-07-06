package com.yrl.study.design.respchain;

public class SectionCheif extends Leader{

	@Override
	void process(int leave) {
		if(leave > 2){
			if(this.nextLeader!=null){
				this.nextLeader.process(leave);
			}
		}else{
			System.out.println("section chief is processing leave "+leave+" day");
		}
		
	}

}
