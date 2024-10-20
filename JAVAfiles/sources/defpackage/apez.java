package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apez implements apam {
    private final /* synthetic */ int v;
    static final apam u = new apez(20);
    static final apam t = new apez(19);
    static final apam s = new apez(18);
    public static final apam r = new apez(17);
    static final apam q = new apez(16);
    static final apam p = new apez(15);
    static final apam o = new apez(14);
    static final apam n = new apez(13);
    static final apam m = new apez(12);
    static final apam l = new apez(11);
    static final apam k = new apez(10);
    static final apam j = new apez(9);
    static final apam i = new apez(8);
    static final apam h = new apez(7);
    static final apam g = new apez(6);
    static final apam f = new apez(5);
    static final apam e = new apez(4);
    static final apam d = new apez(3);
    static final apam c = new apez(2);
    static final apam b = new apez(1);
    public static final apam a = new apez(0);

    private apez(int i2) {
        this.v = i2;
    }

    @Override // defpackage.apam
    public final boolean a(int i2) {
        switch (this.v) {
            case 0:
                if (aotl.e(i2) == 0) {
                    return false;
                }
                return true;
            case 1:
                return a.aX(i2);
            case 2:
                return a.aW(i2);
            case 3:
                return a.be(i2);
            case 4:
                switch (i2) {
                    case 0:
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
                        return true;
                    default:
                        return false;
                }
            case 5:
                return a.aY(i2);
            case 6:
                if (apfi.b(i2) == null) {
                    return false;
                }
                return true;
            case 7:
                return a.bb(i2);
            case 8:
                return a.bk(i2);
            case 9:
                return a.bh(i2);
            case 10:
                return a.aY(i2);
            case 11:
                return a.aY(i2);
            case 12:
                if (i2 != 1 && i2 != 2) {
                    return false;
                }
                return true;
            case 13:
                return a.aW(i2);
            case 14:
                return a.be(i2);
            case 15:
                if (apfz.b(i2) == null) {
                    return false;
                }
                return true;
            case 16:
                return a.aY(i2);
            case 17:
                if (aoue.g(i2) == 0) {
                    return false;
                }
                return true;
            case 18:
                return a.aY(i2);
            case 19:
                return a.bk(i2);
            default:
                return a.aY(i2);
        }
    }
}
