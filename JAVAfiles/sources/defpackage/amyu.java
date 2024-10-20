package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amyu extends apag implements apbu {
    public static final amyu a;
    private static volatile apca e;
    public int b;
    public int c;
    public int d;

    static {
        amyu amyuVar = new amyu();
        a = amyuVar;
        apag.registerDefaultInstance(amyu.class, amyuVar);
    }

    private amyu() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"b", "c", amyg.i, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new amyu();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (amyu.class) {
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
