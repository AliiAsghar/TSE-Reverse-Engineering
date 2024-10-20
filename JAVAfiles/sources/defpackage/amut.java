package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amut extends apag implements apbu {
    public static final amut a;
    private static volatile apca i;
    public int b;
    public Object d;
    public int e;
    public amus g;
    public int h;
    public int c = 0;
    public aozb f = aozb.b;

    static {
        amut amutVar = new amut();
        a = amutVar;
        apag.registerDefaultInstance(amut.class, amutVar);
    }

    private amut() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002ည\u0001\u0003ဉ\u0002\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007᠌\u0003", new Object[]{"d", "c", "b", "e", amud.r, "f", "g", amuw.class, amuu.class, amuv.class, "h", wcn.q});
            case NEW_MUTABLE_INSTANCE:
                return new amut();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (amut.class) {
                        apcaVar = i;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            i = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
