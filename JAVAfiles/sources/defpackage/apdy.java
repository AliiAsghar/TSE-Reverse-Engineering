package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apdy extends apag implements apbu {
    public static final apdy a;
    private static volatile apca f;
    public apar b = emptyLongList();
    public apdt c;
    public apdt d;
    public int e;
    private int g;

    static {
        apdy apdyVar = new apdy();
        a = apdyVar;
        apag.registerDefaultInstance(apdy.class, apdyVar);
    }

    private apdy() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001%\u0002ဉ\u0000\u0003ဉ\u0001\u0004\f", new Object[]{"g", "b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new apdy();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (apdy.class) {
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
