package com.grupoi.poo.conexion;

public class ManejadorConexion {

	public static IConexion getConexion(int opcion) {
		IConexion devolver = null;
		
		if(opcion == 1) {
			devolver = new MySQL();
		} else if(opcion == 2) {
			devolver =  new SqlServer();
		} else if(opcion == 3) {
			devolver = new Oracle();
		} else if(opcion == 4) {
			devolver = new MariaDB();
		} else if(opcion == 5) {
			devolver = new PatitoDB();
		}
		
		return devolver;
		
		
		/*
		switch (opcion) {
		
		case 1: 
			return new MySQL();
		case 2: 
			return new SqlServer();
		case 3: 
			return new Oracle();
		case 4: 
			return new MariaDB();
		case 5: 
			return new PatitoDB();
			
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcion);
		}*/
		
		
		/*
		MySQL conexionMysql = new MySQL();
		SqlServer conexionSqlServer = new SqlServer();
		Oracle conexionOracle = new Oracle();
		MariaDB conexionMaria = new MariaDB();
		PatitoDB conexionPatito = new PatitoDB();
		return conexionPatito;*/
	}
}
