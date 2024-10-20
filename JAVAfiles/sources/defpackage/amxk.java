package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amxk extends apag implements apbu {
    public static final amxk a;
    private static volatile apca f;
    public int b;
    public String c = "";
    public int d;
    public boolean e;

    static {
        amxk amxkVar = new amxk();
        a = amxkVar;
        apag.registerDefaultInstance(amxk.class, amxkVar);
    }

    private amxk() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0001\u0002ဈ\u0000\u0003ဇ\u0002", new Object[]{"b", "d", "c", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new amxk();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (amxk.class) {
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
