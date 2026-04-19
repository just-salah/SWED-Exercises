package Exercise1.Ex5;

public class Developer {

    private  String name;
    private  int    id;
    private  String mainLanguage;
    private  double salary;
    private  int    experienceYears;

    public Developer(String name, int id, String mainLanguage, double salary,int experienceYears) {
        this.setName(name);
        this.id = id;
        this.setMainLanguage(mainLanguage);
        this.experienceYears=experienceYears;
        this.setSalary(salary);}

    public String getName(){
    return name;
    }
    
    public void setName(String name){
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Name cannot be empty.");
        }
    }

    public void setSalary(double salary){
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Error: Salary must be greater than 0.");
        }
    }

    public double getSalary(){
        return salary;
    }

    public void setMainLanguage(String language){
        this.mainLanguage = language;
    }

}
