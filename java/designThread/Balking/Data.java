package Balking;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Data {
	private final String filename;
	private String content;
	private boolean changed;
	
	public Data(String filename, String content) {
		this.filename = filename;
		this.content = content;
		this.changed = true;
	}
	
	//데이터의 내용을 수정한다.
	public synchronized void change(String newContent) {
		this.content = newContent;
		this.changed = true;
	}
	
	public synchronized void save() throws IOException {
		if(!changed) {
			return;
		}
		doSave();
		changed = false;
	}
	//데이터의 내용을 실제로 파일에 저장한다.
	private void doSave() throws IOException {
		System.out.println(Thread.currentThread().getName() + " calls doSave, content = " + content);
		Writer writer = new FileWriter(filename);
		writer.write(content);
		writer.close();
	}
	
	

}
