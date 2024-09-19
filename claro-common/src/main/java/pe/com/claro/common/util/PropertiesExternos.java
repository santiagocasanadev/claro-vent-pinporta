package pe.com.claro.common.util;

import javax.ws.rs.core.Configuration;

public class PropertiesExternos {
	
	// datos del SP	
	public final String dbPvuNombre;
	public final String dbPvuJndi;
	public final String dbPvuOwner;
	public final String dbPvuPackage;
	public final String dbPvuSpRegTransact;	
	public final String dbPvuTimeout;	
	public final String dbPvuUsuario;
	

	// errores funcionales 
	public final String registraVcuPvuIdf0Codigo;
	public final String registraVcuPvuIdf0Mensaje;
	public final String registraVcuPvuIdf1Codigo;
	public final String registraVcuPvuIdf1Mensaje;
	public final String registraVcuPvuIdf2Codigo;
	public final String registraVcuPvuIdf2Mensaje;

	// errores tecnicos
	public final String registraVcuPvuIdt1Codigo;
	public final String registraVcuPvuIdt1Mensaje;
	public final String registraVcuPvuIdt2Codigo;
	public final String registraVcuPvuIdt2Mensaje;
	public final String registraVcuPvuIdt3Codigo;
	public final String registraVcuPvuIdt3Mensaje;
	
	// Declaracion de Valores
	public PropertiesExternos(Configuration config) {
		super();	
		
		//PVUDB
		this.dbPvuNombre=ClaroUtil.convertProp(config.getProperty("db.pvu.nombre"));
		this.dbPvuJndi=ClaroUtil.convertProp(config.getProperty("db.pvu.jndi"));
		this.dbPvuOwner=ClaroUtil.convertProp(config.getProperty("db.pvu.owner"));
		this.dbPvuPackage=ClaroUtil.convertProp(config.getProperty("db.pvu.package"));
		this.dbPvuSpRegTransact=ClaroUtil.convertProp(config.getProperty("db.pvu.sp.reg.transact"));
		this.dbPvuTimeout=ClaroUtil.convertProp(config.getProperty("db.pvu.timeout"));
		this.dbPvuUsuario=ClaroUtil.convertProp(config.getProperty("db.pvu.usuario"));
		
		//errores tecnicos
		this.registraVcuPvuIdt1Codigo=ClaroUtil.convertProp(config.getProperty("claro-vent-registravtacuota.idt1.codigo"));
		this.registraVcuPvuIdt1Mensaje=ClaroUtil.convertProp(config.getProperty("claro-vent-registravtacuota.idt1.mensaje"));
		this.registraVcuPvuIdt2Codigo=ClaroUtil.convertProp(config.getProperty("claro-vent-registravtacuota.idt2.codigo"));
		this.registraVcuPvuIdt2Mensaje=ClaroUtil.convertProp(config.getProperty("claro-vent-registravtacuota.idt2.mensaje"));
		this.registraVcuPvuIdt3Codigo=ClaroUtil.convertProp(config.getProperty("claro-vent-registravtacuota.idt3.codigo"));
		this.registraVcuPvuIdt3Mensaje=ClaroUtil.convertProp(config.getProperty("claro-vent-registravtacuota.idt3.mensaje"));
			
		//errores funcionales
		this.registraVcuPvuIdf0Codigo = ClaroUtil.convertProp(config.getProperty("claro-vent-registravtacuota.idf0.codigo"));
		this.registraVcuPvuIdf0Mensaje = ClaroUtil.convertProp(config.getProperty("claro-vent-registravtacuota.idf0.mensaje"));
		this.registraVcuPvuIdf1Codigo = ClaroUtil.convertProp(config.getProperty("claro-vent-registravtacuota.idf1.codigo"));
		this.registraVcuPvuIdf1Mensaje = ClaroUtil.convertProp(config.getProperty("claro-vent-registravtacuota.idf1.mensaje"));
		this.registraVcuPvuIdf2Codigo = ClaroUtil.convertProp(config.getProperty("claro-vent-registravtacuota.idf2.codigo"));
		this.registraVcuPvuIdf2Mensaje = ClaroUtil.convertProp(config.getProperty("claro-vent-registravtacuota.idf2.mensaje"));				
		
	}
	
}
