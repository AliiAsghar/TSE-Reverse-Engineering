package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amwz extends apag implements apbu {
    public static final amwz a;
    private static volatile apca g;
    public int b;
    public int c;
    public int d;
    public long e;
    public amva f;

    static {
        amwz amwzVar = new amwz();
        a = amwzVar;
        apag.registerDefaultInstance(amwz.class, amwzVar);
    }

    private amwz() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                apam apamVar = amwm.f;
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", apamVar, "d", apamVar, "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new amwz();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (amwz.class) {
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
