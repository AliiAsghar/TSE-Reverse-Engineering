package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahbp implements apam {
    private final /* synthetic */ int v;
    public static final apam u = new ahbp(20);
    public static final apam t = new ahbp(19);
    public static final apam s = new ahbp(18);
    public static final apam r = new ahbp(17);
    public static final apam q = new ahbp(16);
    public static final apam p = new ahbp(15);
    public static final apam o = new ahbp(14);
    public static final apam n = new ahbp(13);
    public static final apam m = new ahbp(12);
    public static final apam l = new ahbp(11);
    public static final apam k = new ahbp(10);
    public static final apam j = new ahbp(9);
    public static final apam i = new ahbp(8);
    public static final apam h = new ahbp(7);
    public static final apam g = new ahbp(6);
    public static final apam f = new ahbp(5);
    public static final apam e = new ahbp(4);
    public static final apam d = new ahbp(3);
    public static final apam c = new ahbp(2);
    public static final apam b = new ahbp(1);
    static final apam a = new ahbp(0);

    private ahbp(int i2) {
        this.v = i2;
    }

    @Override // defpackage.apam
    public final boolean a(int i2) {
        switch (this.v) {
            case 0:
                if (ahji.aJ(i2) != 0) {
                    return true;
                }
                return false;
            case 1:
                return a.bf(i2);
            case 2:
                return a.be(i2);
            case 3:
                return a.aW(i2);
            case 4:
                return a.bc(i2);
            case 5:
                return a.bb(i2);
            case 6:
                return a.aW(i2);
            case 7:
                return a.aY(i2);
            case 8:
                return a.aW(i2);
            case 9:
                return a.bg(i2);
            case 10:
                return a.aW(i2);
            case 11:
                return a.bh(i2);
            case 12:
                return a.aY(i2);
            case 13:
                return a.bh(i2);
            case 14:
                if (a.af(i2) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (a.aL(i2) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (a.aM(i2) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (amed.b(i2) != null) {
                    return true;
                }
                return false;
            case 18:
                return a.be(i2);
            case 19:
                if (a.aT(i2) != 0) {
                    return true;
                }
                return false;
            default:
                return a.aW(i2);
        }
    }
}
