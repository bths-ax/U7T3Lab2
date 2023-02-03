import java.util.ArrayList;

public class Delimiters
{
	/** The open and close delimiters **/
	private String openDel;
	private String closeDel;

	/** Constructs a Delimiters object where open is the open delimiter and close is the
	 *  close delimiter.
	 *  Precondition: open and close are non-empty strings.
	 */
	public Delimiters(String open, String close)
	{
		openDel = open;
		closeDel = close;
	}

	/** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
	public ArrayList<String> getDelimitersList(String[] tokens)
	{
		ArrayList<String> dels = new ArrayList<String>();
		for (String token : tokens)
			if (token.equals(openDel) || token.equals(closeDel))
				dels.add(token);
		return dels;
	}

	/** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
	 *  Precondition: delimiters contains only valid open and close delimiters.
	 */
	public boolean isBalanced(ArrayList<String> delimiters)
	{
		int state = 0;
		for (String del : delimiters) {
			if (del.equals(openDel)) state++;
			else if (del.equals(closeDel)) state--;
			if (state < 0) return false;
		}
		return state == 0;
	}

}
