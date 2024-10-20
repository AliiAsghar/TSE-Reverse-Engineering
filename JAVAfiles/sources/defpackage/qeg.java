package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qeg extends apag implements apbu {
    public static final qeg a;
    private static volatile apca f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        qeg qegVar = new qeg();
        a = qegVar;
        apag.registerDefaultInstance(qeg.class, qegVar);
    }

    private qeg() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", hzn.m, "d", hzn.l, "e", qgk.b});
            case NEW_MUTABLE_INSTANCE:
                return new qeg();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (qeg.class) {
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
