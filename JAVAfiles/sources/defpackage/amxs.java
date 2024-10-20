package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amxs extends apag implements apbu {
    public static final amxs a;
    private static volatile apca j;
    public int b;
    public Object d;
    public int e;
    public amxq g;
    public int h;
    public int i;
    public int c = 0;
    public aozb f = aozb.b;

    static {
        amxs amxsVar = new amxs();
        a = amxsVar;
        apag.registerDefaultInstance(amxs.class, amxsVar);
    }

    private amxs() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ည\u0001\u0003ဉ\u0002\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007᠌\u0003\bင\u0004", new Object[]{"d", "c", "b", "e", amwm.t, "f", "g", amxv.class, amxt.class, amxu.class, "h", hzn.g, "i"});
            case NEW_MUTABLE_INSTANCE:
                return new amxs();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (amxs.class) {
                        apcaVar = j;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            j = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
