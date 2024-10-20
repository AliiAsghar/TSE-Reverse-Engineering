package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ampy extends apag implements apbu {
    public static final ampy a;
    private static volatile apca j;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public String h = "";
    public int i;

    static {
        ampy ampyVar = new ampy();
        a = ampyVar;
        apag.registerDefaultInstance(ampy.class, ampyVar);
    }

    private ampy() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0005င\u0004\u0006ဈ\u0005\u0007᠌\u0006", new Object[]{"b", "c", amoo.n, "d", amoo.k, "e", amoo.m, "f", "g", "h", "i", amoo.l});
            case NEW_MUTABLE_INSTANCE:
                return new ampy();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (ampy.class) {
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
