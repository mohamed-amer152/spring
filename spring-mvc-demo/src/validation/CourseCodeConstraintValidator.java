package validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements 
               ConstraintValidator<CourceCode, String>       
{
	
	private String prefix ;
	@Override 
	public void initialize(CourceCode courcecode )
	{
		prefix = courcecode.value();
	}
	

	@Override
	public boolean isValid(String thecode, ConstraintValidatorContext context) {

		// not here the field 'thecode' is the input from the customer 
		boolean result = true  ;
		if (thecode!=null) {
			result = thecode.startsWith(prefix);
		} else {
              result = true ;
		}
		
		
		return result;
	}

}
