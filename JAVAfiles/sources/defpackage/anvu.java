package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anvu extends apag implements apbu {
    public static final anvu a;
    private static volatile apca f;
    public int b;
    public int c;
    public anvv d;
    public int e;

    static {
        anvu anvuVar = new anvu();
        a = anvuVar;
        apag.registerDefaultInstance(anvu.class, anvuVar);
    }

    private anvu() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"b", "d", "e", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new anvu();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (anvu.class) {
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
