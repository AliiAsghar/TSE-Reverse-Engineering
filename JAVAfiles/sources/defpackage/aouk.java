package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aouk extends apag implements apbu {
    public static final aouk a;
    private static volatile apca c;
    public apax b = emptyProtobufList();

    static {
        aouk aoukVar = new aouk();
        a = aoukVar;
        apag.registerDefaultInstance(aouk.class, aoukVar);
    }

    private aouk() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", aouj.class});
            case NEW_MUTABLE_INSTANCE:
                return new aouk();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (aouk.class) {
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
