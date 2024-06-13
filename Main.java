import java.util.ArrayList;


// import java.util.Comparator;
import java.util.List;

public class Main {
  

    public static void main(String[] args) {
        StudyGroup group3=new StudyGroup("OOS");
        StudyGroup group1=new StudyGroup("OP");
        StudyGroup group2=new StudyGroup("GroupOS");

        Stream stream1=new Stream();
        stream1.addGroup(group1);
        stream1.addGroup(group2);
        Stream stream2=new Stream();
        stream2.addGroup(group3);
        
        
    


        StreamService streamService=new StreamService();
        
        //System.out.println(streamService.toString());
      

        List<Stream> streams=new ArrayList<>();
        
       
        streams.add(stream1);
        streams.add(stream2);
        
        for (Stream stream : streams) {
            System.out.println("Stream:");
            for (StudyGroup group : stream) {
                System.out.println("- "+ group.getName());
            }
        }       
            
            
        
    }



    
}
