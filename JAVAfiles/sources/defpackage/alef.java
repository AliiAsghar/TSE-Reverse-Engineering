package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alef extends apag implements apbu {
    public static final alef a;
    private static volatile apca c;
    public int b;

    static {
        alef alefVar = new alef();
        a = alefVar;
        apag.registerDefaultInstance(alef.class, alefVar);
    }

    private alef() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0000\u0000\u0004\f", new Object[]{"b"});
            case NEW_MUTABLE_INSTANCE:
                return new alef();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (alef.class) {
                        apcaVar = c;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            c = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
