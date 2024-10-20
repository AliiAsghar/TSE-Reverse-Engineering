package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum apkj implements apak {
    EVENT_TYPE_UNKNOWN(0),
    REGISTRATION_EVENT(1),
    CALL_EVENT(2),
    PROVISIONING_EVENT(3),
    SIP_EVENT(4),
    MEDIA_EVENT(5),
    ADS_EVENT(6),
    NETWORK_STATUS_CHANGE_EVENT(7),
    SESSION_EVENT(8),
    IMSSTATE_EVENT(9),
    SOCKET_EVENT(10),
    ANOMALY_EVENT(11),
    UNEXPECTED_SIP_MESSAGE_EVENT(12),
    ENRICHED_CALLING_EVENT(13),
    TELEPHONY_EVENT(14),
    REGISTRATION_SWITCH_EVENT(15),
    RCS_UPTIME_EVENT(16),
    DIAGNOSTIC_EVENT(17),
    SELF_SERVICE_MESSAGE_EVENT(18),
    UNKNOWN_REGISTRATION_FAILURE_REASON_EVENT(19),
    RCS_PROVISIONING_DETAILS(20),
    INCOMING_RPC_EVENT(21),
    MSRP_EVENT(22),
    EVENT_HUB_EVENT(23),
    IMS_SERVICE_SESSION_EVENT(24),
    FILE_TRANSFER_EVENT(25),
    JIBE_SERVICE_EVENT(26),
    SINGLE_REGISTRATION_API_CALL_EVENT(27),
    UNEXPECTED_EVENT(28),
    XSL_REQUEST_EVENT(29),
    DROIDGUARD_EVENT(30);

    public final int F;

    apkj(int i) {
        this.F = i;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.F;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.F);
    }
}
