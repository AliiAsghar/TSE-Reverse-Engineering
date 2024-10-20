package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amop extends apag implements apbu {
    public static final amop a;
    private static volatile apca h;
    public int b;
    public int c;
    public amoq d;
    public int e;
    public int f;
    public amso g;

    static {
        amop amopVar = new amop();
        a = amopVar;
        apag.registerDefaultInstance(amop.class, amopVar);
    }

    private amop() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005ဉ\u0004", new Object[]{"b", "c", amoo.c, "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new amop();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (amop.class) {
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
