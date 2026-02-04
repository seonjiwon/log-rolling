package log_rolling.txn;

public class TxnLog {
    private String txnId;          // UUID
    private String username;       // 이미 넣었다고 했으니 OK
    private long amount;           // 랜덤
    private String accountMasked;  // 12****34
    private String result;         // SUCCESS / FAIL
    private String errorCode;      // 실패 시만 값
    private long timestamp;        // System.currentTimeMillis()

}
