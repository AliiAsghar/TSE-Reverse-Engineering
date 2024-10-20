package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aphg implements apak {
    TRIGGER_UNKNOWN(0),
    TRIGGER_SINGLE_REGISTRATION_CAPABILITY_UPDATE_INTENT(1),
    TRIGGER_PHENOTYPE_FLAG_UPDATE(2),
    TRIGGER_CALLBACK_REMOVED_BY_PLATFORM(3),
    TRIGGER_SYSTEM_BINDING_ON_CREATE(4),
    TRIGGER_APP_START(5),
    TRIGGER_CONFIGURATION_NOT_VALID(6),
    TRIGGER_MOBILE_CONFIGURATION_UPDATE(7),
    TRIGGER_ON_RCS_AVAILABILITY_UPDATE_FROM_DISABLED(8),
    TRIGGER_ON_RCS_SETTING_DISABLED_FROM_PREFERENCES(9),
    TRIGGER_FI_ACTIVATION_COMPLETE(10);

    public final int l;

    aphg(int i) {
        this.l = i;
    }

    public static aphg b(int i) {
        switch (i) {
            case 0:
                return TRIGGER_UNKNOWN;
            case 1:
                return TRIGGER_SINGLE_REGISTRATION_CAPABILITY_UPDATE_INTENT;
            case 2:
                return TRIGGER_PHENOTYPE_FLAG_UPDATE;
            case 3:
                return TRIGGER_CALLBACK_REMOVED_BY_PLATFORM;
            case 4:
                return TRIGGER_SYSTEM_BINDING_ON_CREATE;
            case 5:
                return TRIGGER_APP_START;
            case 6:
                return TRIGGER_CONFIGURATION_NOT_VALID;
            case 7:
                return TRIGGER_MOBILE_CONFIGURATION_UPDATE;
            case 8:
                return TRIGGER_ON_RCS_AVAILABILITY_UPDATE_FROM_DISABLED;
            case 9:
                return TRIGGER_ON_RCS_SETTING_DISABLED_FROM_PREFERENCES;
            case 10:
                return TRIGGER_FI_ACTIVATION_COMPLETE;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
