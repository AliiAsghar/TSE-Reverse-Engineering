package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class amhj implements apam {
    private final /* synthetic */ int v;
    static final apam u = new amhj(20);
    static final apam t = new amhj(19);
    static final apam s = new amhj(18);
    static final apam r = new amhj(17);
    static final apam q = new amhj(16);
    static final apam p = new amhj(15);
    static final apam o = new amhj(14);
    static final apam n = new amhj(13);
    static final apam m = new amhj(12);
    static final apam l = new amhj(11);
    static final apam k = new amhj(10);
    static final apam j = new amhj(9);
    static final apam i = new amhj(8);
    static final apam h = new amhj(7);
    static final apam g = new amhj(6);
    static final apam f = new amhj(5);
    static final apam e = new amhj(4);
    static final apam d = new amhj(3);
    static final apam c = new amhj(2);
    static final apam b = new amhj(1);
    static final apam a = new amhj(0);

    private amhj(int i2) {
        this.v = i2;
    }

    @Override // defpackage.apam
    public final boolean a(int i2) {
        apak apakVar = null;
        switch (this.v) {
            case 0:
                return a.aW(i2);
            case 1:
                return a.aY(i2);
            case 2:
                return a.bk(i2);
            case 3:
                return a.bb(i2);
            case 4:
                return a.aY(i2);
            case 5:
                return a.aW(i2);
            case 6:
                return a.bg(i2);
            case 7:
                return a.aW(i2);
            case 8:
                switch (i2) {
                    case 0:
                        apakVar = amho.UNKNOWN_BIZINFO_EVENT_SOURCE;
                        break;
                    case 1:
                        apakVar = amho.BIZINFO_SOURCE_CONVERSATION_LIST_AVATAR;
                        break;
                    case 2:
                        apakVar = amho.BIZINFO_SOURCE_CONVERSATION_AVATAR;
                        break;
                    case 3:
                        apakVar = amho.BIZINFO_SOURCE_CONVERSATION_START;
                        break;
                    case 4:
                        apakVar = amho.BIZINFO_SOURCE_CONVERSATION_OVERFLOW_MENU;
                        break;
                    case 5:
                        apakVar = amho.BIZINFO_SOURCE_CONVERSATION_ACTION_BAR;
                        break;
                    case 6:
                        apakVar = amho.BIZINFO_SOURCE_CONVERSATION_TITLE;
                        break;
                }
                if (apakVar != null) {
                    return true;
                }
                return false;
            case 9:
                return a.aW(i2);
            case 10:
                return a.bj(i2);
            case 11:
                return a.bf(i2);
            case 12:
                return a.aW(i2);
            case 13:
                return a.aW(i2);
            case 14:
                return a.aX(i2);
            case 15:
                return a.aW(i2);
            case 16:
                return a.aW(i2);
            case 17:
                if (amhv.b(i2) != null) {
                    return true;
                }
                return false;
            case 18:
                return a.aY(i2);
            case 19:
                switch (i2) {
                    case 0:
                        apakVar = amhz.UNKNOWN;
                        break;
                    case 1:
                        apakVar = amhz.TEXT;
                        break;
                    case 2:
                        apakVar = amhz.ATTACHMENT;
                        break;
                    case 3:
                        apakVar = amhz.SUCCESS_RECEIPT;
                        break;
                    case 4:
                        apakVar = amhz.FTD_RECEIPT;
                        break;
                    case 5:
                        apakVar = amhz.LOCATION;
                        break;
                    case 6:
                        apakVar = amhz.READ_REPORT;
                        break;
                    case 7:
                        apakVar = amhz.TYPING_INDICATOR;
                        break;
                }
                if (apakVar != null) {
                    return true;
                }
                return false;
            default:
                return a.be(i2);
        }
    }
}
