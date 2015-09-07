package org.nitpro.exception;

import java.util.List;

public interface DAO {
	public List getMessages() throws DAOException;
}
