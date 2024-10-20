package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amyg implements apam {
    private final /* synthetic */ int v;
    public static final apam u = new amyg(20);
    public static final apam t = new amyg(19);
    public static final apam s = new amyg(18);
    public static final apam r = new amyg(17);
    public static final apam q = new amyg(16);
    public static final apam p = new amyg(15);
    public static final apam o = new amyg(14);
    public static final apam n = new amyg(13);
    public static final apam m = new amyg(12);
    public static final apam l = new amyg(11);
    public static final apam k = new amyg(10);
    public static final apam j = new amyg(9);
    public static final apam i = new amyg(8);
    static final apam h = new amyg(7);
    static final apam g = new amyg(6);
    static final apam f = new amyg(5);
    static final apam e = new amyg(4);
    static final apam d = new amyg(3);
    static final apam c = new amyg(2);
    static final apam b = new amyg(1);
    static final apam a = new amyg(0);

    private amyg(int i2) {
        this.v = i2;
    }

    @Override // defpackage.apam
    public final boolean a(int i2) {
        amyh amyhVar;
        switch (this.v) {
            case 0:
                switch (i2) {
                    case 0:
                        amyhVar = amyh.UNKNOWN;
                        break;
                    case 1:
                        amyhVar = amyh.BUCKET_ZERO;
                        break;
                    case 2:
                        amyhVar = amyh.BUCKET_1_TO_2;
                        break;
                    case 3:
                        amyhVar = amyh.BUCKET_2_TO_4;
                        break;
                    case 4:
                        amyhVar = amyh.BUCKET_4_TO_8;
                        break;
                    case 5:
                        amyhVar = amyh.BUCKET_8_TO_16;
                        break;
                    case 6:
                        amyhVar = amyh.BUCKET_16_TO_32;
                        break;
                    case 7:
                        amyhVar = amyh.BUCKET_32_TO_64;
                        break;
                    case 8:
                        amyhVar = amyh.BUCKET_64_TO_128;
                        break;
                    case 9:
                        amyhVar = amyh.BUCKET_128_TO_256;
                        break;
                    case 10:
                        amyhVar = amyh.BUCKET_256_TO_512;
                        break;
                    case 11:
                        amyhVar = amyh.BUCKET_512_TO_1024;
                        break;
                    case 12:
                        amyhVar = amyh.BUCKET_1024_OR_MORE;
                        break;
                    default:
                        amyhVar = null;
                        break;
                }
                if (amyhVar == null) {
                    return false;
                }
                return true;
            case 1:
                return a.be(i2);
            case 2:
                return a.bc(i2);
            case 3:
                return a.bc(i2);
            case 4:
                return a.aW(i2);
            case 5:
                return a.aY(i2);
            case 6:
                return a.aY(i2);
            case 7:
                return a.bb(i2);
            case 8:
                return a.bh(i2);
            case 9:
                return a.aY(i2);
            case 10:
                return a.aW(i2);
            case 11:
                return a.bl(i2);
            case 12:
                return a.aY(i2);
            case 13:
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
                        return true;
                    default:
                        return false;
                }
            case 14:
                return a.be(i2);
            case 15:
                return a.aW(i2);
            case 16:
                return a.bb(i2);
            case 17:
                return a.aW(i2);
            case 18:
                return a.bh(i2);
            case 19:
                return a.bg(i2);
            default:
                return a.aW(i2);
        }
    }
}
