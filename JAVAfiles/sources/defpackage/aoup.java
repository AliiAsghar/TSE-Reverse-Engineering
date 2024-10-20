package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoup extends apag implements apbu {
    public static final aoup a;
    private static volatile apca c;
    private String d = "";
    private String e = "";
    public apax b = apag.emptyProtobufList();

    static {
        aoup aoupVar = new aoup();
        a = aoupVar;
        apag.registerDefaultInstance(aoup.class, aoupVar);
    }

    private aoup() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ț", new Object[]{"d", "e", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new aoup();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (aoup.class) {
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
