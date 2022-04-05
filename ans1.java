import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ans1 {

    public static void main(String[] args){
        try{
            File file = new File("pk.txt");
            File file2= new File("pk.txt");
            FileReader fr=new FileReader("pk.txt");
            boolean read=true;
            String sr=" ";
            while(read==true){
                int m =fr.read();
                if(m==-1){
                    read=false;
                    break;
                }
                char ch=(char)m;
                sr=sr+ch;
            }
            System.out.println(sr);
            fr.close();
            FileWriter write=new FileWriter(file2);
            write.append(sr);
            write.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    
}
