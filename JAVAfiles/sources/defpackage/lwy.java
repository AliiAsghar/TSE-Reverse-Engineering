package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lwy extends apag implements apbu {
    public static final lwy a;
    private static volatile apca g;
    public int b;
    public Object d;
    public long f;
    public int c = 0;
    public aozb e = aozb.b;

    static {
        lwy lwyVar = new lwy();
        a = lwyVar;
        apag.registerDefaultInstance(lwy.class, lwyVar);
    }

    private lwy() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ည\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဂ\u0001\u0007<\u0000", new Object[]{"d", "c", "b", "e", lws.class, lwx.class, lwv.class, lwt.class, "f", lww.class});
            case NEW_MUTABLE_INSTANCE:
                return new lwy();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (lwy.class) {
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
