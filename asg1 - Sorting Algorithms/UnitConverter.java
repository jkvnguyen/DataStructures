/**	This utility class facilitates conversion from metric units to
 *	imperial units.
 */
public class UnitConverter
{
	/** Represents the number of centimetres in an inch. */
	public static final double CM_PER_INCH = 2.54;
	
	// Include additional constants here as needed.
	// Use the one above as a guide.
	;
	
	
	// This line prevents clients from instantiating the class.
	private UnitConverter() {}
	
	
	/**	Converts the passed value in centimetres to the corresponding
	 *	length in inches.
	 *	
	 *	@param cm A length in centimetres.
	 *	@return The passed length in inches.
	 */
	public static double cmToInches(double cm)
	{
		double result = cm / CM_PER_INCH;
		return result;
	}
	
	
	/**	Converts the passed value of kg to pounds
	 *	@param kg a weight in kg
	 * @return a weight in pounds
	 */
	public static double kgToPounds(double kg)
	{
		// Your code goes here.
		;
		return 0;
	}
	
	
	/**	Write a description here.
	 *	Use the method above as a guide.	
	 */
	public static double cToFahrenheit(double c)
	{
		// Your code goes here.
		;
		return 0;
	}
}