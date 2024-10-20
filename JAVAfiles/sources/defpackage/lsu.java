package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lsu extends apag implements apbu {
    public static final lsu a;
    private static volatile apca f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        lsu lsuVar = new lsu();
        a = lsuVar;
        apag.registerDefaultInstance(lsu.class, lsuVar);
    }

    private lsu() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", apgo.t, "e", apgo.s});
            case NEW_MUTABLE_INSTANCE:
                return new lsu();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (lsu.class) {
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
