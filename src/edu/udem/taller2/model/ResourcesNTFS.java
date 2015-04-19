package edu.udem.taller2.model;

import java.util.Date;

/**
 * Its the resource class for Windows, when the files are going to be explored
 * in the Windows operative system.
 * 
 */
public class ResourcesNTFS implements Fileable {

	protected String name;
	protected Date modificationDate;

	/* 
	 * Method used to copy a NTFS file or folder implemented from the Fileable class.
	 */
	@Override
	public void copy() {

	}

	/* 
	 * Method used to delete a NTFS file or folder implemented from the Fileable class.
	 */
	@Override
	public void delete() {

	}

}
