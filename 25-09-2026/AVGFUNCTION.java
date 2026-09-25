import java.util.*;
class Main
{
    private final Map<String, Integer> subjectMarks=new HashMap<>();
    public void inputData()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for 6 subjects:");
        for(int i=1;i<=6;i++)
            {
            System.out.print("Enter name for subject "+i+": ");
            String subject=scanner.nextLine();
            System.out.print("Enter marks for "+subject+": ");
            int mark=scanner.nextInt();
            scanner.nextLine();            
            subjectMarks.put(subject, mark);
        }
        scanner.close();
    }
    private int sum()
    {
        int total=0;
        for(int mark:subjectMarks.values())
        {
            total+=mark;
        }
        return total;
    }
    private int average()
    {
        if(subjectMarks.isEmpty()) return 0;
        return sum()/subjectMarks.size();
    }
    private Map<String, Integer> map()
    {
        return subjectMarks;
    }
    public static void main(String[] args)
    {
        Main obj=new Main();
        System.out.println("\nFunction Starts");
        obj.inputData();
        System.out.println("\nStarts Calculation");
        int avg=obj.average();
        System.out.println("Average Marks: "+avg);
        System.out.println("Function Ends");
    }
}
