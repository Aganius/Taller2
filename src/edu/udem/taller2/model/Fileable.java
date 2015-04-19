package edu.udem.taller2.model;

/**
 * Interface used to detach the FileSystem and the Resource, its used to
 * implement the Prototype pattern.
 * 
 */
public interface Fileable {

	public void copy();

	public void delete();
}
