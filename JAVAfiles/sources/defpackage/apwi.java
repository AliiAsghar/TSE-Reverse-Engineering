package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apwi extends apag implements apbu {
    public static final apwi a;
    private static volatile apca c;
    public apax b = emptyProtobufList();

    static {
        apwi apwiVar = new apwi();
        a = apwiVar;
        apag.registerDefaultInstance(apwi.class, apwiVar);
    }

    private apwi() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", apwh.class});
            case NEW_MUTABLE_INSTANCE:
                return new apwi();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (apwi.class) {
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
