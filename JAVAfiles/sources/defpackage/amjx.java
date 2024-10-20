package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amjx extends apag implements apbu {
    public static final amjx a;
    private static volatile apca k;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public amee i;
    public int j;

    static {
        amjx amjxVar = new amjx();
        a = amjxVar;
        apag.registerDefaultInstance(amjx.class, amjxVar);
    }

    private amjx() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004င\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007ဉ\u0006\b᠌\u0007", new Object[]{"b", "c", "d", amjw.b, "e", amjw.a, "f", "g", ahbp.u, "h", apkm.t, "i", "j", amna.a});
            case NEW_MUTABLE_INSTANCE:
                return new amjx();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (amjx.class) {
                        apcaVar = k;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            k = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
