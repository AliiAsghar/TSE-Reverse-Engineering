package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum rse {
    SETTING_NOTIFICATION_ENABLED,
    SETTING_NOTIFICATION_SOUND_URI,
    SETTING_NOTIFICATION_VIBRATION,
    SETTING_NOTIFICATION,
    SETTING_APP_SETTINGS,
    SETTING_XMS_MODE,
    SETTING_SECURITY_KEY,
    SETTING_BLOCKED,
    SETTING_PRIVACY_POLICY,
    SETTING_TERMS_OF_SERVICE,
    SETTING_LEARN_MORE_BUSINESS_MESSAGING,
    SETTING_SPAM_REPORTING;

    public static alog a() {
        alob alobVar = new alob();
        alobVar.h(SETTING_NOTIFICATION);
        if (!kpt.a()) {
            alobVar.h(SETTING_APP_SETTINGS);
        }
        alobVar.i(SETTING_XMS_MODE, SETTING_BLOCKED, SETTING_SECURITY_KEY, SETTING_SPAM_REPORTING);
        return alobVar.g();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    public static boolean b(rse rseVar) {
        switch (rseVar) {
            case SETTING_NOTIFICATION_ENABLED:
            case SETTING_NOTIFICATION_SOUND_URI:
            case SETTING_NOTIFICATION_VIBRATION:
            case SETTING_NOTIFICATION:
            case SETTING_APP_SETTINGS:
                return true;
            case SETTING_XMS_MODE:
            default:
                xyl.c("ConversationSettingsItemData.isRbmGeneralSetting invalid setting: ".concat(String.valueOf(String.valueOf(rseVar))));
            case SETTING_SECURITY_KEY:
            case SETTING_BLOCKED:
            case SETTING_PRIVACY_POLICY:
            case SETTING_TERMS_OF_SERVICE:
            case SETTING_LEARN_MORE_BUSINESS_MESSAGING:
            case SETTING_SPAM_REPORTING:
                return false;
        }
    }
}
