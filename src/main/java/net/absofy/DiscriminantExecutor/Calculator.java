package net.absofy.DiscriminantExecutor;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class Calculator {

    public Solution findRootsQuadraticEquation(int a, int b, int c) {

        EquationExecutor Equation = new EquationExecutor(a,b,c);
        Equation.findDiscriminant();
        if (Equation.Discriminant < 0)
            return  new Solution();
        else {
            Equation.findRoots();
            return new Solution(Equation.x1,Equation.x2);
        }
    }
}
