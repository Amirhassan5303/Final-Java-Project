import java.time.LocalDate;
public class Person {
    private String name;
    private String lastName;
    private long nationalId;
    private LocalDate birthDate;

    public String getName(){
        return name;
    }

    public String getLastName(){
        return lastName;
    }

    public long getNationalId(){
        return nationalId;
    }

    public LocalDate getBirthDate(){
        return birthDate;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setNationalId(int nationalId){
        this.nationalId = nationalId;
    }

    public void setBirthDate(LocalDate birthDate){
        this.birthDate = birthDate;
    }

}
