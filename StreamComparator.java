import java.util.Comparator;

public class StreamComparator {
    //private int quantity;

    
        public int compare(Stream stream1, Stream stream2){
        
        int quantityGroup1=stream1.quantity();
        int quantityGroup2=stream2.quantity();

        
        return Integer.compare(quantityGroup1, quantityGroup2);
    }
    
}
