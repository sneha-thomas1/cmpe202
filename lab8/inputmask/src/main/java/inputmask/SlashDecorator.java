

package inputmask;
public class SlashDecorator implements Decorator
{
	
	
public String display(String value)
{
	
    if (value.length()>2)
			value=value.substring(0,2)+"/"+value.substring(2,value.length());
    return value;
}
}