package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amyi extends apag implements apbu {
    public static final amyi a;
    private static volatile apca l;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    static {
        amyi amyiVar = new amyi();
        a = amyiVar;
        apag.registerDefaultInstance(amyi.class, amyiVar);
    }

    private amyi() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                apam apamVar = amyg.a;
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007᠌\u0006\b᠌\u0007\t᠌\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", apamVar, "j", apamVar, "k", apamVar});
            case NEW_MUTABLE_INSTANCE:
                return new amyi();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = l;
                if (apcaVar == null) {
                    synchronized (amyi.class) {
                        apcaVar = l;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            l = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
