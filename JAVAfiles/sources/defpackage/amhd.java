package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amhd extends apag implements apbu {
    public static final amhd a;
    private static volatile apca e;
    public int b;
    public int c;
    public amls d;

    static {
        amhd amhdVar = new amhd();
        a = amhdVar;
        apag.registerDefaultInstance(amhd.class, amhdVar);
    }

    private amhd() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"b", "c", amgp.q, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new amhd();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (amhd.class) {
                        apcaVar = e;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            e = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
