import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        LogMessage message = new LogMessage("Webserver:disk offline");
        System.out.println(message.getDescription());
        System.out.println(message.getMachineId());
        System.out.println(message.containsWord("disk"));
        System.out.println(message.containsWord("Disk"));
        System.out.println(message.containsWord("offline"));
        System.out.println("---");


            ArrayList<LogMessage> m = new ArrayList<LogMessage>();
            m.add(new LogMessage("Webserver:disk offline"));
            m.add(new LogMessage("SERVER1:file not found"));
            m.add(new LogMessage("SERVER2:read error on disk DSK1"));
            ArrayList<LogMessage> a = new ArrayList<LogMessage>();
            for(int n = 0; n < m.size(); n++)
            {
                if(m.get(n).containsWord("disk"))
                {
                    a.add(m.get(n));
                    m.remove(n);
                    n--;
                }
            }
            for(LogMessage l : a)
            {
                System.out.println(l.getMachineId() + ":" + l.getDescription());
            }
    }
}
