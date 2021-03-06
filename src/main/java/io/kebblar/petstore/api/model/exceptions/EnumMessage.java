package io.kebblar.petstore.api.model.exceptions;

public enum EnumMessage {

    BAD_CREDENTIALS(
            1001,
            "Credenciales erróneas",
            "Su clave o su usuario (o ambos) no corresponden a un usuario válido",
            HttpStatus.BAD_REQUEST),

    BITCOIN_TRANSACTION(
            1002,
            "Transaccion de BTC fallida",
            "La transacción no pudo ser llevada a cabo",
            HttpStatus.BAD_REQUEST),

    BLOCKED_USER(
            1003,
            "Usuario bloqueado",
            "Bloqueo de seguridad por %d minutos y %d segundos",
            HttpStatus.BAD_REQUEST),

    MAX_FAILED_LOGIN_EXCEPTION(
            1004,
            "Usuario bloqueado",
            "El usuario ha sdo bloqueado por exceder el máximo número (%d) de intentos fallidos al sistema",
            HttpStatus.BAD_REQUEST),

    DATABASE(
            901,
            "Error en la base de datos",
            "Consulte a su adimistrador. ID: %s",
            HttpStatus.INTERNAL_SERVER_ERROR),

    DISABLED_USER(
            1005,
            "El usuario está deshabilitado",
            "Consulte a su administrador",
            HttpStatus.BAD_REQUEST),

    FILE_UPLOAD(
            902,
            "Error en la carga de archivos al sistema",
            "El archivo %S no pudo ser cargado",
            HttpStatus.BAD_REQUEST),

    GOOGLE_CAPTCHA(
            1006,
            "Captcha Incorrecto",
            "El captcha proporcionado no corresponde con el presentado",
            HttpStatus.BAD_REQUEST),

    INTERNAL_SERVER(
            903,
            "Error Interno",
            "Info: $s",
            HttpStatus.INTERNAL_SERVER_ERROR),

    SEND_MAIL(
            1007,
            "Envío de correo fallido",
            "Ha ocurrido un error al enviar un correo",
            HttpStatus.BAD_REQUEST),

    MAPPER_CALL(
            904,
            "Consulte con su administrador",
            "Detalle: %s",
            HttpStatus.INTERNAL_SERVER_ERROR),

    NOT_FOUND(
            1008,
            "Recurso no encontrado",
            "El recurso %s no pudo ser encontrado",
            HttpStatus.NOT_FOUND),

    PROCESS_PDF(
            905,
            "Error al procesar el pdf",
            "El pdf %s no pudo ser procesado",
            HttpStatus.BAD_REQUEST),

    STRENGTH_PASSWORD_VALIDATOR(
            1009,
            "Error al validar la fortalez del password",
            "El password no cumplió con las características requeridas: %s",
            HttpStatus.NOT_ACCEPTABLE),

    TOKEN_EXPIRED(
            1010,
            "Token Expirado",
            "El token proporcionado ya no es válido y ha expirado",
            HttpStatus.FORBIDDEN),

    TOKEN_INVALID_STRUCTURE(
            801,
            "Estructura inválida del Token",
            "El token proporcionado no posee una estructura válida: %s",
            HttpStatus.FORBIDDEN),

    TOKEN_NOT_EXIST(
            1011,
            "Token inexistente",
            "El token referido no existe",
            HttpStatus.UNAUTHORIZED),

//    TRANSACTION(
//            1012,
//            "Error en la transacción",
//            "La transacción no pudo ser procesada correctamente.",
//            HttpStatus.INTERNAL_SERVER_ERROR),
    // OJO: HACER UNA EXCEPCIÓN DEDICADA A ESTE RUBRO  !!!!!!!!!!!

    UPLOAD_FILE(
            906,
            "Error al cargar un archivo",
            "El archivo %s no pudo ser cargado",
            HttpStatus.BAD_REQUEST),

    USER_ALREADY_EXISTS(
            1013,
            "Usuario existente",
            "El usuario %s ya existe en el sistema",
            HttpStatus.BAD_REQUEST),

    USER_NOT_EXIST(
            1014,
            "Usuario inexistente",
            "No ha sido posible encontrar al usuario %s en la base de datos",
            HttpStatus.BAD_REQUEST),

    WAIT_LOGIN(
            1015,
            "Usuario bloqueado",
            "Tiempo de espera para eliminar el bloqueo %d minutos %d segundos",
            HttpStatus.UNAUTHORIZED),

    ISSUER_NOT_VERIFIED(
            1016,
            "Issuer no verificado",
            "No ha sido posible verificar al issuer del presente token",
            HttpStatus.UNAUTHORIZED),

    WRONG_TOKEN(
            1017,
            "Token erróneo",
            "El token proporcionado es erróneo",
            HttpStatus.UNAUTHORIZED);

/** ************************************************************ **/
/** ************************************************************ **/
/** ************************************************************ **/
/** ************************************************************ **/

    private int exceptionNumber;
    private String shortMessage;
    private String detailedMessage;
    private HttpStatus httpStatus;

    EnumMessage(
            int exceptionNumber,
            String shortMessage,
            String detailedMessage,
            HttpStatus httpStatus) {
        this.exceptionNumber = exceptionNumber;
        this.shortMessage = shortMessage;
        this.detailedMessage = detailedMessage;
        this.httpStatus = httpStatus;
    }

    public int getExceptionNumber() {
        return this.exceptionNumber;
    }
    public String getShortMessage() {
        return this.shortMessage;
    }
    public String getDetailedMessage() {
        return this.detailedMessage;
    }
    public HttpStatus getHttpStatus() {
        return this.httpStatus;
    }
}
