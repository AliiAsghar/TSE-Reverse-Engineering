package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ywm extends apag implements apbu {
    public static final ywm a;
    private static volatile apca f;
    public apct b;
    public String c = "";
    public int d;
    public int e;
    private int g;

    static {
        ywm ywmVar = new ywm();
        a = ywmVar;
        apag.registerDefaultInstance(ywm.class, ywmVar);
    }

    private ywm() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0004\u0004\f", new Object[]{"g", "c", "b", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new ywm();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (ywm.class) {
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
