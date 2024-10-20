package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ywp extends apag implements apbu {
    public static final ywp a;
    private static volatile apca e;
    public int b = 0;
    public Object c;
    public int d;

    static {
        ywp ywpVar = new ywp();
        a = ywpVar;
        apag.registerDefaultInstance(ywp.class, ywpVar);
    }

    private ywp() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", "d", ywl.class, ywo.class});
            case NEW_MUTABLE_INSTANCE:
                return new ywp();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (ywp.class) {
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
