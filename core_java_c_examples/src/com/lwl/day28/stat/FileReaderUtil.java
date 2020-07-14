package com.lwl.day28.stat;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class FileReaderUtil {

	private FileReaderUtil() {

	}

	public static List<Student> loadDataFromFile(File file) throws IOException {
		List<Student> students = null;
		try {
			List<String> lines = Files.readAllLines(file.toPath());
			students = lines.stream().skip(1).map(FileReaderUtil::getStudent).collect(Collectors.toList());

		} catch (IOException e) {
			throw e;
		}
		return students;
	}

	private static Student getStudent(String line) {
		String[] data = line.split(",");
		int c = 0;
		String name = data[c++];
		String batch = data[c++];
		Status cStatus = Status.valueOf(data[c++]);
		Status pStatus = Status.valueOf(data[c++]);
		String degree = data[c++];
		float score = Float.parseFloat(data[c]);
		return new Student(name, batch, cStatus, pStatus, degree, score);

	}
}
