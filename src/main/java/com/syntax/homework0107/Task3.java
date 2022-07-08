package com.syntax.homework0107;

/*We have to calculate the average of marks obtained in three subjects by student A and in 4 subjects by student B.
 Create class 'Marks' with an abstract method 'getAverage' that will be returning the average of marks.
 Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes the
 marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Test your code
 */

abstract class Marks {
    int mark1;
    int mark2;
    int mark3;
    int mark4;

    abstract int getAverage();
}

class A extends Marks{
    A(int mark1, int mark2, int mark3){
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    @Override
    int getAverage() {
        return (mark1+mark2+mark3)/3;
    }
}

class B extends Marks{
    B(int mark1, int mark2, int mark3,int mark4){
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
    }

    @Override
    int getAverage() {
        return (mark1+mark2+mark3+mark4)/4;
    }
}

class Task3{
    public static void main(String[] args) {
        Marks[] marks = {new A(85, 49, 68), new B(96, 87, 75, 79)};
        for (Marks mark:marks){
            System.out.println(mark.getAverage());
        }
    }
}
