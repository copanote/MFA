package WorkerThread;

public class WorkerThread extends Thread {
	private final Channel channel;
	public WorkerThread(String name, Channel channel) {
		super();
		this.channel = channel;
	}
	
	public void run() {
		while(true) {
			Request request = channel.takeRequest();
			request.execute();
		}
	}

}
