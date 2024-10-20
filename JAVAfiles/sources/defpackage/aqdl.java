package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqdl extends apag implements apbu {
    public static final aqdl a;
    private static volatile apca c;
    public int b;

    static {
        aqdl aqdlVar = new aqdl();
        a = aqdlVar;
        apag.registerDefaultInstance(aqdl.class, aqdlVar);
    }

    private aqdl() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"b"});
            case NEW_MUTABLE_INSTANCE:
                return new aqdl();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (aqdl.class) {
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
