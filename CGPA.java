import java.io.*;
import java.util.*;
public class CGPA
{     
public static void main (String args[])  
    {     
    double English, Language, Maths, Science, SocialStudy, CGPA, CGPAper ;
	Scanner sc = new Scanner (System.in);
	
    English = sc.nextDouble();  
    Maths = sc.nextDouble();
    Science = sc.nextDouble();
    SocialStudy = sc.nextDouble();
	Language = sc.nextDouble();
    CGPA = (English + Language + Maths + Science + SocialStudy)/(5.0);  
    
    System.out.println(" CGPA Percentage is:  "+CGPA);  
    }  
}  
