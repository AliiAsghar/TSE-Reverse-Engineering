package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asix extends apag implements apbu {
    public static final asix a;
    private static volatile apca g;
    public int b;
    public int c = 0;
    public Object d;
    public long e;
    public aozn f;

    static {
        asix asixVar = new asix();
        a = asixVar;
        apag.registerDefaultInstance(asix.class, asixVar);
    }

    private asix() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဉ\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"d", "c", "b", "e", "f", asiu.class, asiv.class, asit.class});
            case NEW_MUTABLE_INSTANCE:
                return new asix();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (asix.class) {
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
