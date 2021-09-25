package validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

// the class of the buisness logic 
@Constraint(validatedBy = CourseCodeConstraintValidator.class)
//how long my custom validation will be stored and where it should be applied 
@Retention(RUNTIME)
// to what my custom validation will be applied (method , field ,....)
@Target({ FIELD, METHOD })
public @interface CourceCode {
	
	// here  am defining method for the value i need to make and default for 
	// it in case it had not be sit
	public String value() default "luv" ;
	// this method to set my error message and i put default also 
	public String message () default " your course name  should start with luv";
	
	// defind the group for constraint
	public Class <?> [] groups ()default {};
	
	// define payload to get more information about the validation failure 
	// it usally used to carry the meta data from the validator
	
	public Class <? extends Payload > []payload () default {} ;
 	

}
