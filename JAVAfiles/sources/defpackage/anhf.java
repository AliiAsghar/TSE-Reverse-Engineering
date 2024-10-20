package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anhf extends apag implements apbu {
    public static final anhf a;
    private static volatile apca c;
    public int b;

    static {
        anhf anhfVar = new anhf();
        a = anhfVar;
        apag.registerDefaultInstance(anhf.class, anhfVar);
    }

    private anhf() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\f", new Object[]{"b"});
            case NEW_MUTABLE_INSTANCE:
                return new anhf();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (anhf.class) {
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
