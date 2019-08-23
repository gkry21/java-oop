package com.bitcamp.services;
import com.bitcamp.domains.SubjectBean;
public class SubjectService {
		private SubjectService[] subjects;
		private int count;
		
		public SubjectService() { //void 생략
			this.subjects = new SubjectService[10]; //this 생략가능
			count++;
		}
		
}
