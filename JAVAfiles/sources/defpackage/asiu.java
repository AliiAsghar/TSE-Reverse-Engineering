package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asiu extends apag implements apbu {
    public static final asiu a;
    private static volatile apca h;
    public int b;
    public asiw c;
    public long d;
    public String e = "";
    public int f;
    public long g;

    static {
        asiu asiuVar = new asiu();
        a = asiuVar;
        apag.registerDefaultInstance(asiu.class, asiuVar);
    }

    private asiu() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဃ\u0001\u0006ဈ\u0003\u0007᠌\u0004\bဃ\u0005", new Object[]{"b", "c", "d", "e", "f", asif.i, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new asiu();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (asiu.class) {
                        apcaVar = h;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            h = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
