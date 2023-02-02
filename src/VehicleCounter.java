import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class VehicleCounter
{

    public static Integer findNextValue( java.util.Collection vector, String indexGetter )
    {
        int nextVal = 1;
        // To be implemented the next value finding logic
        vector.getClass();

        if (indexGetter == indexGetter){
            int size = vector.size();
            nextVal = nextVal + size;
            return nextVal;

        }

        return -1;
    }

    public static void main( String[] args )
    {
        List<Vehicle> list = new ArrayList<>();
        list.add( new Vehicle( 1, "Ford" ) );
        list.add( new Vehicle( 3, "Toyota" ) );
        list.add( new Vehicle( 4, "Bently" ) );

        int nextValue = findNextValue( list, "getIndex" );
        System.out.println( nextValue );
    }

    public static class Vehicle
    {
        private int index;
        private String name;

        public Vehicle( int index, String name )
        {
            this.index = index;
            this.name = name;
        }

        public int getIndex()
        {
            return index;
        }
    }
}