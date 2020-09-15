import java.awt.Frame;
import java.awt.event.WindowEvent;

public class AddressBook
{
    public static void main(String[] args)
    {
		FileSystem fileSystem=new FileSystem();

		AddressBookController controller=new AddressBookController(fileSystem);

		AddressBookGUI gui=new AddressBookGUI(controller, new AddressBook());

		gui.show();
    }
    public static void quitApplication()
    {
		Frame [] openWindows = Frame.getFrames();
		for (int i = 0; i < openWindows.length; i ++)
		{
			if (openWindows[i] instanceof AddressBookGUI)
			{
				openWindows[i].dispatchEvent(new WindowEvent(
								 openWindows[i],
								 WindowEvent.WINDOW_CLOSING));
 				if (openWindows[i].isShowing())
                    return;
			}
		}

		System.exit(0);
	}
}
