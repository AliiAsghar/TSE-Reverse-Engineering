package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iar extends apag implements apbu {
    public static final iar a;
    private static volatile apca f;
    public String b = "";
    public String c = "";
    public int d;
    public ias e;
    private int g;

    static {
        iar iarVar = new iar();
        a = iarVar;
        apag.registerDefaultInstance(iar.class, iarVar);
    }

    private iar() {
        emptyProtobufList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဉ\u0003", new Object[]{"g", "b", "c", "d", hzn.f, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new iar();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (iar.class) {
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
