package org.azkfw.workflow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	/** Logger */
	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Application.class);
		// application.setWebEnvironment(false);

		LOGGER.debug("Initialize start");
		ApplicationContext context = application.run();
		LOGGER.debug("Initialize end");

		Application app = context.getBean(Application.class);
		app.run();

		SpringApplication.exit(context);
		LOGGER.debug("end2");
	}

	public void run() {
		try {

			while (true) {
				Thread.sleep(1000);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
