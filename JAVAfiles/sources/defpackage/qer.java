package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qer extends apag implements apbu {
    public static final qer a;
    private static volatile apca d;
    public apax b = emptyProtobufList();
    public apax c = emptyProtobufList();

    static {
        qer qerVar = new qer();
        a = qerVar;
        apag.registerDefaultInstance(qer.class, qerVar);
    }

    private qer() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"b", qdz.class, "c", qfv.class});
            case NEW_MUTABLE_INSTANCE:
                return new qer();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (qer.class) {
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
