package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amnd extends apag implements apbu {
    public static final amnd a;
    private static volatile apca g;
    public int b;
    public amyj c;
    public int d;
    public int e;
    public int f;

    static {
        amnd amndVar = new amnd();
        a = amndVar;
        apag.registerDefaultInstance(amnd.class, amndVar);
    }

    private amnd() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                apam apamVar = ahbp.o;
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", ahbp.p, "e", apamVar, "f", apamVar});
            case NEW_MUTABLE_INSTANCE:
                return new amnd();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (amnd.class) {
                        apcaVar = g;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            g = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
