package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amkn extends apag implements apbu {
    public static final amkn a;
    private static volatile apca f;
    public int b;
    public int d;
    public String c = "";
    public String e = "";

    static {
        amkn amknVar = new amkn();
        a = amknVar;
        apag.registerDefaultInstance(amkn.class, amknVar);
    }

    private amkn() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", amjw.l, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new amkn();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (amkn.class) {
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
