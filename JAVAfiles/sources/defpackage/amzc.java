package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amzc extends apag implements apbu {
    public static final amzc a;
    private static volatile apca d;
    public int b = 0;
    public Object c;

    static {
        amzc amzcVar = new amzc();
        a = amzcVar;
        apag.registerDefaultInstance(amzc.class, amzcVar);
    }

    private amzc() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", amzd.class, amza.class});
            case NEW_MUTABLE_INSTANCE:
                return new amzc();
            case NEW_BUILDER:
                return new amzb();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (amzc.class) {
                        apcaVar = d;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            d = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
