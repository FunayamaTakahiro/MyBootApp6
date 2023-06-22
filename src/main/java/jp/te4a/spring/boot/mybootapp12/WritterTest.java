package jp.te4a.spring.boot.mybootapp12;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class WritterTest implements ConstraintValidator<Writter,String>{
	String ok;
	@Override
	public void initialize(Writter nv){
		ok = nv.ok(); 
		}
	@Override
	public boolean isValid(String in,ConstraintValidatorContext cxt){
		if(in == null){
			return false;
		}
		System.out.println(in.equals(ok));	//文字判定が同じの場合true,false
		return in.equals(ok);
	}
} 