package net.absofy.DiscriminantExecutor;

public class EquationExecutor {
    int a;
    int b;
    int c;
    double x1;
    double x2;
    public double Discriminant;
    EquationExecutor(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void findDiscriminant() {
        double Discriminant = b * b - 4 * a * c;
        this.Discriminant = Discriminant;
    }

    public Object findRoots() {
        if (Discriminant == 0)
            this.x1 = this.x2 = -b / 2 * a;
        else {
            this.x1 = (-b + Math.sqrt(Discriminant)) / 2 * a;
            this.x2 = (-b - Math.sqrt(Discriminant)) / 2 * a;
        }
        return null;
    }
}
