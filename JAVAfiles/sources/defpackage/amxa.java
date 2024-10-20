package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amxa extends apag implements apbu {
    public static final amxa a;
    private static volatile apca g;
    public int b;
    public boolean c;
    public int d;
    public long e;
    public long f;

    static {
        amxa amxaVar = new amxa();
        a = amxaVar;
        apag.registerDefaultInstance(amxa.class, amxaVar);
    }

    private amxa() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"b", "c", "d", amwm.m, "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new amxa();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (amxa.class) {
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
