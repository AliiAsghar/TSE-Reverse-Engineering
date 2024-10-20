package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amhr extends apag implements apbu {
    public static final amhr a;
    private static volatile apca g;
    public int b;
    public String c = "";
    public String d = "";
    public boolean e;
    public int f;

    static {
        amhr amhrVar = new amhr();
        a = amhrVar;
        apag.registerDefaultInstance(amhr.class, amhrVar);
    }

    private amhr() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", amhj.j});
            case NEW_MUTABLE_INSTANCE:
                return new amhr();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (amhr.class) {
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
