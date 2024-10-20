package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qfy extends apag implements apbu {
    public static final qfy a;
    private static volatile apca h;
    public int b;
    public qfb c;
    public apax d = emptyProtobufList();
    public aozb e = aozb.b;
    public qei f;
    public qgr g;

    static {
        qfy qfyVar = new qfy();
        a = qfyVar;
        apag.registerDefaultInstance(qfy.class, qfyVar);
    }

    private qfy() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ည\u0001\u0004ဉ\u0002\nဉ\u0003", new Object[]{"b", "c", "d", qei.class, "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new qfy();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (qfy.class) {
                        apcaVar = h;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            h = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
