package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amsd extends apag implements apbu {
    public static final amsd a;
    private static volatile apca g;
    public int b;
    public amsg c;
    public amsb d;
    public int e;
    public boolean f;

    static {
        amsd amsdVar = new amsd();
        a = amsdVar;
        apag.registerDefaultInstance(amsd.class, amsdVar);
    }

    private amsd() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new amsd();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (amsd.class) {
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
