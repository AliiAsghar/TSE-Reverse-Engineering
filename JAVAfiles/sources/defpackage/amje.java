package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amje extends apag implements apbu {
    public static final amje a;
    private static volatile apca f;
    public int b;
    public int c;
    public int d;
    public String e = "";

    static {
        amje amjeVar = new amje();
        a = amjeVar;
        apag.registerDefaultInstance(amje.class, amjeVar);
    }

    private amje() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", amiv.k, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new amje();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (amje.class) {
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
