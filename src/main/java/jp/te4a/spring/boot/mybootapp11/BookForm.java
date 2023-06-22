package jp.te4a.spring.boot.mybootapp11;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BookForm {
	private Integer id ;
	@NotNull//タイトル必須３文字以上
	@Size(min = 3)
	@TestValid(param = "abc")
	private String title;
	@Size(min = 3, max = 20)//著者は３文字以上２０文字以内
	private String writter;
	private String publisher;
	@Min(0)//価格は0以上の数値
	private Integer price;
}