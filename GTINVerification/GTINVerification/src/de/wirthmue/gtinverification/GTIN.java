package de.wirthmue.gtinverification;

/**
 Copyright [03/05/2014] [Andreas Wirthmüller]

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 *
 */

public class GTIN {

	public static String GTIN8="GTIN-8";
	public static String GTIN12="GTIN-12";
	public static String GTIN13="GTIN-13";
	public static String GTIN14="GTIN-14";
	
	
	private GTINCountryCode countrCode;
	
	private String GTINType;
	private int checksum;
	private int[] a = new int[13];
    
	public GTIN(String GTINstr) throws GTINException
	{
		validateGtin(GTINstr);	
		validateCountryCode();
	}
	
	private void setGTINType(String typ)
	{
		GTINType = typ;
	}
	
	public String getGTINType()
	{
		return GTINType;
	}
	
	public GTINCountryCode getCountryCode()
	{
		return countrCode;
	}
	
	
	public int getPos(int pos) throws GTINException
	{
		if (pos < 0 || pos > 13 )
		{
			throw new GTINException("Pos number " + pos + " out of range - must be [0-13]");
		}
		else if (pos <13)
		{
			return a[pos];
		}
		else
		{
			return checksum;
		}
	}
	
	public int getChecksum()
	{
		return checksum;
	}
	
	private void setChecksum()
	{
		checksum = calculateCheckSum();
	}
	
	private void validateCountryCode() throws GTINException
	{
		String cCode = "" + a[1] + a[2] + a[3];
		countrCode = new GTINCountryCode(cCode);
	}
	
	private boolean validateGtin(String code) throws GTINException
	{
		try
		{    // is not numeric
			Long.parseLong(code); 
	    }
	    catch(NumberFormatException nfe)  
	    {  
	      // not numeric then false
	      throw new GTINException(code + " is not numeric");
	    } 
	    // pad with zeros to lengthen to 14 digits
	    switch (code.length())
	    {
	        case 8:
	            code = "000000" + code;
	            setGTINType(GTIN8);
	            break;
	        case 12:
	            code = "00" + code;
	            setGTINType(GTIN12);
	            break;
	        case 13:
	            code = "0" + code;
	            setGTINType(GTIN13);
	            break;
	        case 14:
	        	setGTINType(GTIN14);
	            break;
	        default:
	            throw new GTINException(code + " does not have correct length");
	    }
	    // calculate and store single digits
	    for (int i=0;i<13;i++)
	    {
	    	a[i] = Integer.parseInt(code.substring(i,i+1));
	    }
	    int last = Integer.parseInt(code.substring(13,14));
	    
	    // calculate checksum
	    checksum = calculateCheckSum();
	    if (last != checksum)
	    {
	    	throw new GTINException(code + " does not have correct checksum - expected " + checksum + " and found " + last);	    	
	    }
	    return true;
	}
	
	/**
	 * private routine to calculate checksum from give numbers / positions
	 * @return checkSum
	 */
	private int calculateCheckSum()
	{
	    int sum = (a[0] * 3) + a[1] + (a[2] * 3) + a[3] + (a[4] * 3) + 
	    		   a[5] + (a[6] * 3) + a[7] + (a[8] * 3) + a[9] + 
	    		   (a[10] * 3) + a[11] + (a[12] * 3);
	    int check = (10 - (sum % 10)) % 10;
		return check;		
	}
	
}
