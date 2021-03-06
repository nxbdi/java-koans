package com.sandwich.util.io;

import org.junit.After;
import org.junit.Before;

import com.sandwich.util.io.directories.DirectoryManager;


public class FileMonitorTest {

	FileMonitor monitor;
	
	@Before
	public void createInstance() throws Exception{
		monitor = FileMonitorFactory.getInstance(DirectoryManager.getMainDir());
	}
	
	@After
	public void destroyInstance(){
		monitor.close();
	}
	
}
