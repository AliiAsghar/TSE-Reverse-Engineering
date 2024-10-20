package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qeo extends apag implements apbu {
    public static final qeo a;
    private static volatile apca g;
    public int b;
    public qeg c;
    public qei d;
    public aozb e = aozb.b;
    public int f;

    static {
        qeo qeoVar = new qeo();
        a = qeoVar;
        apag.registerDefaultInstance(qeo.class, qeoVar);
    }

    private qeo() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", amwm.r});
            case NEW_MUTABLE_INSTANCE:
                return new qeo();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (qeo.class) {
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
