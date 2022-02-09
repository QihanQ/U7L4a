import java.util.ArrayList;
public class SystemLog
{
    /** Contains all the entries in this system log.
     * Guaranteed not to be null and to contain only non-null entries.
     */
    private ArrayList<LogMessage> messageList;
    /** Removes from the system log all entries whose descriptions properly contain keyword,
     * and returns a list (possibly empty) containing the removed entries.
     * Postcondition:
     * - Entries in the returned list properly contain keyword and
     * are in the order in which they appeared in the system log.
     * - The remaining entries in the system log do not properly contain keyword and
     * are in their original order.
     * - The returned list is empty if no messages properly contain keyword.
     */
    public ArrayList<LogMessage> removeMessages(String keyword)
    {
        ArrayList<LogMessage> m = new ArrayList<LogMessage>();
        for(int n = 0; n < messageList.size(); n++)
        {
            if(messageList.get(n).containsWord(keyword))
            {
                m.add(messageList.get(n));
                messageList.remove(n);
                n--;
            }
        }
        return m;
    }
// There may be instance variables, constructors, and methods that are not shown.
}