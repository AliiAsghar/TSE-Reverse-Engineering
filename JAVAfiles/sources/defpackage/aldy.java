package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aldy extends apag implements apbu {
    public static final aldy a;
    private static volatile apca c;
    public apax b = emptyProtobufList();

    static {
        aldy aldyVar = new aldy();
        a = aldyVar;
        apag.registerDefaultInstance(aldy.class, aldyVar);
    }

    private aldy() {
        emptyIntList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0005\u0005\u0001\u0000\u0001\u0000\u0005\u001b", new Object[]{"b", aldz.class});
            case NEW_MUTABLE_INSTANCE:
                return new aldy();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (aldy.class) {
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
