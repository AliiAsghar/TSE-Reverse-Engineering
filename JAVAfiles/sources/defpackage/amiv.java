package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amiv implements apam {
    private final /* synthetic */ int v;
    static final apam u = new amiv(20);
    static final apam t = new amiv(19);
    static final apam s = new amiv(18);
    static final apam r = new amiv(17);
    static final apam q = new amiv(16);
    static final apam p = new amiv(15);
    static final apam o = new amiv(14);
    static final apam n = new amiv(13);
    static final apam m = new amiv(12);
    static final apam l = new amiv(11);
    static final apam k = new amiv(10);
    static final apam j = new amiv(9);
    static final apam i = new amiv(8);
    static final apam h = new amiv(7);
    static final apam g = new amiv(6);
    static final apam f = new amiv(5);
    static final apam e = new amiv(4);
    static final apam d = new amiv(3);
    public static final apam c = new amiv(2);
    static final apam b = new amiv(1);
    static final apam a = new amiv(0);

    private amiv(int i2) {
        this.v = i2;
    }

    @Override // defpackage.apam
    public final boolean a(int i2) {
        apak apakVar = null;
        switch (this.v) {
            case 0:
                return a.be(i2);
            case 1:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4) {
                                    apakVar = amis.C11N_RCS;
                                }
                            } else {
                                apakVar = amis.NOT_SET_YET;
                            }
                        } else {
                            apakVar = amis.C11N;
                        }
                    } else {
                        apakVar = amis.RCS;
                    }
                } else {
                    apakVar = amis.UNKNOWN_TYPE;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 2:
                switch (i2) {
                    default:
                        switch (i2) {
                            case VCardConstants.DEFAULT_PREF /* 100 */:
                            case 101:
                            case 102:
                            case 103:
                            case 104:
                            case 105:
                            case 106:
                            case 107:
                            case 108:
                            case 109:
                            case 110:
                            case 111:
                            case 112:
                            case 113:
                                break;
                            default:
                                return false;
                        }
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        return true;
                }
            case 3:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4) {
                                    apakVar = amix.EMAIL_ADDRESS;
                                }
                            } else {
                                apakVar = amix.PHONE_NUMBER;
                            }
                        } else {
                            apakVar = amix.WEB_URL;
                        }
                    } else {
                        apakVar = amix.UNKNOWN;
                    }
                } else {
                    apakVar = amix.LINK_ENTITY_TYPE_UNSET;
                }
                if (apakVar == null) {
                    return false;
                }
                return true;
            case 4:
                return a.be(i2);
            case 5:
                return a.aY(i2);
            case 6:
                return a.aW(i2);
            case 7:
                return a.aY(i2);
            case 8:
                return a.aY(i2);
            case 9:
                return a.aX(i2);
            case 10:
                return a.be(i2);
            case 11:
                return a.aW(i2);
            case 12:
                return a.be(i2);
            case 13:
                return a.aW(i2);
            case 14:
                if (amjj.b(i2) == null) {
                    return false;
                }
                return true;
            case 15:
                return a.be(i2);
            case 16:
                return a.aY(i2);
            case 17:
                return a.aW(i2);
            case 18:
                return a.aW(i2);
            case 19:
                return a.bk(i2);
            default:
                return a.aY(i2);
        }
    }
}
