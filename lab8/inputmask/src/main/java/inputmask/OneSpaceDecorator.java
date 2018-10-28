

package inputmask;
public class OneSpaceDecorator implements Decorator
{

	
public String display(String value)
{
	
	System.err.println("inside onespace before:" + value);
	
    if (value.length()>4 && value.length()<9)
			value=value.substring(0,4)+" "+value.substring(4,value.length());
	else if (value.length()>=9 && value.length()<=12)
		value=value.substring(0,4)+" "+value.substring(4,8)+" "+value.substring(8,value.length());
	else if (value.length()>=13 && value.length()<=16)
		value=value.substring(0,4)+" "+value.substring(4,8)+" "+value.substring(8,12)+" "+value.substring(12,value.length());
    return value;
	//System.err.println("inside onespace after:" + value);
    
}

}