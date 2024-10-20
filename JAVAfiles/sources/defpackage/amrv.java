package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amrv extends apag implements apbu {
    public static final amrv a;
    private static volatile apca h;
    public int b;
    public amsg c;
    public amsb d;
    public int e;
    public int f;
    public int g;

    static {
        amrv amrvVar = new amrv();
        a = amrvVar;
        apag.registerDefaultInstance(amrv.class, amrvVar);
    }

    private amrv() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                apam apamVar = amsa.b;
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004", new Object[]{"b", "c", "d", "e", amqk.u, "f", apamVar, "g", apamVar});
            case NEW_MUTABLE_INSTANCE:
                return new amrv();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (amrv.class) {
                        apcaVar = h;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            h = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
