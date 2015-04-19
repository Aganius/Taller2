package edu.udem.taller2.model;

import java.util.Date;

/**
 * Its the resource class for Linux, when the files are going to be explored in
 * the Linux operative system.
 * 
 */
public class ResourcesEXT implements Fileable {

	protected String name;
	protected Date modificationDate;

	/* 
	 * Method used to copy an EXT file or folder implemented from the Fileable class.
	 */
	@Override
	public void copy() {

	}

	/* 
	 * Method used to delete an EXT file or folder implemented from the Fileable class.
	 */
	@Override
	public void delete() {

	}

}
