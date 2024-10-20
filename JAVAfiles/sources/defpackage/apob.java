package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apob extends apag implements apbu {
    public static final apob a;
    private static volatile apca f;
    public Object c;
    public Object e;
    public int b = 0;
    public int d = 0;

    static {
        apob apobVar = new apob();
        a = apobVar;
        apag.registerDefaultInstance(apob.class, apobVar);
    }

    private apob() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0004\u0002\u0000\u0002\u0005\u0004\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0001\u0005<\u0001", new Object[]{"c", "b", "e", "d", appc.class, appa.class, appd.class, appb.class});
            case NEW_MUTABLE_INSTANCE:
                return new apob();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (apob.class) {
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
