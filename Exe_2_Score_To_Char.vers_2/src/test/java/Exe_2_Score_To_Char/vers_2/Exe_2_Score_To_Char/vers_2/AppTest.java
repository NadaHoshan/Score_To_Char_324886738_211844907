package Exe_2_Score_To_Char.vers_2.Exe_2_Score_To_Char.vers_2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;;
/**
 */
public class AppTest 
{
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void exe_2_Partition_E_min() {

		String result = App.NumberToChar(50);
		String expected_result="E";
		org.junit.Assert.assertEquals(expected_result,result);
	}
	@Test
	public void exe_2_Partition_E_min_plus1() {

		String result = App.NumberToChar(51);
		String expected_result="E";
		org.junit.Assert.assertEquals(expected_result,result,result);
	}
	@Test
	public void exe_2_Partition_E_nominal() {

		String result = App.NumberToChar(55);
		String expected_result="E";
		org.junit.Assert.assertEquals(expected_result,result);
	}
	@Test
	public void exe_2_Partition_E_max() {

		String result = App.NumberToChar(59);
		String expected_result="E";
		org.junit.Assert.assertEquals(expected_result,result);
	}
	@Test
	public void exe_2_Partition_E_max_min_1(){

		String result = App.NumberToChar(58);
		String expected_result="E";
		org.junit.Assert.assertEquals(expected_result,result);

	}
}
