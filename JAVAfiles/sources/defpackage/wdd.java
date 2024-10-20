package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wdd extends apag implements apbu {
    public static final wdd a;
    private static volatile apca f;
    public int b;
    public aoyo c;
    public wbk d;
    public apax e = emptyProtobufList();

    static {
        wdd wddVar = new wdd();
        a = wddVar;
        apag.registerDefaultInstance(wdd.class, wddVar);
    }

    private wdd() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0004\u001b", new Object[]{"b", "c", "d", "e", wcz.class});
            case NEW_MUTABLE_INSTANCE:
                return new wdd();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (wdd.class) {
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
