package com.zevinar.crypto.exchange.interfcaes;

import java.util.List;

import com.zevinar.crypto.utils.enums.CoinTypeEnum;
import com.zevinar.crypto.utils.enums.ExchangeDetailsEnum;

public interface IBaseExchangeHandler {
	
	ExchangeDetailsEnum getExchangeDetails();

	/**
	 * Transaction fee, for example for 1% return 0.01.<br>
	 * 
	 * @return
	 */
	Double getTransactionFee();

	ITransactionResult postBuy(CoinTypeEnum transactionCoinType, double wantedBuyPrice);

	List<IOpenTransaction> getOpenTransactions();

	double getCoinBalance(CoinTypeEnum coinType);
	
	double getCurrentCashUSD();

}