package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amrk extends apag implements apbu {
    public static final amrk a;
    private static volatile apca g;
    public int b;
    public int c;
    public int e;
    public String d = "";
    public String f = "";

    static {
        amrk amrkVar = new amrk();
        a = amrkVar;
        apag.registerDefaultInstance(amrk.class, amrkVar);
    }

    private amrk() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဈ\u0003", new Object[]{"b", "c", amqk.n, "d", "e", amqk.m, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new amrk();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (amrk.class) {
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
