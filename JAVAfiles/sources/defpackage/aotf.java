package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aotf extends apag implements apbu {
    public static final aotf a;
    private static volatile apca c;
    public apax b = emptyProtobufList();

    static {
        aotf aotfVar = new aotf();
        a = aotfVar;
        apag.registerDefaultInstance(aotf.class, aotfVar);
    }

    private aotf() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{"b"});
            case NEW_MUTABLE_INSTANCE:
                return new aotf();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (aotf.class) {
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
