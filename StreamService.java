import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamService {
    
    
        @SuppressWarnings("unchecked")
        public void sortStreams(List<Stream> streams){
        streams.sort( (Comparator<? super Stream>) new StreamComparator());
    
    }

        
}
