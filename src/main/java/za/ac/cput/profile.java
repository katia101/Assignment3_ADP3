package za.ac.cput;

/**
 * Name: Mandisa Msongelwa
 * Student No.: 217149073
 * Lecturer: Mr. Arinze Anikwue
 */

public class profile {
    private String name;
    private String surname;
    private String clanName;
    private int age;

    public profile(String name, String surname, String clanName, int age)
    {
     this.name = name;
     this.surname = surname;
     this.clanName = clanName;
     this.age = age;
    }

    public profile()
    {

    }

    public profile(String name)
    {

    }

    public profile(int age)
    {

    }

    //Encapsulation
    //Getters
    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public String getClanName()
    {
        return clanName;
    }

    public int getAge()
    {
        return age;
    }

    //Setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public void setClanName(String clanName)
    {
        this.clanName = clanName;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Profile {" + "Name: " + name + "Surname: " + surname +
                "Clan Name: " + clanName + "Age: " + age + "}";
    }


}
