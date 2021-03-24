import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {
	private List<Observer> observers = new ArrayList<>();
	private String messageContent;

	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
		notifyUpdate(this);
	}

	@Override
	public void attach(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
		
	}

	@Override
	public void detach(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
		
	}

	@Override
	public void notifyUpdate(MessagePublisher msg) {
		// TODO Auto-generated method stub
		for(Observer o: observers) { 
			o.update(msg); 
			}
		
	}

}
