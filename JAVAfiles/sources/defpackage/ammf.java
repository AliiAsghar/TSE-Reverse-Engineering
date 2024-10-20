package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ammf extends apag implements apbu {
    public static final ammf a;
    private static volatile apca f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        ammf ammfVar = new ammf();
        a = ammfVar;
        apag.registerDefaultInstance(ammf.class, ammfVar);
    }

    private ammf() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", amln.m, "d", amln.n, "e", amln.o});
            case NEW_MUTABLE_INSTANCE:
                return new ammf();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (ammf.class) {
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
