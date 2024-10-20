package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adjl {
    public final amwt a;

    public adjl(amwt amwtVar) {
        this.a = amwtVar;
    }

    public final String a() {
        switch (this.a.ordinal()) {
            case 0:
                return "INVALID_PRE_KOTO (This device is pre-Koto)";
            case 1:
                return "BUGLE_LOADING_AVAILABILITY_IN_PROGRESS (Bugle client is still loading the status)";
            case 2:
                return "DISABLED_VIA_GSERVICES (RCS is disabled for this carrier by Google)";
            case 3:
                return "DOGFOOD_SETUP_PENDING (Dogfood RCS is not set up)";
            case 4:
                return "DISABLED_FROM_PREFERENCES (You turned off RCS. Turn it back on in settings)";
            case 5:
                return "DISABLED_NOT_DEFAULT_SMS_APP (We aren't the default SMS app)";
            case 6:
                return "DISABLED_REMOTELY (The carrier disabled this device remotely)";
            case 7:
                return "AVAILABLE (RCS is setup)";
            case 8:
                return "DISABLED_OLD_RCS_SERVICE_VERSION (RCS service version is old)";
            case 9:
                return "DISABLED_SIM_ABSENT (RCS is disabled due to SIM absent)";
            case 10:
                return "CARRIER_SETUP_PENDING (Carrier RCS is not set up)";
            case 11:
                return "DISABLED_MULTI_SLOT_DEVICE (Multi sim disabled or it's not default sim)";
            case 12:
            case 25:
            default:
                return "RcsAvailability is in an invalid state " + this.a.E + "! This is a bug!";
            case 13:
                return "BUGLE_LOADING_AVAILABILITY_EXCEPTION (Bugle client threw an exception loading the status)";
            case 14:
                return "RCS is disabled because third-party RCS client is enabled";
            case 15:
                return "DISABLED_NO_PERMISSIONS (RCS is disabled because it doesn't have phone permission)";
            case 16:
                return "CARRIER_TERMS_AND_CONDITIONS_ACCEPTANCE_PENDING (Carrier RCS is setup, waiting for T&C acceptance)";
            case 17:
                return "DOGFOOD_TERMS_AND_CONDITIONS_ACCEPTANCE_PENDING (Dogfood RCS is setup, waiting for T&C acceptance)";
            case 18:
                return "DISABLED_TERMS_AND_CONDITIONS_REJECTED (RCS is disabled due to user rejection of T&Cs)";
            case 19:
                return "SUBJECT_TO_BATTERY_OPTIMIZATIONS (RCS services can't run in the background)";
            case 20:
                return "UNKNOWN_PEV2_DISABLED (PEv2 is now default. You should never see this message.)";
            case 21:
                return "DISABLED_WAITING_FOR_PHENOTYPE (Phenotype flags have not updated yet)";
            case 22:
                return "DISABLED_STUB_PROVISIONING_ENGINE (The RCS availability query was done on a stub implementation)";
            case 23:
                return "DISABLED_VIA_FLAGS";
            case 24:
                return "DISABLED_BY_EMM (RCS is disabled by IT admin)";
            case 26:
                return "DISABLED_VIA_RCS_CONFIG_CHAT_AUTH (chatAuth=0 in ServicesConfiguration). Provisioning is NOT disabled. RCS registration is disabled.";
            case 27:
                return "DISABLED_BY_PROVISIONING_RULE (RCS is disabled based on provisioning rules for this sim)";
            case 28:
                return "DISABLED_FOR_WEAR (RCS is disabled for a Wear OS device that does not support RCS)";
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                return "DISABLED_AUTOMATIC_PROVISIONING_RULE (RCS is disabled by default, user must manually enable RCS for this sim from Settings)";
        }
    }

    public final boolean b() {
        if (this.a == amwt.DISABLED_FROM_PREFERENCES) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.a == amwt.AVAILABLE) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        switch (this.a.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 11:
            case 12:
            case 14:
            case 15:
            case 18:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 27:
            case 28:
            case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                return true;
            case 3:
            case 7:
            case 10:
            case 13:
            case 16:
            case 17:
            case 19:
            case 20:
            case 26:
            default:
                return false;
        }
    }

    public final boolean e() {
        if (!d()) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof adjl) && this.a == ((adjl) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str;
        if (this.a != null) {
            str = a();
        } else {
            str = "null";
        }
        return a.bW(str, "RcsAvailability{mAvailability=", "}");
    }
}
