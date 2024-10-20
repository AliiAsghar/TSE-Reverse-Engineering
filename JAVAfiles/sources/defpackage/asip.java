package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asip extends apag implements apbu {
    public static final asip a;
    private static volatile apca g;
    public int b;
    public Object d;
    public int e;
    public int c = 0;
    public apax f = emptyProtobufList();

    static {
        asip asipVar = new asip();
        a = asipVar;
        apag.registerDefaultInstance(asip.class, asipVar);
    }

    private asip() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u00028\u0000\u0003<\u0000\u0004\u001b", new Object[]{"d", "c", "b", "e", asif.h, asin.class, "f", asio.class});
            case NEW_MUTABLE_INSTANCE:
                return new asip();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (asip.class) {
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
