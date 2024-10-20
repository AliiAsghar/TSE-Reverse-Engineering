package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apgo implements apam {
    private final /* synthetic */ int v;
    static final apam u = new apgo(20);
    public static final apam t = new apgo(19);
    public static final apam s = new apgo(18);
    static final apam r = new apgo(17);
    static final apam q = new apgo(16);
    static final apam p = new apgo(15);
    static final apam o = new apgo(14);
    static final apam n = new apgo(13);
    static final apam m = new apgo(12);
    static final apam l = new apgo(11);
    static final apam k = new apgo(10);
    static final apam j = new apgo(9);
    static final apam i = new apgo(8);
    static final apam h = new apgo(7);
    static final apam g = new apgo(6);
    public static final apam f = new apgo(5);
    static final apam e = new apgo(4);
    static final apam d = new apgo(3);
    static final apam c = new apgo(2);
    static final apam b = new apgo(1);
    static final apam a = new apgo(0);

    private apgo(int i2) {
        this.v = i2;
    }

    @Override // defpackage.apam
    public final boolean a(int i2) {
        switch (this.v) {
            case 0:
                return a.bb(i2);
            case 1:
                return a.bc(i2);
            case 2:
                return a.aY(i2);
            case 3:
                return a.aW(i2);
            case 4:
                return a.aY(i2);
            case 5:
                if (apgs.b(i2) != null) {
                    return true;
                }
                return false;
            case 6:
                return a.aW(i2);
            case 7:
                return a.bh(i2);
            case 8:
                return a.be(i2);
            case 9:
                return a.be(i2);
            case 10:
                return a.bb(i2);
            case 11:
                return a.aY(i2);
            case 12:
                return a.aW(i2);
            case 13:
                return a.bl(i2);
            case 14:
                return a.aW(i2);
            case 15:
                return a.aW(i2);
            case 16:
                return a.bh(i2);
            case 17:
                if (aphf.b(i2) != null) {
                    return true;
                }
                return false;
            case 18:
                if (aphg.b(i2) != null) {
                    return true;
                }
                return false;
            case 19:
                if (aphh.b(i2) != null) {
                    return true;
                }
                return false;
            default:
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
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        return true;
                    default:
                        return false;
                }
        }
    }
}
