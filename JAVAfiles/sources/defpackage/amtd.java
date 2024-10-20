package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amtd extends apag implements apbu {
    public static final amtd a;
    private static volatile apca f;
    public int b;
    public int c;
    public String d = "";
    public int e;

    static {
        amtd amtdVar = new amtd();
        a = amtdVar;
        apag.registerDefaultInstance(amtd.class, amtdVar);
    }

    private amtd() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003᠌\u0002", new Object[]{"b", "c", amtc.a, "d", "e", amtc.b});
            case NEW_MUTABLE_INSTANCE:
                return new amtd();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (amtd.class) {
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
