package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amtf extends apag implements apbu {
    public static final amtf a;
    private static volatile apca g;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;

    static {
        amtf amtfVar = new amtf();
        a = amtfVar;
        apag.registerDefaultInstance(amtf.class, amtfVar);
    }

    private amtf() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004᠌\u0003", new Object[]{"b", "c", amtc.f, "d", amtc.g, "e", "f", amtc.h});
            case NEW_MUTABLE_INSTANCE:
                return new amtf();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (amtf.class) {
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
