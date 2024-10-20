package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aplp extends apag implements apbu {
    public static final aplp a;
    private static volatile apca s;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public int q;
    public boolean r;

    static {
        aplp aplpVar = new aplp();
        a = aplpVar;
        apag.registerDefaultInstance(aplp.class, aplpVar);
    }

    private aplp() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0010\u0000\u0001\u0001\u0013\u0010\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nင\t\u000eင\r\u000fင\u000e\u0010ဇ\u000f\u0011င\u0010\u0012င\u0011\u0013ဇ\u0012", new Object[]{"b", "c", apkm.q, "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r"});
            case NEW_MUTABLE_INSTANCE:
                return new aplp();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = s;
                if (apcaVar == null) {
                    synchronized (aplp.class) {
                        apcaVar = s;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            s = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
