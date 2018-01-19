public class Variables {
	public static void main(String[] args) {
	}

	private static void numbers() {
		// declare variable
		int myNumber;
		// initialize variable
		myNumber = 5;

		// combine declaration and initialization
		int anotherNumber = 7;

		// declare and initialize variable to another
		int thisIsAnotherNumber = myNumber;

		// when using decimals or floating point numbers start with float
		// note the 'f' suffix
		float highPrecision = 2.718281828f;

		// doubles are like float with more bytes and precision
		double morePrecision = 84.46455187;
		// you can "cast" variables as different types
		// casting a float to a double increases its precision
		double higherPrecision = (double) highPrecision;

		// casting down loses precisions and you may lose data!
		float lessPrecision = (float) morePrecision;
	}

	private static void charactersAndStrings() {
		// a char(acter) is any single symbol (i.e. like any single key on your keyboard
		// note the single quotes ('): these identify the enclosed value is a single character
		char firstChar = 'c';
		char anotherChar = 's';
		// Some characters are special and normally start with a backslash (\)
		// Even though there are 2 symbols in this variable, the \ tells the compiler to "escape" the very next character and interpret it as something else
		// in this case, we use an escape character telling text writers to create a newline (effectively pressing "return" or "enter" in a text editor
		char newlineChar = '\n';

		// Single characters are fine and all, but normally we communicate with more than one symbol at a time
		// thus we "string" characters together
		// note that the type String is an object and not simply a primitive type (like everything else)
		// But it's also a special object that can be treated as a primitive type (confused? you should be, but will fix that later on)
		String greeting = "Hello, World!"; //hey this looks familiar!
		// Strings are denoted with double quotes (")

		// Strings can also be stitched together in an operation called "concatenation" which uses the "+" symbol 
		String breakfast = "bagel";
		String lunch = "salad";
		String foodDiary = breakfast + lunch;

		// when concatenating strings with primitves (like int), the primitive automagically (not really, but details make it boring) is casted into a string too!
		String foodRequest = "I want " + 5 + breakfast + " and an OJ";
	}

	private static void booleans() {
		/*
		 * Another type of varible called the Boolean only has 2 possible values:
		 * true or false
		 */
		boolean amITrue = false;
		boolean hasDogBeenWalkedToday = true;

		/* 
		 * Later on, we'll use Booleans out the wazoo.
		 * For now, be aware they exist and they have 2 and only 2 values!
		 */
	}
}

