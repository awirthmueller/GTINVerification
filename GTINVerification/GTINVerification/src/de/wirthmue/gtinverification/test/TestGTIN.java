package de.wirthmue.gtinverification.test;

import de.wirthmue.gtinverification.GTIN;
import de.wirthmue.gtinverification.GTINException;

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

public class TestGTIN {

	public static void main(String [ ] args)
	{

		//075678164125
		//	
		try {
			GTIN gtin = new GTIN("5030933065710");
			System.out.println("Verified GTIN with type " + gtin.getGTINType());
			System.out.println("Checksum is " + gtin.getPos(13));
			System.out.println("Country of Origin is " + gtin.getCountryCode().getCountrCode());
		} catch (GTINException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
