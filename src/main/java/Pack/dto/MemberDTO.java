package Pack.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberDTO {
	private int mid; //primary key
	private String id;
	private String password;
	private String name;
	private int age;
}