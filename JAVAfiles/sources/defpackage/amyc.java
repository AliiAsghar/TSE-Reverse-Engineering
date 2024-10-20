package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amyc extends apag implements apbu {
    public static final amyc a;
    private static volatile apca f;
    public int b;
    public int c;
    public amyd d;
    public amvy e;

    static {
        amyc amycVar = new amyc();
        a = amycVar;
        apag.registerDefaultInstance(amyc.class, amycVar);
    }

    private amyc() {
        emptyIntList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\t\u0003\u0000\u0000\u0000\u0001ဌ\u0000\bဉ\u0006\tဉ\u0007", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new amyc();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (amyc.class) {
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
