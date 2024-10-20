package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amsr extends apag implements apbu {
    public static final amsr a;
    private static volatile apca e;
    public int b;
    public int c;
    public int d;

    static {
        amsr amsrVar = new amsr();
        a = amsrVar;
        apag.registerDefaultInstance(amsr.class, amsrVar);
    }

    private amsr() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                apam apamVar = amoo.a;
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0003᠌\u0002", new Object[]{"b", "c", apamVar, "d", apamVar});
            case NEW_MUTABLE_INSTANCE:
                return new amsr();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (amsr.class) {
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
