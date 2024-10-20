package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mex extends apag implements apbu {
    public static final mex a;
    private static volatile apca p;
    public int b;
    public int c;
    public amgx d;
    public int e;
    public int h;
    public int j;
    public int k;
    public mey l;
    public int m;
    public long n;
    public int f = -1;
    public int g = -2;
    public int i = -1;
    public int o = -1;

    static {
        mex mexVar = new mex();
        a = mexVar;
        apag.registerDefaultInstance(mex.class, mexVar);
    }

    private mex() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဋ\u0002\u0004ဏ\u0003\u0005ဏ\u0004\u0006᠌\u0005\u0007ဏ\u0006\bဋ\u0007\tဋ\b\nဉ\t\u000b᠌\n\fတ\u000b\rဏ\f", new Object[]{"b", "c", amfz.p, "d", "e", "f", "g", "h", apez.a, "i", "j", "k", "l", "m", amgp.m, "n", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new mex();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = p;
                if (apcaVar == null) {
                    synchronized (mex.class) {
                        apcaVar = p;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            p = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
