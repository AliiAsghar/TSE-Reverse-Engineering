package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amxd extends apag implements apbu {
    public static final amxd a;
    private static volatile apca m;
    public int b;
    public boolean c;
    public long d;
    public long e;
    public int g;
    public int h;
    public int i;
    public int l;
    public String f = "";
    public String j = "";
    public String k = "";

    static {
        amxd amxdVar = new amxd();
        a = amxdVar;
        apag.registerDefaultInstance(amxd.class, amxdVar);
    }

    private amxd() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007င\u0006\bဈ\u0007\tဈ\b\nင\t", new Object[]{"b", "c", "d", "e", "f", "g", amwm.g, "h", amwm.n, "i", "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new amxd();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = m;
                if (apcaVar == null) {
                    synchronized (amxd.class) {
                        apcaVar = m;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            m = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
