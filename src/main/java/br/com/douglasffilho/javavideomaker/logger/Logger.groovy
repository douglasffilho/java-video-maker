package br.com.douglasffilho.javavideomaker.logger

import groovy.util.logging.Slf4j

import static java.text.MessageFormat.format

@Slf4j
class Logger {

    private static final String messageTemplate = "Class={0}, Method={1}, Message={2}"

    static void logInfo(String className, String methodName, String info) {
        String message = format(messageTemplate, className, methodName, info)
        log.info(message)
    }

    static void logDebug(String className, String methodName, String debug) {
        String message = format(messageTemplate, className, methodName, debug)
        log.debug(message)
    }

    static void logWarn(String className, String methodName, String warn) {
        String message = format(messageTemplate, className, methodName, warn)
        log.warn(message)
    }

    static void logError(String className, String methodName, String error) {
        String message = format(messageTemplate, className, methodName, error)
        log.error(message)
    }

}
