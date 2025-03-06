package Basics;

// OUTER CLASS
class OuterClass {
    void prinOutertMessage() {
        System.out.println("This is an outer class.");
    }

    // INNER CLASS -> To access the InnerClass we need to create an Object of the OuterClass (if not Static)
    class InnerClass {
        void printInnerMessage() {
            System.out.println("This is the inner class.");
        }
    }
}

public class InnerClasses_Examples {
    public static void main(String[] args) {

        // Object of OuterClass
        OuterClass outerClass = new OuterClass();

        // Object of InnerClass -> Dependent on the outerClass object
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        outerClass.prinOutertMessage();
        innerClass.printInnerMessage();
    }
}
