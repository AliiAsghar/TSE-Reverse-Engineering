package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajzl extends apag implements apbu {
    public static final ajzl a;
    private static volatile apca f;
    public int b;
    public long c;
    public long d;
    public long e;

    static {
        ajzl ajzlVar = new ajzl();
        a = ajzlVar;
        apag.registerDefaultInstance(ajzl.class, ajzlVar);
    }

    private ajzl() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0002\u0003ဂ\u0001", new Object[]{"b", "c", "e", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new ajzl();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (ajzl.class) {
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
