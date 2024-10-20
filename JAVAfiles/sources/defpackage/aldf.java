package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aldf extends apag implements apbu {
    public static final aldf a;
    private static volatile apca g;
    public int b;
    public Object d;
    public aldg f;
    public int c = 0;
    public apao e = emptyIntList();

    static {
        aldf aldfVar = new aldf();
        a = aldfVar;
        apag.registerDefaultInstance(aldf.class, aldfVar);
    }

    private aldf() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003ࠞ\u0005ဉ\u0001", new Object[]{"d", "c", "b", aldd.class, alde.class, "e", apwb.k, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aldf();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (aldf.class) {
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
