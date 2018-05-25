package com.s24.tomcat;

import java.io.CharArrayWriter;
import java.util.logging.Logger;

import org.apache.catalina.valves.AbstractAccessLogValve;

/**
 * A access log valve logging the configured access log on to a log4j logger and
 * not into a logfile.
 */
public class Log4jAccessLogValve extends AbstractAccessLogValve {

	public Log4jAccessLogValve(String pattern) {
		super();

		setPattern(pattern);
	}

	// hard coded logger name for now
	private final Logger ACCESS_LOG = Logger.getLogger("tomcat.access_log");

	@Override
	protected void log(CharArrayWriter message) {
		ACCESS_LOG.info(message.toString());
	}

}
