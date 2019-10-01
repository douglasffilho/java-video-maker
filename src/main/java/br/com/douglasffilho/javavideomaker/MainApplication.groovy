package br.com.douglasffilho.javavideomaker

import br.com.douglasffilho.javavideomaker.logger.Logger


class MainApplication {
	static Logger logger = Logger.INSTANCE(MainApplication)

	static void main(String[] args) {
		logger.logInfo('main', 'Running')



		logger.logInfo('main' , 'Stopped')
	}
}
