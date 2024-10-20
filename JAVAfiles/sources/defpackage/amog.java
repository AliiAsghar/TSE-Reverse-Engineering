package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amog extends apag implements apbu {
    public static final amog a;
    private static volatile apca h;
    public int b;
    public Object d;
    public int e;
    public amoh g;
    public int c = 0;
    public aozb f = aozb.b;

    static {
        amog amogVar = new amog();
        a = amogVar;
        apag.registerDefaultInstance(amog.class, amogVar);
    }

    private amog() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ည\u0001\u0004ဉ\u0003\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"d", "c", "b", "e", amna.r, "f", "g", amok.class, amoi.class, amoj.class});
            case NEW_MUTABLE_INSTANCE:
                return new amog();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (amog.class) {
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
