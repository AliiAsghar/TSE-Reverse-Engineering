package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amyy extends apag implements apbu {
    public static final amyy a;
    private static volatile apca d;
    public int b = 0;
    public Object c;

    static {
        amyy amyyVar = new amyy();
        a = amyyVar;
        apag.registerDefaultInstance(amyy.class, amyyVar);
    }

    private amyy() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"c", "b", amzo.class});
            case NEW_MUTABLE_INSTANCE:
                return new amyy();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (amyy.class) {
                        apcaVar = d;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            d = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
