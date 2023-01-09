package Pack.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BoardDTO {
	private int mid; //primary key
	private String comment;
	private String id;
}