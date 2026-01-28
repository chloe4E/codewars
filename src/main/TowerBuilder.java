/**
 * [Kata Name]
 * Difficulty: [5 kyu]
 * URL: https://www.codewars.com/kata/...
 * <p>
 * Description:
 * [Brief description]
 */

import org.apache.commons.lang3.StringUtils;
import java.util.Arrays;

public class TowerBuilder {
	public static String[] towerBuilder(int nFloors)
	{

		String [] tower = new String [nFloors];

		for( int i = 1 ; i <= nFloors ;  i++){
			StringBuilder sb = new StringBuilder();
			int space = (nFloors-i) / 2 ;
			sb.append(StringUtils.repeat(" ", space));
			sb.append(StringUtils.repeat("*", i));
			sb.append(StringUtils.repeat(" ", space));
			System.out.println(sb.toString());
			Arrays.fill(tower,i-1, i, sb.toString());
		}
		return tower;
	}
}