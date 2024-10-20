package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aotx extends apag implements apbu {
    public static final aotx a;
    private static volatile apca h;
    public int b;
    public int d;
    public aoub e;
    public aouo f;
    public String c = "";
    public apax g = emptyProtobufList();

    static {
        aotx aotxVar = new aotx();
        a = aotxVar;
        apag.registerDefaultInstance(aotx.class, aotxVar);
    }

    private aotx() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001\u0006\u001b", new Object[]{"b", "c", "d", "e", "f", "g", aotv.class});
            case NEW_MUTABLE_INSTANCE:
                return new aotx();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (aotx.class) {
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
