package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amhu extends apag implements apbu {
    public static final amhu a;
    private static volatile apca s;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;

    static {
        amhu amhuVar = new amhu();
        a = amhuVar;
        apag.registerDefaultInstance(amhu.class, amhuVar);
    }

    private amhu() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                apam apamVar = amiv.l;
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0002\u0012\u0010\u0000\u0000\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007\t᠌\b\n᠌\t\u000bင\n\fင\u000b\u000eဇ\r\u000f᠌\u000e\u0010᠌\u000f\u0011᠌\u0010\u0012᠌\u0011", new Object[]{"b", "c", amwm.f, "d", amhj.r, "e", amid.r, "f", apamVar, "g", apamVar, "h", apamVar, "i", apamVar, "j", apamVar, "k", apamVar, "l", "m", "n", "o", amud.n, "p", apamVar, "q", apamVar, "r", apamVar});
            case NEW_MUTABLE_INSTANCE:
                return new amhu();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = s;
                if (apcaVar == null) {
                    synchronized (amhu.class) {
                        apcaVar = s;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            s = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
