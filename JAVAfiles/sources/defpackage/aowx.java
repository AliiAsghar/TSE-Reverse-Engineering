package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aowx extends apag implements apbu {
    public static final aowx a;
    private static volatile apca c;
    public apax b = emptyProtobufList();

    static {
        aowx aowxVar = new aowx();
        a = aowxVar;
        apag.registerDefaultInstance(aowx.class, aowxVar);
    }

    private aowx() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", aoww.class});
            case NEW_MUTABLE_INSTANCE:
                return new aowx();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (aowx.class) {
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
