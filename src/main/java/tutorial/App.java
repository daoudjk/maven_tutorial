package tutorial;

import person.Person;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person joe = new Person();

        while(joe.getHeight() < 1000)
        {
            joe.setHeight(joe.getHeight() + 1);
            System.out.println(joe.getHeight());
        }
    }
}
