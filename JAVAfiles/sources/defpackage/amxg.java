package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amxg extends apag implements apbu {
    public static final amxg a;
    private static volatile apca h;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;

    static {
        amxg amxgVar = new amxg();
        a = amxgVar;
        apag.registerDefaultInstance(amxg.class, amxgVar);
    }

    private amxg() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                apam apamVar = amwm.f;
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"b", "c", "d", apamVar, "e", apamVar, "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new amxg();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (amxg.class) {
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
