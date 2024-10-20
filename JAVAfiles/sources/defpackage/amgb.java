package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amgb extends apag implements apbu {
    public static final amgb a;
    private static volatile apca d;
    public int b = 0;
    public Object c;

    static {
        amgb amgbVar = new amgb();
        a = amgbVar;
        apag.registerDefaultInstance(amgb.class, amgbVar);
    }

    private amgb() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000e\u0001\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000", new Object[]{"c", "b", amsh.class, amsf.class, amsd.class, amrz.class, amsc.class, amse.class, amsi.class, amsj.class, amrt.class, amry.class, amrx.class, amrw.class, amrv.class, amru.class});
            case NEW_MUTABLE_INSTANCE:
                return new amgb();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (amgb.class) {
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
