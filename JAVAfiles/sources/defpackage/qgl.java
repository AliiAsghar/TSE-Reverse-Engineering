package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qgl extends apag implements apbu {
    public static final qgl a;
    private static volatile apca e;
    public int b;
    public String c = "";
    public int d = 1;

    static {
        qgl qglVar = new qgl();
        a = qglVar;
        apag.registerDefaultInstance(qgl.class, qglVar);
    }

    private qgl() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", qgk.a});
            case NEW_MUTABLE_INSTANCE:
                return new qgl();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (qgl.class) {
                        apcaVar = e;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            e = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
