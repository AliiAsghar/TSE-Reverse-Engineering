package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ywr extends apag implements apbu {
    public static final ywr a;
    private static volatile apca f;
    public int b;
    public int c = 0;
    public Object d;
    public ywk e;

    static {
        ywr ywrVar = new ywr();
        a = ywrVar;
        apag.registerDefaultInstance(ywr.class, ywrVar);
    }

    private ywr() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000", new Object[]{"d", "c", "b", "e", ywl.class});
            case NEW_MUTABLE_INSTANCE:
                return new ywr();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (ywr.class) {
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
