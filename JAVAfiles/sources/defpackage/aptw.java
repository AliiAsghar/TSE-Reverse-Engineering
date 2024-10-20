package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aptw extends apag implements apbu {
    public static final aptw a;
    private static volatile apca f;
    public int b;
    public int c;
    public int d;
    public apbo e = apbo.a;

    static {
        aptw aptwVar = new aptw();
        a = aptwVar;
        apag.registerDefaultInstance(aptw.class, aptwVar);
    }

    private aptw() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\f\u0002\f\u0003\f\u00042", new Object[]{"b", "c", "d", "e", aptv.a});
            case NEW_MUTABLE_INSTANCE:
                return new aptw();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (aptw.class) {
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
