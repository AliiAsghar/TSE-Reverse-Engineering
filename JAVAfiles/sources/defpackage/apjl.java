package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apjl extends apag implements apbu {
    public static final apjl a;
    private static volatile apca x;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int j;
    public int l;
    public long m;
    public boolean n;
    public int o;
    public int p;
    public apib r;
    public apjj s;
    public apjk t;
    public apji u;
    public apke v;
    public amva w;
    public apao i = emptyIntList();
    public String k = "";
    public String q = "";

    static {
        apjl apjlVar = new apjl();
        a = apjlVar;
        apag.registerDefaultInstance(apjl.class, apjlVar);
    }

    private apjl() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007ࠞ\b᠌\u0006\tဈ\u0007\n᠌\b\u000bဂ\t\fဇ\n\r᠌\u000b\u000e᠌\f\u000fဈ\r\u0010ဉ\u000e\u0011ဉ\u000f\u0012ဉ\u0010\u0013ဉ\u0011\u0014ဉ\u0012\u0015ဉ\u0013", new Object[]{"b", "c", apkm.e, "d", apjb.m, "e", "f", apkm.b, "g", apkm.a, "h", apjw.s, "i", apjw.t, "j", apkm.d, "k", "l", apkm.h, "m", "n", "o", apkm.f, "p", apjw.q, "q", "r", "s", "t", "u", "v", "w"});
            case NEW_MUTABLE_INSTANCE:
                return new apjl();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = x;
                if (apcaVar == null) {
                    synchronized (apjl.class) {
                        apcaVar = x;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            x = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
