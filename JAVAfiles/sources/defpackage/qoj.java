package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qoj extends apag implements apbu {
    public static final qoj a;
    private static volatile apca f;
    public int b;
    public apar c = emptyLongList();
    public apax d = emptyProtobufList();
    public int e;

    static {
        qoj qojVar = new qoj();
        a = qojVar;
        apag.registerDefaultInstance(qoj.class, qojVar);
    }

    private qoj() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001%\u0002\u001b\u0003ဌ\u0000", new Object[]{"b", "c", "d", qod.class, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new qoj();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (qoj.class) {
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
