package seminar6;

public class Cats {
    int id, age, weight;
    String name, breed, color;
    boolean gender;
    

    @Override
    public String toString() {
        return String.format("id: %d, name: %s, breed: %s, color: %s, age: %d, gender: %b, w: %d", id, name, breed, color, age, gender, weight);        
    }
    

    public Cats(int id, String name, String breed, String color, int age, boolean gender, int weight) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }
    

    public String toString2(int number) {
        String temp = this.gender ? "male" : "female";
        return "Cat's id: " + number + "\n" +
        "Name: " + name + "\n" +
        "Gender: " + gender + "\n" +
        "Breed: " + breed + "\n" +
        "Colour: " + color + "\n" +
        "Sterilized: " + temp + "\n" +
        "Weight: " + weight + "\n" +
        "Age: " + age + "\n";
    }


    public boolean gender() {
        return this.gender;
    }

    
    public static StringBuilder getCatGender(Cats [] cats, boolean gender) {
        StringBuilder res = new StringBuilder();
        for (Cats c : cats) {
            if (c.gender == gender) {
                res.append(c.name + "\n");
            }
        }
        return res;
    }
}
