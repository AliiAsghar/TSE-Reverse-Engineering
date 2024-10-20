package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amgv extends apag implements apbu {
    public static final amgv a;
    private static volatile apca h;
    public int b;
    public int c;
    public long d;
    public amem e;
    public amih f;
    public amem g;

    static {
        amgv amgvVar = new amgv();
        a = amgvVar;
        apag.registerDefaultInstance(amgv.class, amgvVar);
    }

    private amgv() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"b", "c", amgp.n, "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new amgv();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (amgv.class) {
                        apcaVar = h;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            h = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
