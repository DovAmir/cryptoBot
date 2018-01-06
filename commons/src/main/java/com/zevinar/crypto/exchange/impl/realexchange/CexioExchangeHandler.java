package com.zevinar.crypto.exchange.impl.realexchange;

import static com.zevinar.crypto.utils.FunctionalCodeUtils.methodRunner;

import java.util.List;

import org.knowm.xchange.ExchangeFactory;
import org.knowm.xchange.currency.CurrencyPair;
import org.knowm.xchange.dto.marketdata.Trade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zevinar.crypto.exchange.impl.AbstractMarketDataExchangeHandler;
import com.zevinar.crypto.utils.enums.ExchangeEnum;

public class CexioExchangeHandler extends AbstractMarketDataExchangeHandler {
	private static final Logger LOG = LoggerFactory.getLogger(CexioExchangeHandler.class);



	public  CexioExchangeHandler()
	{
		INSTANCE= ExchangeFactory.INSTANCE.createExchange(ExchangeEnum.CEXIO.getExchangeName());
		init();
	}

	//Cex has only from tradeid or max
	@Override
	public  List<Trade> getTrades(CurrencyPair coinType, Long fromId, Long fromTime, Long toTime, Long limit)  {
		return methodRunner( () -> marketDataService.getTrades(coinType, fromId  ).getTrades());
	}



}
