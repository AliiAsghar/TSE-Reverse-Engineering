package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amfz implements apam {
    private final /* synthetic */ int v;
    static final apam u = new amfz(20);
    static final apam t = new amfz(19);
    static final apam s = new amfz(18);
    static final apam r = new amfz(17);
    static final apam q = new amfz(16);
    public static final apam p = new amfz(15);
    static final apam o = new amfz(14);
    static final apam n = new amfz(13);
    static final apam m = new amfz(12);
    static final apam l = new amfz(11);
    static final apam k = new amfz(10);
    static final apam j = new amfz(9);
    static final apam i = new amfz(8);
    static final apam h = new amfz(7);
    static final apam g = new amfz(6);
    static final apam f = new amfz(5);
    static final apam e = new amfz(4);
    static final apam d = new amfz(3);
    static final apam c = new amfz(2);
    static final apam b = new amfz(1);
    static final apam a = new amfz(0);

    private amfz(int i2) {
        this.v = i2;
    }

    @Override // defpackage.apam
    public final boolean a(int i2) {
        apak apakVar = null;
        switch (this.v) {
            case 0:
                return a.aX(i2);
            case 1:
                return a.aY(i2);
            case 2:
                return a.aY(i2);
            case 3:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                apakVar = amgc.IN_INITIAL_SYNC;
                            }
                        } else {
                            apakVar = amgc.ENABLED;
                        }
                    } else {
                        apakVar = amgc.NOT_ENABLED;
                    }
                } else {
                    apakVar = amgc.UNKNOWN_CLOUD_SYNC_STATUS;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 4:
                return a.aW(i2);
            case 5:
                if (akec.aM(i2) == 0) {
                    return false;
                }
                return true;
            case 6:
                if (amge.b(i2) == null) {
                    return false;
                }
                return true;
            case 7:
                switch (i2) {
                    case 0:
                        apakVar = amgf.UNKNOWN_MESSAGE_OPTIONS_ACTION;
                        break;
                    case 1:
                        apakVar = amgf.OPTIONS_MENU_OPENED;
                        break;
                    case 2:
                        apakVar = amgf.COPY;
                        break;
                    case 3:
                        apakVar = amgf.DELETE;
                        break;
                    case 4:
                        apakVar = amgf.SHARE;
                        break;
                    case 5:
                        apakVar = amgf.FORWARD;
                        break;
                    case 6:
                        apakVar = amgf.VIEW_DETAILS;
                        break;
                    case 7:
                        apakVar = amgf.DOWNLOAD;
                        break;
                    case 8:
                        apakVar = amgf.SAVE_ATTACHMENT;
                        break;
                    case 9:
                        apakVar = amgf.RETRY_SEND;
                        break;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 8:
                return a.bf(i2);
            case 9:
                return a.aY(i2);
            case 10:
                if (amgg.b(i2) == null) {
                    return false;
                }
                return true;
            case 11:
                if (amgh.b(i2) == null) {
                    return false;
                }
                return true;
            case 12:
                if (amgi.b(i2) == null) {
                    return false;
                }
                return true;
            case 13:
                if (amgj.b(i2) == null) {
                    return false;
                }
                return true;
            case 14:
                if (akec.aL(i2) == 0) {
                    return false;
                }
                return true;
            case 15:
                return a.bg(i2);
            case 16:
                if (amgk.b(i2) == null) {
                    return false;
                }
                return true;
            case 17:
                return a.be(i2);
            case 18:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 == 5) {
                                        apakVar = amgm.EMOJI_STATUS_SINGLE_EMOJI_ONLY;
                                    }
                                } else {
                                    apakVar = amgm.EMOJI_STATUS_NA;
                                }
                            } else {
                                apakVar = amgm.EMOJI_STATUS_ALL_EMOJI;
                            }
                        } else {
                            apakVar = amgm.EMOJI_STATUS_SOME_EMOJI;
                        }
                    } else {
                        apakVar = amgm.EMOJI_STATUS_NO_EMOJI;
                    }
                } else {
                    apakVar = amgm.UNKNOWN_EMOJI_STATUS;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 19:
                return a.aX(i2);
            default:
                if (amgn.b(i2) == null) {
                    return false;
                }
                return true;
        }
    }
}
