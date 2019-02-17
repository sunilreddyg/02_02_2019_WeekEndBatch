package variable;

public class String_Comparisions {

	public static void main(String[] args)
	{

		/*
		 * String:-->
		 * 		=> String allow set of characters to store into referral variable
		 * 		=> String is a non-primitive datatype and also called as class
		 * 		=> Because string contains set of events to validate stored
		 * 				characters behaviour.
		 */

		/*
		 * Equals:-->
		 * 		Method verify equal comparision between two strings and return
		 * 		boolean value true/false.
		 */
		String exp_text="WebDriver";
		String act_text="webdriver";
		
		boolean flag=act_text.equals(exp_text);
		System.out.println("equal comparision is => "+flag);
		
		/*
		 * EqualIgnoreCase:-->
		 * 		Method verify equalIgnorecase comparision between two strings
		 * 		and return true/false.
		 */
		boolean flag1=act_text.equalsIgnoreCase(exp_text);
		System.out.println("Equalignore case comaprision is => "+flag1);
		
		/*
		 * Contains;-->
		 * 			Method verify sub String available at main String
		 * 			and retur boolean value true/false.
		 */
		String act_result="Account 100 created successfull";
		String exp_result=" created successfull";
		
		boolean flag2=act_result.contains(exp_result);
		System.out.println("sub string available status is => "+flag2);
		
		
		/*
		 * subString:-->
		 * 		   method get substring from mainString.
		 */
		String Mobile_num="9030248855";
		String sub=Mobile_num.substring(5);
		System.out.println("last 5 digit mobile number is => "+sub);
		
		String sub1=Mobile_num.substring(2, 8);
		System.out.println("middle numbers at mobilenumber is => "+sub1);
		
		/*
		 * length:-->
		 * 			Method return characters total count with in integer
		 * 			format.
		 */
		String Account_num="154784515478545628";
		int count=Account_num.length();
		System.out.println("Account number length is => "+count);
		
		
		/*
		 * trim:-->
		 * 		Method trim extra spaces availabel at string.
		 */
		String usercode="   154    ";
		int before_trim=usercode.length();
		System.out.println("before trim string length is => "+before_trim);
		//trim extra spaces
		String newcode=usercode.trim();
		int after_trim=newcode.length();
		System.out.println("after trim string length is => "+after_trim);
		

		/*
		 * isempty:-->
		 * 		method return string empty status true/false.
		 */
		String status="";
		String status1="MQ";
		System.out.println("Status variable empty status is => "+status.isEmpty());
		System.out.println("Status1 variable empty status is => "+status1.isEmpty());
		
		
		String Ifsc="HDFC00012";
		boolean flag3=Ifsc.startsWith("HDFC");
		System.out.println("Status is => "+flag3);
		
	}

}
