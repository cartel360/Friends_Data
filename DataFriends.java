import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DataFriends {

    //using buffered reader to take inputs from the user
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws  IOException {

        System.out.println("Enter the Numbers to take to a Party: ");
        int total_Friends = Integer.parseInt(br.readLine());

        String friends_Name[] = new String[total_Friends]; //assigning an array to store friends names
        String friends_hobbies[] = new String[total_Friends]; //assigning an array to store friends hobbies
        int friends_age[] = new int[total_Friends]; //assigning an array to store friends ages

        //for loop to iterate through the friends' details i.e name, hobby and age
        for (int i = 0; i< friends_Name.length; i++)
        {

            System.out.println("\nEnter Your Friend's Name : ");
            friends_Name[i] = br.readLine(); //saves the input in the array friends_Name
            System.out.println("Enter Your Friend's Hobby: ");
            friends_hobbies[i] = br.readLine(); //saves the input in the array friends_hobbies

            //for loop to check if age given is above 21
            int trials = 1;
            for(int j = 0; j < trials; j++)
            {
                System.out.println("Enter Your Friend's Age: ");
                int age =Integer.parseInt(br.readLine()); //allows user to input the age
                if(age >= 21) //checks if age is greater than 21
                {
                    friends_age[i] = age; //if age is greater than 21 save the given age in the array friends_age

                    break;
                }else {
                    trials++;

                }
            }

        }

        System.out.println(String.format("%50s", "FULL TABLE\n")); //heading for the full table
        System.out.println(String.format("%15s %20s %20s %20s %10s %20s", "Name", "|", "Hobby", "|", "Age", "|"));
        System.out.println(String.format("%s", "____________________________________________________________________________________________________________"));

        //for loop to iterate through the arrays and output the values in a table form
        for(int i = 0; i < friends_Name.length; i++)
        {
            System.out.println(String.format("%15s %20s %20s %20s %10d %20s" , friends_Name[i], "|", friends_hobbies[i], "|", friends_age[i], "|"));

        }


        System.out.println(String.format("\n\n%60s", "FRIENDS OLDER THAN 25\n")); //heading for friends older than 25 table
        System.out.println(String.format("%15s %20s %20s %20s %10s %20s", "Name", "|", "Hobby", "|", "Age", "|"));
        System.out.println(String.format("%s", "____________________________________________________________________________________________________________"));

        //boolean flag to test whether there's a friend available older than 25 or none

        boolean above25available=true;
        int i=0;
        do {

            if(friends_age[i]>25)
            {
                System.out.println(String.format("%15s %20s %20s %20s %10d %20s",friends_Name[i], "|", friends_hobbies[i], "|", friends_age[i], "|"));
                above25available=false;
            }
            i++;
        } while (i<friends_Name.length);

        if (above25available)
        {
            System.out.println("None of My friends are older than 25");
            return;
        }




        System.out.println(String.format("\n\n%70s", "FRIENDS YOUNGER THAN 30 AND PLAY FOOTBALL\n")); //heading for friends older than 25 table
        System.out.println(String.format("%15s %20s %20s %20s %10s %20s", "Name", "|", "Hobby", "|", "Age", "|"));
        System.out.println(String.format("%s", "____________________________________________________________________________________________________________"));

        //boolean flag to test whether a friend's hobby is football and age greater less than 30
        boolean football_friends = true;
        i =0;
        do{
            if(friends_hobbies[i].equals("football") && friends_age[i] < 30){
                System.out.println(String.format("%15s %20s %20s %20s %10d %20s",friends_Name[i], "|", friends_hobbies[i], "|", friends_age[i], "|"));
                football_friends =false;
            }
            i++;
        } while(i < friends_Name.length);

        if (football_friends){
            System.out.println("None");
        }

        //finding the average age of the friends
        float average;
        int sum = 0;
        for(i = 0; i < friends_age.length; i++) {
            sum = sum + friends_age[i];
        }
            average = (float)sum / friends_age.length;
            System.out.println("\n\nAverage Age is: " + average);

    }

}