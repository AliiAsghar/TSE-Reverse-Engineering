package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ashi extends apag implements apbu {
    public static final ashi a;
    private static volatile apca f;
    public int b;
    public apax c = emptyProtobufList();
    public apax d = emptyProtobufList();
    public ashh e;

    static {
        ashi ashiVar = new ashi();
        a = ashiVar;
        apag.registerDefaultInstance(ashi.class, ashiVar);
    }

    private ashi() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"b", "c", ashl.class, "d", ashg.class, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new ashi();
            case NEW_BUILDER:
                return new aozy((int[][][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (ashi.class) {
                        apcaVar = f;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            f = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
