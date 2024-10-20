package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wcq extends apag implements apbu {
    public static final wcq a;
    private static volatile apca g;
    public int b;
    public int c;
    public int d;
    public wdg e;
    public int f;

    static {
        wcq wcqVar = new wcq();
        a = wcqVar;
        apag.registerDefaultInstance(wcq.class, wcqVar);
    }

    private wcq() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဉ\u0002\b᠌\u0003", new Object[]{"b", "c", qgk.r, "d", qgk.q, "e", "f", wcn.c});
            case NEW_MUTABLE_INSTANCE:
                return new wcq();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (wcq.class) {
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
