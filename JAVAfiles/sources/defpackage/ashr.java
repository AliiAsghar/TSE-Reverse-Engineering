package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ashr extends apag implements apbu {
    public static final ashr a;
    private static volatile apca g;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public ashq f;

    static {
        ashr ashrVar = new ashr();
        a = ashrVar;
        apag.registerDefaultInstance(ashr.class, ashrVar);
    }

    private ashr() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0004ဇ\u0002\u0005ဉ\u0003", new Object[]{"b", "c", apwb.p, "d", amud.n, "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new ashr();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (ashr.class) {
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
