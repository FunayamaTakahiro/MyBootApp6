package jp.te4a.spring.boot.mybootapp8;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBean {
	Integer id;
	String title;
	String writter;
	String publisher;
	Integer price;
}
