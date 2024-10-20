package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amyt extends apag implements apbu {
    public static final amyt a;
    private static volatile apca f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        amyt amytVar = new amyt();
        a = amytVar;
        apag.registerDefaultInstance(amyt.class, amytVar);
    }

    private amyt() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"b", "c", amyg.f, "d", amyg.h, "e", amyg.g});
            case NEW_MUTABLE_INSTANCE:
                return new amyt();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (amyt.class) {
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
