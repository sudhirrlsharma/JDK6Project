package timer;
import java.util.TimerTask;

import javax.sql.DataSource;

public class ConnectionStatusTask extends TimerTask {
	private DataSource ds = null;
	
	private String testQuery = "Select sysdate from dual";
	
	private boolean isConnectionLive;
	
	public ConnectionStatusTask() {
		System.out.println("Geeting the data source ");
		ds=getDatasource();
	}

	public void run() {
		System.out.println("Executing the test " + testQuery);
		System.out.println("query executed successfully with result set");
		isConnectionLive=true;

	}

	public boolean isConnectionLive() {
		return isConnectionLive;
	}

	private synchronized DataSource getDatasource() {
		return null;
	}
}