package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amna implements apam {
    private final /* synthetic */ int v;
    public static final apam u = new amna(20);
    public static final apam t = new amna(19);
    public static final apam s = new amna(18);
    public static final apam r = new amna(17);
    public static final apam q = new amna(16);
    public static final apam p = new amna(15);
    static final apam o = new amna(14);
    static final apam n = new amna(13);
    static final apam m = new amna(12);
    static final apam l = new amna(11);
    static final apam k = new amna(10);
    static final apam j = new amna(9);
    static final apam i = new amna(8);
    static final apam h = new amna(7);
    static final apam g = new amna(6);
    static final apam f = new amna(5);
    static final apam e = new amna(4);
    static final apam d = new amna(3);
    static final apam c = new amna(2);
    static final apam b = new amna(1);
    static final apam a = new amna(0);

    private amna(int i2) {
        this.v = i2;
    }

    @Override // defpackage.apam
    public final boolean a(int i2) {
        apak apakVar = null;
        switch (this.v) {
            case 0:
                return a.be(i2);
            case 1:
                return a.bb(i2);
            case 2:
                return a.be(i2);
            case 3:
                return a.bi(i2);
            case 4:
                return a.aY(i2);
            case 5:
                return a.aY(i2);
            case 6:
                return a.bh(i2);
            case 7:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 == 5) {
                                        apakVar = amnf.SMS_MMS_DB_CREATED;
                                    }
                                } else {
                                    apakVar = amnf.OOBE_PERMISSIONS_HANDLER;
                                }
                            } else {
                                apakVar = amnf.RECURRING_EVENT;
                            }
                        } else {
                            apakVar = amnf.SMS_MMS_DB_LOST;
                        }
                    } else {
                        apakVar = amnf.SMS_MMS_DB_RECREATED;
                    }
                } else {
                    apakVar = amnf.UNKNOWN_TRIGGER;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 8:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                apakVar = amnh.PART_TABLE_ENTRY_LOST;
                            }
                        } else {
                            apakVar = amnh.DRM_TABLE_ENTRY_LOST;
                        }
                    } else {
                        apakVar = amnh.BUGLE_TELEPHONY_MESSAGE_COUNT_DISCREPANCY;
                    }
                } else {
                    apakVar = amnh.UNKNOWN_HEURISTIC;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 9:
                return a.be(i2);
            case 10:
                if (amnj.b(i2) == null) {
                    return false;
                }
                return true;
            case 11:
                if (amnn.b(i2) == null) {
                    return false;
                }
                return true;
            case 12:
                return a.aY(i2);
            case 13:
                return a.bb(i2);
            case 14:
                switch (i2) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                        return true;
                    default:
                        return false;
                }
            case 15:
                return a.be(i2);
            case 16:
                return a.aY(i2);
            case 17:
                return a.bh(i2);
            case 18:
                return a.aW(i2);
            case 19:
                return a.aY(i2);
            default:
                return a.aY(i2);
        }
    }
}
