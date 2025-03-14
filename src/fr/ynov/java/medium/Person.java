package fr.ynov.java.medium;

import java.time.LocalDate;
import java.time.Period;

enum nationality {
    DEFAULT,
    FRANCE,
    USA,
    JAPAN,
}

    // Class Person
public class Person {
        private String name;
        private LocalDate birthDate;
        private String gender;
        private float height;
        private float weight;
        private nationality nationality;


        // Constructor Person
        public Person(String name, LocalDate birthdate, String gender, float height, float weight, nationality nationality) {
            this.name = name;
            this.birthDate = birthdate;
            this.gender = gender;
            this.height = height;
            this.weight = weight;
            this.nationality = nationality;
        }

        // Calculate age based on birthDate
        public int getAge() {
            return Period.between(birthDate, LocalDate.now()).getYears();
        }

        // Méthode displayInfos
        public void displayInfos(){
            System.out.println("Name: " + name);
            System.out.println("Age: " + this.getAge());
            System.out.println("Gender: " + gender);
            System.out.println("Height: " + height);
            System.out.println("Weight: " + weight);
            System.out.println("Nationality: " + nationality);
        }

        // Méthode toString
        public String toString() {
            return "Name: " + name +
                    "\n Age: " + this.getAge() +
                    "\n Gender: " + gender +
                    "\n Height: " + height +
                    "\n Weight: " + weight +
                    "\n Nationality: " + nationality;
        }

        public static void main(String[] args) {
            Person person = new Person(
                    "John",
                    LocalDate.of(1990, 8, 9),
                    "Male",
                    1.96f,
                    120.0f,
                    fr.ynov.java.medium.nationality.FRANCE);
            System.out.println(person);
        }
    }






