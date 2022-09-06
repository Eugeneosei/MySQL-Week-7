package projects;

import java.sql.Connection;

import projects.dao.DbConnection;


public class ProjectsApp {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = DbConnection.getConnection();
		
	}

}
