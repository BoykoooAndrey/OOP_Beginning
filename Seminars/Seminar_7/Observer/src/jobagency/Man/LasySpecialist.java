package jobagency.Man;

public class LasySpecialist implements Observer {
    private String name;
    private int salary = 0;

    public LasySpecialist(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary != 0) {
            System.out.println(String.format("LasySpecialist %s: I completely enjoy of my new job. I don't need any offers! = %s, %d", name, nameCompany, salary));
        }
        else{
            this.salary = salary;
            System.out.println("I get my first and last job");
        }
    }
    
}
