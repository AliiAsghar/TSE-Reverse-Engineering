package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amwp extends apag implements apbu {
    public static final amwp a;
    private static volatile apca h;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public String f = "";
    public String g = "";

    static {
        amwp amwpVar = new amwp();
        a = amwpVar;
        apag.registerDefaultInstance(amwp.class, amwpVar);
    }

    private amwp() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", amwm.e, "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new amwp();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (amwp.class) {
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
