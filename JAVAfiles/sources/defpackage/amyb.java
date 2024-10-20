package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amyb extends apag implements apbu {
    public static final amyb a;
    private static volatile apca d;
    public int b = 0;
    public Object c;

    static {
        amyb amybVar = new amyb();
        a = amybVar;
        apag.registerDefaultInstance(amyb.class, amybVar);
    }

    private amyb() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0001\u0000de\u0002\u0000\u0000\u0000d<\u0000e<\u0000", new Object[]{"c", "b", amya.class, amxz.class});
            case NEW_MUTABLE_INSTANCE:
                return new amyb();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (amyb.class) {
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
