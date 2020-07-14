package core_java_c_examples;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.lwl.day28.stat.FileReaderUtil;
import com.lwl.day28.stat.Student;

public class FileReaderUtilTest {

		@Test
		public void loadDataFromFileTest() throws IOException {
			File file = new File("resources/task_1/testdata.txt");
			List<Student> listStudents = FileReaderUtil.loadDataFromFile(file);
			assertEquals(5, listStudents.size());
		}
		
		@Test
		public void loadDataWithInvalidFileTest() {
			assertThrows(NoSuchFileException.class,()->FileReaderUtil.loadDataFromFile(new File("/hello")));
		}
		
	
}
