package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amxp extends apag implements apbu {
    public static final amxp a;
    private static volatile apca d;
    public int b;
    public int c;

    static {
        amxp amxpVar = new amxp();
        a = amxpVar;
        apag.registerDefaultInstance(amxp.class, amxpVar);
    }

    private amxp() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", amwm.s});
            case NEW_MUTABLE_INSTANCE:
                return new amxp();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (amxp.class) {
                        apcaVar = d;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            d = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
