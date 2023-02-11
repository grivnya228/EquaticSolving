package net.absoft.mortalwombat;

public class AgeChecker {
    private int minAge;

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public boolean isUserAdult(int age)
    {
        return age>=minAge;
    }
}
