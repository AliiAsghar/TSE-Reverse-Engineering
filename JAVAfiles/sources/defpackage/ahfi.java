package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahfi extends apag implements apbu {
    public static final ahfi a;
    private static volatile apca e;
    public int b;
    public int c = 250;
    public ahfg d;
    private int f;

    static {
        ahfi ahfiVar = new ahfi();
        a = ahfiVar;
        apag.registerDefaultInstance(ahfi.class, ahfiVar);
    }

    private ahfi() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"f", "b", ahbp.d, "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new ahfi();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (ahfi.class) {
                        apcaVar = e;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            e = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
