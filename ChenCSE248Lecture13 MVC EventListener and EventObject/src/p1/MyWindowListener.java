package p1;

import java.util.EventListener;

public interface MyWindowListener extends EventListener {
	public void buttonClicked(MyWindowEvent1 ev);

	public void buttonClicked(MyWindowEvent2 eve);
}
