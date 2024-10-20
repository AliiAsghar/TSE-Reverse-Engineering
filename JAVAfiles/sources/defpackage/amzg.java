package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amzg extends apag implements apbu {
    public static final amzg a;
    private static volatile apca f;
    public int b;
    public int c = 0;
    public Object d;
    public int e;

    static {
        amzg amzgVar = new amzg();
        a = amzgVar;
        apag.registerDefaultInstance(amzg.class, amzgVar);
    }

    private amzg() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002<\u0000", new Object[]{"d", "c", "b", "e", amzl.class});
            case NEW_MUTABLE_INSTANCE:
                return new amzg();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (amzg.class) {
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
