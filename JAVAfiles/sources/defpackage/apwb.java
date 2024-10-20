package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apwb implements apam {
    private final /* synthetic */ int v;
    public static final apam u = new apwb(20);
    public static final apam t = new apwb(19);
    public static final apam s = new apwb(18);
    public static final apam r = new apwb(17);
    public static final apam q = new apwb(16);
    public static final apam p = new apwb(15);
    public static final apam o = new apwb(14);
    public static final apam n = new apwb(13);
    public static final apam m = new apwb(12);
    public static final apam l = new apwb(11);
    public static final apam k = new apwb(10);
    public static final apam j = new apwb(9);
    public static final apam i = new apwb(8);
    public static final apam h = new apwb(7);
    public static final apam g = new apwb(6);
    public static final apam f = new apwb(5);
    public static final apam e = new apwb(4);
    public static final apam d = new apwb(3);
    public static final apam c = new apwb(2);
    public static final apam b = new apwb(1);
    static final apam a = new apwb(0);

    private apwb(int i2) {
        this.v = i2;
    }

    @Override // defpackage.apam
    public final boolean a(int i2) {
        apak apakVar = null;
        switch (this.v) {
            case 0:
                switch (i2) {
                    case 0:
                        apakVar = apwc.NOT_SET;
                        break;
                    case 1:
                        apakVar = apwc.CPS_APP_PROCESS_GLOBAL_PROVIDER;
                        break;
                    case 2:
                        apakVar = apwc.NON_CPS_APP_PROCESS_GLOBAL_PROVIDER;
                        break;
                    case 3:
                        apakVar = apwc.LOGGER_OVERRIDE_PROVIDER;
                        break;
                    case 4:
                        apakVar = apwc.LOGGER_DEFERRING_PROVIDER;
                        break;
                    case 5:
                        apakVar = apwc.EVENT_OVERRIDE;
                        break;
                    case 6:
                        apakVar = apwc.EVENT_DEFERRING;
                        break;
                    case 7:
                        apakVar = apwc.LOG_SOURCE_MAPPED;
                        break;
                    case 8:
                        apakVar = apwc.SERVER_INFRASTRUCTURE;
                        break;
                    case 9:
                        apakVar = apwc.LOG_REQUEST_SETTER_WEB;
                        break;
                    case 10:
                        apakVar = apwc.PRIVACY_CONTEXT_RESOLVER;
                        break;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 1:
                if (apwa.b(i2) == null) {
                    return false;
                }
                return true;
            case 2:
                if (apwm.b(i2) == null) {
                    return false;
                }
                return true;
            case 3:
                if (aqax.b(i2) == null) {
                    return false;
                }
                return true;
            case 4:
                if (a.aT(i2) == 0) {
                    return false;
                }
                return true;
            case 5:
                if (aqas.g(i2) == 0) {
                    return false;
                }
                return true;
            case 6:
                if (aqay.b(i2) == null) {
                    return false;
                }
                return true;
            case 7:
                if (a.T(i2) == 0) {
                    return false;
                }
                return true;
            case 8:
                if (aqaz.b(i2) == null) {
                    return false;
                }
                return true;
            case 9:
                if (a.aL(i2) == 0) {
                    return false;
                }
                return true;
            case 10:
                if (aqbc.b(i2) == null) {
                    return false;
                }
                return true;
            case 11:
                return a.bk(i2);
            case 12:
                if (arsd.as(i2) == 0) {
                    return false;
                }
                return true;
            case 13:
                if (ashd.b(i2) == null) {
                    return false;
                }
                return true;
            case 14:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                apakVar = asho.IN_INITIAL_SYNC;
                            }
                        } else {
                            apakVar = asho.ENABLED;
                        }
                    } else {
                        apakVar = asho.NOT_ENABLED;
                    }
                } else {
                    apakVar = asho.UNKNOWN_CLOUD_SYNC_STATUS;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 15:
                return a.be(i2);
            case 16:
                return a.bh(i2);
            case 17:
                return a.bc(i2);
            case 18:
                if (arsd.ar(i2) == 0) {
                    return false;
                }
                return true;
            case 19:
                if (asic.b(i2) == null) {
                    return false;
                }
                return true;
            default:
                return a.aW(i2);
        }
    }
}
