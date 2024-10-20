package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum acok {
    UNKNOWN,
    NETWORK_UNAVAILABLE,
    NETWORK_ERROR,
    NETWORK_CHANGE,
    CONNECTIVITY_CHANGE,
    ERROR_RESPONSE,
    TIMEOUT,
    LOW_BATTERY,
    RECONFIGURATION_REQUIRED,
    SHUTDOWN,
    PHONE_ACCOUNT_REGISTRATION_FAILED,
    NO_LONGER_SIM_CALL_MANAGER,
    DISABLED,
    REREGISTRATION_REQUIRED,
    WIFI_CALLING_PREFERENCE_CHANGE,
    IMS_CALLING_NOT_ALLOWED,
    IMS_SERVICE_DISPATCHER_STOPPED,
    CANCELED,
    ACTIVE_MEDIA_NETWORK_INTERFACE_CHANGE,
    VPN_SETUP,
    VPN_TEARDOWN,
    FCM_TICKLE_KEEP_ALIVE,
    DEBUG_OPTIONS_FORCED_UNREGISTER,
    SIM_REMOVED,
    NO_RETRY_NO_DEREGISTER_FOR_TEST;

    public static acok a(int i) {
        if (i >= 0 && i <= values().length - 1) {
            return values()[i];
        }
        return UNKNOWN;
    }

    public final boolean b() {
        if (this != NETWORK_ERROR && this != NETWORK_UNAVAILABLE) {
            return false;
        }
        return true;
    }
}
