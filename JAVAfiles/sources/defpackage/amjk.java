package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amjk extends apag implements apbu {
    public static final amjk a;
    private static volatile apca q;
    public int b;
    public amhu c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public ammd i;
    public boolean j;
    public int k;
    public ammc l;
    public amjz m;
    public boolean n;
    public boolean o;
    public boolean p;

    static {
        amjk amjkVar = new amjk();
        a = amjkVar;
        apag.registerDefaultInstance(amjk.class, amjkVar);
    }

    private amjk() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                apam apamVar = amiv.s;
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u0010\u000e\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\tဉ\u0007\nဇ\b\u000b᠌\t\fဉ\n\rဉ\u000b\u000eဇ\f\u000fဇ\r\u0010ဇ\u000e", new Object[]{"b", "c", "d", apamVar, "e", apamVar, "f", amff.a, "g", amiv.n, "h", ameh.s, "i", "j", "k", amiv.o, "l", "m", "n", "o", "p"});
            case 3:
                return new amjk();
            case 4:
                return new aozy(a);
            case 5:
                return a;
            case 6:
                apca apcaVar = q;
                if (apcaVar == null) {
                    synchronized (amjk.class) {
                        apcaVar = q;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            q = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
