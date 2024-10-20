package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abnd extends apag implements apbu {
    public static final abnd a;
    private static volatile apca f;
    public int b;
    public Object d;
    public int c = 0;
    public aozb e = aozb.b;

    static {
        abnd abndVar = new abnd();
        a = abndVar;
        apag.registerDefaultInstance(abnd.class, abndVar);
    }

    private abnd() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ည\u0000", new Object[]{"d", "c", "b", abne.class, abnc.class, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new abnd();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (abnd.class) {
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
