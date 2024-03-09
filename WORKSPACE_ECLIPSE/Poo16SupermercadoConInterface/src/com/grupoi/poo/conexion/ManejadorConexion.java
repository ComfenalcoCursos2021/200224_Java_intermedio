package com.grupoi.poo.conexion;

public class ManejadorConexion {

	public static IConexion getConexion() {
		
		MySQL conexionMysql = new MySQL();
		SqlServer conexionSqlServer = new SqlServer();
		Oracle conexionOracle = new Oracle();
		MariaDB conexionMaria = new MariaDB();
		PatitoDB conexionPatito = new PatitoDB();
		return conexionPatito;
	}
}
