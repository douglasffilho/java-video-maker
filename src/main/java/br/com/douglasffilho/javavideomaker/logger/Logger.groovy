package br.com.douglasffilho.javavideomaker.logger

import groovy.util.logging.Slf4j

import static java.text.MessageFormat.format

@Slf4j
class Logger {

    private static final String messageTemplate = "Class={0}, Method={1}, Message={2}"

    private String className

    private Logger(String className) {
        this.className = className
    }

    static Logger INSTANCE(Class caller) {
        return new Logger(caller.simpleName)
    }

    void logInfo(String methodName, String info) {
        String message = format(messageTemplate, className, methodName, info)
        log.info(message)
    }

    void logDebug(String methodName, String debug) {
        String message = format(messageTemplate, className, methodName, debug)
        log.debug(message)
    }

    void logWarn(String methodName, String warn) {
        String message = format(messageTemplate, className, methodName, warn)
        log.warn(message)
    }

    void logError(String methodName, String error) {
        String message = format(messageTemplate, className, methodName, error)
        log.error(message)
    }

}
