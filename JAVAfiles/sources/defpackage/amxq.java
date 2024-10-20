package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amxq extends apag implements apbu {
    public static final amxq a;
    private static volatile apca g;
    public int b;
    public int c;
    public int d;
    public int e;
    public amxp f;

    static {
        amxq amxqVar = new amxq();
        a = amxqVar;
        apag.registerDefaultInstance(amxq.class, amxqVar);
    }

    private amxq() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003᠌\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e", amoo.a, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new amxq();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (amxq.class) {
                        apcaVar = g;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
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
