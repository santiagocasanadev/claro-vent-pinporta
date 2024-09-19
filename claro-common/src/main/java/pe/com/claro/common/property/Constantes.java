package pe.com.claro.common.property;

public class Constantes {

	// 1.Constantes Generales de Servicio 
	public static final String NOMBRERECURSO = "claro-vent-registravtacuota";
	public static final String SEPARADORPUNTO = ".";
	public static final String VERSION = "1.0.0";
	public static final String PATH = "/vent/claro-vent-registravtacuota/v1.0.0";
	public static final String BASEPATH = "claro-vent-registravtacuota-resource/api";
	public static final String RESOURCE = "/registrarvtacuota";
	public static final String DESCRIPCIONRESOURCE = "insertar datos de una venta de chip a un sol o pack a 9 soles";
	public static final String CHARSETUTF8 = ";charset=UTF-8";

	public static final String ERROREX = "[$ex]";
	public static final String ERROR = "[ERROR]: ";

	public static final String NOMBREMETODO = "registrarvtacuota";
	public static final String PATHMETODO1 = "/registrarvtacuota";
	public static final String DESCRIPCIONMETODO1 = "insertar los datos de una venta de chip a un sol o pack a 9 soles";


	// 4.Constantes palabras claves
	public static final String MENSAJE = "mensaje";
	public static final String CODIGO = "codigo";
	public static final String NOMBRESP = "$nombre_SP";
	public static final String NOMBREJNDI = "$nombre_JNDI";
	public static final String RESPUESTA = "RESPUESTA: ";
	public static final String VALUE = "] value = [";
	public final static String FIN_METODO = "[ FIN de metodo ";
	public final static String TIEMPO_TOTAL = " ] Tiempo total de proceso (ms):";
	public final static String MILISEG = " milisegundos.";	
	public final static String TIEMPOTOTALPROCESO = "Tiempo TOTAL del proceso";
	public static final String DEVOLVERRESPONSE = " Response a devolver:";
	public static final String TEXTOOWNER = " OWNER : ";
	public static final String TEXTOPAQUETE = " PAQUETE : ";
	public static final String TEXTOPROCEDURE = " PROCEDURE : ";
	public static final String TEXTONOMBREBD = " BASE DE DATOS : ";
    public static final String TEXTOUSUARIO = " USUARIO : ";
	public static final String TEXTOESPACIO = " ";
	public static final String TEXTOVACIO = "";
	public static final String CONSULTAINICIO = " Consulta Inicio : ";
	public static final String METODOINICIO = " Inicio Metodo: ";
	public static final String CALL = "call ";
	public static final String DATAAUDIT = "dataAudit";
	public static final String TEXTOERRORTIMEOUT = "[Error De TimeOut en: ";
	public static final String TEXTOERRORDISPONIBILIDAD = "[Error De Disponibilidad en ] ";
	public static final String PARAMINPUT = " PARAMETROS [INPUT]: ";
    public static final String PARAMOUTPUT = " PARAMETROS [OUTPUT]: ";
    public static final String MENSAJERROR = "[ERROR]: ";
    public static final String ACTIVIDAD1 = "------- 1.insertar los datos de una venta de chip a un sol o pack a 9 soles------------";
    public static final String VALIDACIONPARAMETROSCORRECTOS = " Validacion correcta de parametros de entrada";
    public static final String VALIDACIONPARAMETROSINCORRECTOS = " Parametros de entrada no cumple validacion";
    public static final String PROPERTIESEXTERNOS = ".properties";
    public static final String SQLTIMEOUTEXCEPTION = "SQLTIMEOUTEXCEPTION";
    public static final String SEPARADOR = "-----------------------------------------------------------------------------";
    public static final String MILISEGUND = " milisegundos";
    
	//UTIL
    public static final String CONNECT_TIMEOUT = "com.sun.xml.ws.connect.timeout";
    public static final String REQUEST_TIMEOUT = "com.sun.xml.ws.request.timeout";
	public static final String ID = "id";
	public final static String VERSION_HTTP = "Version-HTTP";
	public final static String HEADER_PARAM_ID_TRANSACCION = "idTransaccion";
	public final static String HEADER_PARAM_MSG_ID = "msgid";
	public static final String IGUAL = "=";
	public static final String TEXTO_VACIO = "";
	public static final String USERID = "userId";
	public static final String IDTRANSACCION = "idTransaccion";
	public static final String MSGID = "msgid";
	public static final String USRID = "userId";
	public static final String TIMESTAMP = "timestamp";
	public static final String ACCEPT = "accept";
	public static final String API = "api";
	public static final String SWAGGERJAXRSCONFIG = "SwaggerJaxrsConfig";
	public static final String URLSWAGGERJAXRSCONFIG = "/SwaggerJaxrsConfig";
	public static final String HTML5CORSFILTER = "HTML5CorsFilter";
	public static final String URLPATTERNS = "/api/*";
    public static final String ACCESSCONTROLALLOWORIGIN = "Access-Control-Allow-Origin";
    public static final String ACCESSCONTROLALLOWMETHODS = "Access-Control-Allow-Methods";
    public static final String ACCESSCONTROLALLOWHEADERS = "Access-Control-Allow-Headers";
    public static final String ASTERISCO = "*";
    public static final String METODOSPERMITIDOS = "GET, POST, DELETE, PUT";
    public static final String CONTENTTYPE = "Content-Type";
    public static final String PROPERTIESKEY = "claro.properties";
    public static final String DEFAULTENCONDIGPROPERTIES = null;
    public static final String DEFAULTENCONDINGAPI = null;
	public static final String VALOR = "valor";
	public static final String ERROR_EXCEPTION = "Error Exception: ";
	public static final String ERROREXCEPTION = "Error [Exception]";
	public static final String CONFIGPROPERTIES = "config.properties";
	public static final String UNO = "1";
    public static final String DOS = "2";
    public static final String CINCO = "5";
    public static final String ZERO = "0";
    public static final int MENOS_UNO =-1;
    public static final int CERO =0;	
	public static final int NUM_ZERO =0;
	public static final String COMPONENTE = "$componente";

	// 5.Constantes caracteres claves
	public static final String CHAR_PARENTESIS_IZQUIERDO = "(";
	public static final String CHAR_PARENTESIS_DERECHO = ")";
	public static final String CHAR_CORCHETE_IZQUIERDO = " [";
	public static final String CHAR_CORCHETE_DERECHO = "] ";
	public static final String CHAR_CORCHETE_PUNTOS = ": [";
	public static final String CHAR_INTERROGACION = "?";
	public static final String CHAR_COMA = ",";
	public static final String ID_TXT = " idTx=";
	public static final String FORMATOFECHACABECERA = "yyyy-MM-dd'T'HH:mm:ss'Z'";
	public static final String FORMATO_FECHA_DEFAULT = "dd/MM/yyyy HH:mm:ss";
	public static final String FORMATO_FECHA_SP = "yyyy-MM-dd HH:mm:ss";
	public static final String FORMATO_FECHA_Z = "yyyy-MM-dd'T'HH:mm:ss+00:00";
	public static final String FORMATO_FECHA_DD_MM_YYYY = "dd/MM/yyyy";
	public static final String FORMATOFECHAISO = "yyyy-MM-dd'T'HH:mm:ss";
	public static final String BUSCARPIPELINE = "\\|";
	public static final String DOSPUNTOS = ":";
	public static final String PUNTOCOMA = ";";
	public static final String NULL=null;
}