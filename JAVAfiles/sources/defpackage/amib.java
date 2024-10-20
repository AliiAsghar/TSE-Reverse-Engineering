package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amib extends apag implements apbu {
    public static final amib a;
    private static volatile apca f;
    public int b;
    public int c = 0;
    public Object d;
    public long e;

    static {
        amib amibVar = new amib();
        a = amibVar;
        apag.registerDefaultInstance(amib.class, amibVar);
    }

    private amib() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0004\u0007\u0004\u0000\u0000\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007ဂ\u0003", new Object[]{"d", "c", "b", amml.class, ammj.class, ammk.class, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new amib();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (amib.class) {
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
