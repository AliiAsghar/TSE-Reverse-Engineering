package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amui implements apak {
    UNKNOWN_RESULT_STATUS(0),
    SUCCESS_CACHE(1),
    SUCCESS(2),
    STATUS_CODE_NOT_MAPPED(3),
    GMS_ERROR(4),
    TARGET_NODE_NOT_CONNECTED(5),
    DUPLICATE_LISTENER(6),
    UNKNOWN_LISTENER(7),
    DATA_ITEM_TOO_LARGE(8),
    INVALID_TARGET_NODE(9),
    ASSET_UNAVAILABLE(10),
    DUPLICATE_CAPABILITY(11),
    UNKNOWN_CAPABILITY(12),
    WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED(13),
    UNSUPPORTED_BY_TARGET_NODE(14),
    SIGN_IN_REQUIRED(15),
    INVALID_ACCOUNT(16),
    RESOLUTION_REQUIRED(17),
    NETWORK_ERROR(18),
    INTERNAL_ERROR(19),
    DEVELOPER_ERROR(20),
    INTERRUPTED(21),
    TIMEOUT(22),
    CANCELED(23),
    API_NOT_CONNECTED(24),
    DEAD_CLIENT(25),
    REMOTE_EXCEPTION(26),
    CONNECTION_SUSPENDED_DURING_CALL(27),
    RECONNECTION_TIMED_OUT_DURING_UPDATE(28),
    RECONNECTION_TIMED_OUT(29),
    CLIENT_FAILURE(30),
    TASK_TIMEOUT(31),
    FEATURE_UNSUPPORTED(32),
    REMOTE_ERROR(33),
    REMOTE_PARSE_ERROR(34),
    REMOTE_EXECUTION_TIMEOUT(35),
    REMOTE_INVALID_PARAMETER(36),
    RESPONSE_PARSE_ERROR(37);

    public final int M;

    amui(int i) {
        this.M = i;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.M;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.M);
    }
}
