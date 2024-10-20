package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amka extends apag implements apbu {
    public static final amka a;
    private static volatile apca h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        amka amkaVar = new amka();
        a = amkaVar;
        apag.registerDefaultInstance(amka.class, amkaVar);
    }

    private amka() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"b", "c", apkm.t, "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new amka();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (amka.class) {
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
