package E_41Test;


import Ex_41.FileMaster;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/*this is the line we are comparing in our testing file

        this line is for testing purposes.
 */

public class E_41AppTester {
    public static String fileInName = "src/test/java/E_41Test/TestingFile.txt";
    public static String TestString = "this line is for testing purposes.";
    public static String fileOutName = "src/test/java/E_41Test/TestFileOutput.txt";

    @Test
    public void test_file_input_grabs_file(){
        FileMaster fileReader = new FileMaster();
        assertTrue(fileReader.getFile(fileInName));

        fileReader.closeFile();



    }

    @Test
    public void test_we_read_input_files(){
        FileMaster fileReader = new FileMaster();
        fileReader.getFile(fileInName);


        assertEquals(TestString,fileReader.readLine());

        fileReader.closeFile();
    }

    @Test
    public void test_array_gets_written_to_File(){
        FileMaster fileReader = new FileMaster();
        fileReader.getFile(fileInName);
        ArrayList <String> outputArray = new ArrayList<>();
        outputArray.add("example one");
        outputArray.add("Example 2");
        assertTrue(fileReader.writeFile(outputArray,fileOutName));



    }



}
