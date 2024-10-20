package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apiw extends apag implements apbu {
    public static final apiw a;
    private static volatile apca g;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        apiw apiwVar = new apiw();
        a = apiwVar;
        apag.registerDefaultInstance(apiw.class, apiwVar);
    }

    private apiw() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"b", "c", aphl.t, "d", apez.r, "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new apiw();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (apiw.class) {
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
