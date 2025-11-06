package pojo;

// A simple definition for a pojo.DVD.
public class DVD {
    public String name;
    public int releaseYear;
    public String director;

    public DVD(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public String toString() {
        return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
    }

    public static void main(String[] args){
        DVD[] dvdCollection = new DVD[15];
        DVD avengers = new DVD("Thor",2020, "Whatever");
        dvdCollection[7] = avengers;

        String[] fruits = {"apple","orange","pear"};
        double[] temperatures = new double[]{25.5, 26.1, 24.9};
        String[] booleans = new String[]{"true","false"};
        booleans[3] = "impossible";


        //Adding elements with loop
        int[] squareArray = new int[10];
        for (int i=0; i<10; i++){
            int square = (i * i);
            squareArray[i] = square;
            //System.out.println(String.format("element %d : sqaure is %d ",i,squareArray[i]));
        }

        // For each VALUE in the Array.
        for (int x : squareArray) {
            // Print the current value of square.
            System.out.println(x);
        }

    }
}