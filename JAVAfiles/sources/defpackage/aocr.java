package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aocr extends apag implements apbu {
    public static final aocr a;
    private static volatile apca c;
    public long b = -1;
    private int d;

    static {
        aocr aocrVar = new aocr();
        a = aocrVar;
        apag.registerDefaultInstance(aocr.class, aocrVar);
    }

    private aocr() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဂ\u0003", new Object[]{"d", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new aocr();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (aocr.class) {
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
