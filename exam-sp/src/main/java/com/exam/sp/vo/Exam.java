package com.exam.sp.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter	// 이 2개를 합쳐서 @Data라고 쓸 수 있음. 여기에 3개의 Annotation이 있음.
public class Exam {

	private Integer num;
	private String name;
	private Integer age;
	
}
