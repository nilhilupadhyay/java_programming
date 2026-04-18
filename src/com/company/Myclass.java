package com.company;
import java.util.*;
public class Myclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rrt[] rt = new rrt[4];
        for (int i = 0; i < rt.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            String e = sc.nextLine();
            rt[i] = new rrt(a, b, c, d, e);
        }
        String check = sc.nextLine();
        rrt ans = getHighestPriorityTicket(rt, check);
        if (ans != null) {
            System.out.println(ans.getNo());
            System.out.println(ans.getRaisedBy());
            System.out.println(ans.getAssignedTo());
        }
        else {
            System.out.println("No match foundś");
        }


    }

    public static rrt getHighestPriorityTicket(rrt[] rt, String check) {

        rrt result = null;

        for (int i = 0; i < rt.length; i++) {
            if (rt[i].getProject().equalsIgnoreCase(check)){
                if (result==null || rt[i].getPriority()< result.getPriority()) {
                    result =rt[i];

                }
            }

        }




        return result;
    }
}

class rrt{
    private int no, priority;
    private String raisedBy, assignedTo, project;

    public rrt(int no, String raisedBy, String assignedTo, int priority, String project){
        this.no = no;
        this.raisedBy= raisedBy;
        this.assignedTo= assignedTo;
        this.priority= priority;
        this.project=project;





    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setRaisedBy(String raisedBy) {
        this.raisedBy = raisedBy;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public int getNo() {
        return no;
    }

    public String getRaisedBy() {
        return raisedBy;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public int getPriority() {
        return priority;
    }

    public String getProject() {
        return project;
    }
}