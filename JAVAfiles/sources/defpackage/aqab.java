package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class aqab extends apag implements apbu {
    public static final aqab a;
    private static volatile apca c;
    public int b;

    static {
        aqab aqabVar = new aqab();
        a = aqabVar;
        apag.registerDefaultInstance(aqab.class, aqabVar);
    }

    private aqab() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0000\u0000\u0004\u0004", new Object[]{"b"});
            case NEW_MUTABLE_INSTANCE:
                return new aqab();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (aqab.class) {
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
