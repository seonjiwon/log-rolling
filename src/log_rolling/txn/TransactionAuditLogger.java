package log_rolling.txn;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TransactionAuditLogger {
	private static final Logger logger = LoggerFactory.getLogger("TXN_LOGGER");

	public TransactionAuditLogger() {

	}

	public static String getTxnId() {
		return UUID.randomUUID().toString();
	}

}
