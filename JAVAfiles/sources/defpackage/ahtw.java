package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahtw extends apag implements apbu {
    public static final ahtw a;
    private static volatile apca f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        ahtw ahtwVar = new ahtw();
        a = ahtwVar;
        apag.registerDefaultInstance(ahtw.class, ahtwVar);
    }

    private ahtw() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\nဈ\u0000", new Object[]{"d", "c", "b", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new ahtw();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (ahtw.class) {
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
