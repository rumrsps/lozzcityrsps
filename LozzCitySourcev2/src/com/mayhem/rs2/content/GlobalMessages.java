package com.mayhem.rs2.content;

import java.util.ArrayList;
import java.util.logging.Logger;

import com.mayhem.core.task.Task;
import com.mayhem.core.task.TaskQueue;
import com.mayhem.core.util.Utility;
import com.mayhem.rs2.entity.World;

/**
 * Handles the global messages
 * @author Daniel
 *
 */
public class GlobalMessages {
	
	/**
	 * The logger for the class
	 */
	private static Logger logger = Logger.getLogger(GlobalMessages.class.getSimpleName());

	/**
	 * The news color text
	 */
	private static String newsColor = "<col=013B4F>";

	/**
	 * The news icon
	 */
	private static String iconNumber = "<img=8>";
	
	/**
	 * Holds all the announcements in a arraylist
	 */
	public final static ArrayList<String> announcements = new ArrayList<String>();

	/**
	 * The random messages that news will send
	 */
	public static final String[] ANNOUNCEMENTS = { 
			"[Server] Be sure to ::vote and ::reward (item number) for the server ever 12 hours!",
			"[Server] Be sure to register on our ::forums and introduce yourselves!",
			"[Server] Be sure to read the ::rules of the server!",
			"[Server] Contact the Owner (Rum) if you want to donate via RS3 or OSRS GP!",
			"[Server] Contact the Owner (Rum) if you want to donate via Bitcoins or Skrill!",
			"[Server] You can do ::commands to see the list of commands you have!",
			"[Server] Found a bug? Report it on the ::forums!",
			"[Server] Have a great idea you want to share? Post it on our ::forums!",
		"[DidYouKnow?] That if you stay active and help newcomers: you will be rewarded?",
		"[DidYouKnow?] That if you report bugs: you will be rewarded?",
		"[DidYouKnow?] That if you post useful suggestions: you will be rewarded?",
		"[DidYouKnow?] That you can ::vote for LozzCity Bucks?",
		"[DidYouKnow?] That if you make Youtube videos: you will be rewarded?",
		"[Security] Staff members would never ask for your password!",
		"[Security] Make sure that you do not have the same password as other servers!",
		"[Security] Do not advertise other servers, otherwise you will be perm banned!",
		"[Server] Need help? Contact a staff member and they will help you!"
	};
	
	/**
	 * Declares all the announcements
	 */
	public static void declare() {
		for (int i = 0; i < ANNOUNCEMENTS.length; i++) {
			announcements.add(ANNOUNCEMENTS[i]);
		}
		logger.info(Utility.format(announcements.size()) + " Announcements have been loaded successfully.");
	}

	/**
	 * Initializes the task
	 */
	public static void initialize() {
		TaskQueue.queue(new Task(250, false) {
			@Override
			public void execute() {
				final String announcement = Utility.randomElement(announcements);
				World.sendGlobalMessage(iconNumber + newsColor + " " + announcement);
			}

			@Override
			public void onStop() {
			}
		});
	}
	
}
