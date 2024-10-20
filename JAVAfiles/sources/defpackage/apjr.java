package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apjr extends apag implements apbu {
    private static volatile apca B;
    public static final apjr a;
    public int A;
    public int b;
    public int c;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int n;
    public int o;
    public int p;
    public long q;
    public long r;
    public long s;
    public long t;
    public int u;
    public int v;
    public int y;
    public amva z;
    public String d = "";
    public apao m = emptyIntList();
    public String w = "";
    public String x = "";

    static {
        apjr apjrVar = new apjr();
        a = apjrVar;
        apag.registerDefaultInstance(apjr.class, apjrVar);
    }

    private apjr() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                apam apamVar = apjb.u;
                apam apamVar2 = apjb.s;
                return newMessageInfo(a, "\u0001\u0019\u0000\u0001\u0001\u001a\u0019\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0004\u0005᠌\u0005\u0006᠌\u0006\u0007᠌\u0007\b᠌\b\t᠌\t\n᠌\n\u000b᠌\u000b\f᠌\f\rဂ\r\u000eဂ\u000e\u000fဂ\u000f\u0010ဂ\u0010\u0011᠌\u0011\u0012᠌\u0012\u0013ဈ\u0013\u0014ဈ\u0014\u0015ࠬ\u0016᠌\u0003\u0017᠌\u0015\u0018ဉ\u0016\u001a᠌\u0018", new Object[]{"b", "c", apamVar, "d", "e", apjb.t, "g", apamVar, "h", apjb.r, "i", apamVar, "j", amwm.f, "k", apamVar, "l", apamVar, "n", apamVar2, "o", apamVar, "p", apjw.s, "q", "r", "s", "t", "u", apkm.f, "v", apjw.q, "w", "x", "m", apamVar2, "f", apjw.b, "y", apjw.r, "z", "A", amwm.h});
            case NEW_MUTABLE_INSTANCE:
                return new apjr();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = B;
                if (apcaVar == null) {
                    synchronized (apjr.class) {
                        apcaVar = B;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            B = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
