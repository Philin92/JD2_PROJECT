package io.swagger.validators;

import java.util.List;
import java.util.Map;

public class Validator {

    private Map<String,List<Validatable>> rules = Map.of(
            "customerAccount", List.of(
                    new ValidationRule(),
                    new ValidationRuleMaxLength()
            )
    );

    public boolean validate(String fieldName, Object fielsValue){
        boolean result= true;
        for(Validatable validatable:rules.get(fieldName))
        {
            result &= validatable.validate(fielsValue);
        }
           return result;
    }

    interface Validatable{
        boolean validate(Object object);
    }

    class ValidationRule implements Validatable{

        @Override
        public boolean validate(Object object) {
            return object.toString().length()>0;
        }
    }

    class ValidationRuleMaxLength implements Validatable{

        @Override
        public boolean validate(Object object) {
            return object.toString().length()<10;
        }
    }
}
