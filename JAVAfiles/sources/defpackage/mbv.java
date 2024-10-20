package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mbv extends apag implements apbu {
    public static final mbv a;
    private static volatile apca c;
    public apax b = emptyProtobufList();

    static {
        mbv mbvVar = new mbv();
        a = mbvVar;
        apag.registerDefaultInstance(mbv.class, mbvVar);
    }

    private mbv() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", mbu.class});
            case NEW_MUTABLE_INSTANCE:
                return new mbv();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (mbv.class) {
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
