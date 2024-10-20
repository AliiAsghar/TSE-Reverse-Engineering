package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wru extends apag implements apbu {
    public static final wru a;
    private static volatile apca f;
    public int b;
    public wsa c;
    public apax d = emptyProtobufList();
    public apax e = emptyProtobufList();

    static {
        wru wruVar = new wru();
        a = wruVar;
        apag.registerDefaultInstance(wru.class, wruVar);
    }

    private wru() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b", new Object[]{"b", "c", "d", wrg.class, "e", wrk.class});
            case NEW_MUTABLE_INSTANCE:
                return new wru();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (wru.class) {
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
