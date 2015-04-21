package edu.udem.taller2.model;

public abstract class FactoryResources {
	
	public FolderAbstract createFolder() {
		return null;
		
	}
	
	public FileAbstract createFile() {
		return null;
		
	}
	
	/**
	 * This method returns a FactoryResources factory = new EXTFactory() or FactoryResources factory = new NTFSFactory()
	 * depending on the file system format.
	 */
	public FactoryResources getFactory() {
		
		return null;
		
	}	

}
