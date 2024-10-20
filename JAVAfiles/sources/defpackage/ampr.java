package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ampr extends apag implements apbu {
    public static final ampr a;
    private static volatile apca f;
    public int b;
    public int c = 0;
    public Object d;
    public int e;

    static {
        ampr amprVar = new ampr();
        a = amprVar;
        apag.registerDefaultInstance(ampr.class, amprVar);
    }

    private ampr() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"d", "c", "b", "e", amoo.j, ampt.class, amps.class});
            case NEW_MUTABLE_INSTANCE:
                return new ampr();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (ampr.class) {
                        apcaVar = f;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            f = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
