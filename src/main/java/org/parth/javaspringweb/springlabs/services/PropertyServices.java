package org.parth.javaspringweb.springlabs.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("PropertyServices")
public class PropertyServices {
	
	/*@Value("${threads}")
	public int threads;*/
	
	public int getTotalThreads() {
		return 10;
	}

}
