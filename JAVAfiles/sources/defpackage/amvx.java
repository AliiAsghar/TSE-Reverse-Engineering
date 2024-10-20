package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amvx extends apag implements apbu {
    public static final amvx a;
    private static volatile apca d;
    public int b = 0;
    public Object c;

    static {
        amvx amvxVar = new amvx();
        a = amvxVar;
        apag.registerDefaultInstance(amvx.class, amvxVar);
    }

    private amvx() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"c", "b", amvv.class});
            case NEW_MUTABLE_INSTANCE:
                return new amvx();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (amvx.class) {
                        apcaVar = d;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            d = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
