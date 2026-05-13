public class DogYearsConvert
{
    public static void main(String[] args)
    {
        int myBday;
        int dogBday;
        
        myBday = 2009;
        dogBday = 2018;
        
        int myAgeHuman;
        int dogAgeDog;
        int dogAgeHuman;
        int myAgeDog;
        
        myAgeHuman = 2023 - myBday;
        dogAgeHuman = 2023 - dogBday;
        myAgeDog = myAgeHuman * 7;
        dogAgeDog = dogAgeHuman * 7;
        
        System.out.println("I am " + myAgeHuman + " years old.");
        System.out.println("In dog years, I am " + myAgeDog + " years old.");
        System.out.println("My dog is " + dogAgeHuman + " years old.");
        System.out.println("In dog years, my dog is " + dogAgeDog + " years old.");
    }
}