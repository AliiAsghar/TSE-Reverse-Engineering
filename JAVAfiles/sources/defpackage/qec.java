package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qec extends apag implements apbu {
    public static final qec a;
    private static volatile apca g;
    public int b;
    public qfb c;
    public apax d = emptyProtobufList();
    public aozb e = aozb.b;
    public qei f;

    static {
        qec qecVar = new qec();
        a = qecVar;
        apag.registerDefaultInstance(qec.class, qecVar);
    }

    private qec() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ည\u0001\u0004ဉ\u0002", new Object[]{"b", "c", "d", qei.class, "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new qec();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (qec.class) {
                        apcaVar = g;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            g = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
