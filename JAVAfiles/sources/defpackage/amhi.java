package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amhi extends apag implements apbu {
    public static final amhi a;
    private static volatile apca f;
    public int b;
    public int c;
    public ammt d;
    public long e;

    static {
        amhi amhiVar = new amhi();
        a = amhiVar;
        apag.registerDefaultInstance(amhi.class, amhiVar);
    }

    private amhi() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0003ဉ\u0002\u0007ဂ\u0006", new Object[]{"b", "c", amgp.u, "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new amhi();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (amhi.class) {
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
