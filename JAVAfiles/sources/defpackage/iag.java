package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iag extends apag implements apbu {
    public static final iag a;
    private static volatile apca f;
    public int b;
    public apax c = emptyProtobufList();
    public iao d;
    public long e;

    static {
        iag iagVar = new iag();
        a = iagVar;
        apag.registerDefaultInstance(iag.class, iagVar);
    }

    private iag() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဃ\u0001", new Object[]{"b", "c", iah.class, "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new iag();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (iag.class) {
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
