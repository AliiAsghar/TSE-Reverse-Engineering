package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ymj extends apag implements apbu {
    public static final ymj a;
    private static volatile apca e;
    public int b;
    public float c;
    public int d;

    static {
        ymj ymjVar = new ymj();
        a = ymjVar;
        apag.registerDefaultInstance(ymj.class, ymjVar);
    }

    private ymj() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0001\u0003\f", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new ymj();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (ymj.class) {
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
