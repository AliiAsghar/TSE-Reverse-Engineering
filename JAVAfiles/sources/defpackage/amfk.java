package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amfk extends apag implements apbu {
    public static final amfk a;
    private static volatile apca v;
    public int b;
    public int e;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public amjd q;
    public amgx s;
    public int u;
    public String c = "";
    public String d = "";
    public String f = "";
    public String g = "";
    public String r = "";
    public int t = -1;

    static {
        amfk amfkVar = new amfk();
        a = amfkVar;
        apag.registerDefaultInstance(amfk.class, amfkVar);
    }

    private amfk() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                apam apamVar = ahbp.t;
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003ဈ\u0003\u0004ဈ\u0004\u0005᠌\u0005\u0006᠌\u0006\u0007᠌\u0007\b᠌\b\t᠌\t\n᠌\n\u000b᠌\u000b\f᠌\f\r᠌\r\u000eဉ\u000e\u000fဈ\u0001\u0010ဈ\u000f\u0011ဉ\u0010\u0012᠌\u0011\u0013᠌\u0012", new Object[]{"b", "c", "e", amff.h, "f", "g", "h", apamVar, "i", apamVar, "j", apamVar, "k", apamVar, "l", apamVar, "m", apamVar, "n", amff.g, "o", amwm.f, "p", amfz.p, "q", "d", "r", "s", "t", amdx.a, "u", amiv.c});
            case NEW_MUTABLE_INSTANCE:
                return new amfk();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = v;
                if (apcaVar == null) {
                    synchronized (amfk.class) {
                        apcaVar = v;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            v = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
