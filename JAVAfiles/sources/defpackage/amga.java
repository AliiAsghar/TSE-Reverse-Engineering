package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amga extends apag implements apbu {
    public static final amga a;
    private static volatile apca f;
    public int b;
    public int c;
    public int d;
    public long e;

    static {
        amga amgaVar = new amga();
        a = amgaVar;
        apag.registerDefaultInstance(amga.class, amgaVar);
    }

    private amga() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဂ\u0002", new Object[]{"b", "c", amfz.c, "d", amfz.a, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new amga();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (amga.class) {
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
