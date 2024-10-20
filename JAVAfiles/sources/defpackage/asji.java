package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asji extends apag implements apbu {
    public static final asji a;
    private static volatile apca e;
    public int b;
    public apax c = apag.emptyProtobufList();
    public asjh d;

    static {
        asji asjiVar = new asji();
        a = asjiVar;
        apag.registerDefaultInstance(asji.class, asjiVar);
    }

    private asji() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဉ\u0000", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new asji();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (asji.class) {
                        apcaVar = e;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            e = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
