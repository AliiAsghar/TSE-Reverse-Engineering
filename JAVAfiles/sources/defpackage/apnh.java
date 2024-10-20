package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apnh extends apag implements apbu {
    public static final apnh a;
    private static volatile apca c;
    public apax b = emptyProtobufList();

    static {
        apnh apnhVar = new apnh();
        a = apnhVar;
        apag.registerDefaultInstance(apnh.class, apnhVar);
    }

    private apnh() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", apng.class});
            case NEW_MUTABLE_INSTANCE:
                return new apnh();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (apnh.class) {
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
