package com.yrl.study.design.respchain;

public class Main {
	public static void main(String[] args) {
		Leader sectionChief = new SectionCheif();
		Leader minster = new Minster();
		Leader director = new Director();
		
		sectionChief.setNextLeader(minster);
		minster.setNextLeader(director);
		
		//sectionChief.process(1);
		 sectionChief.process(5);
		//sectionChief.process(8);
		
	}

}
