package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amjz extends apag implements apbu {
    public static final apap a = new qex(15);
    public static final amjz b;
    private static volatile apca g;
    public int c;
    public int d;
    public apao e = emptyIntList();
    public int f;

    static {
        amjz amjzVar = new amjz();
        b = amjzVar;
        apag.registerDefaultInstance(amjz.class, amjzVar);
    }

    private amjz() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001᠌\u0000\u0002ࠞ\u0003᠌\u0001", new Object[]{"c", "d", amjw.e, "e", amjw.d, "f", amjw.c});
            case NEW_MUTABLE_INSTANCE:
                return new amjz();
            case NEW_BUILDER:
                return new aozy(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (amjz.class) {
                        apcaVar = g;
                        if (apcaVar == null) {
                            apcaVar = new aozz(b);
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
