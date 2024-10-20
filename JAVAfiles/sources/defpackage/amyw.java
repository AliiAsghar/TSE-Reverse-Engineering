package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amyw extends apag implements apbu {
    public static final amyw a;
    private static volatile apca d;
    public int b = 0;
    public Object c;

    static {
        amyw amywVar = new amyw();
        a = amywVar;
        apag.registerDefaultInstance(amyw.class, amywVar);
    }

    private amyw() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"c", "b", amyu.class});
            case NEW_MUTABLE_INSTANCE:
                return new amyw();
            case NEW_BUILDER:
                return new amyv();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (amyw.class) {
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
