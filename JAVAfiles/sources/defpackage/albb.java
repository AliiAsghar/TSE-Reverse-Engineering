package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class albb extends apag implements apbu {
    public static final albb a;
    private static volatile apca e;
    public String b = "";
    public apax c = emptyProtobufList();
    public apax d = emptyProtobufList();

    static {
        albb albbVar = new albb();
        a = albbVar;
        apag.registerDefaultInstance(albb.class, albbVar);
    }

    private albb() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b", new Object[]{"b", "c", albi.class, "d", albc.class});
            case NEW_MUTABLE_INSTANCE:
                return new albb();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (albb.class) {
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
