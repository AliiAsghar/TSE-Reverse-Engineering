package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpo extends apag implements apbu {
    public static final jpo a;
    private static volatile apca d;
    public apax b = emptyProtobufList();
    public apax c = emptyProtobufList();

    static {
        jpo jpoVar = new jpo();
        a = jpoVar;
        apag.registerDefaultInstance(jpo.class, jpoVar);
    }

    private jpo() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"b", afdg.class, "c", jpn.class});
            case NEW_MUTABLE_INSTANCE:
                return new jpo();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (jpo.class) {
                        apcaVar = d;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            d = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
