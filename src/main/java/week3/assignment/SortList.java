package week3.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
public static void main(String args[])
{

	List<String> company=new ArrayList<String>();
	company.add("HCL");
	company.add("Aspire Systems");
	company.add("CTS");
	Collections.sort(company);
	Collections.reverse(company);
	System.out.println(company);
}

}
