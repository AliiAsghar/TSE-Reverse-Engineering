package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class whc extends apag implements apbu {
    public static final whc a;
    public static final apas u = new apas(who.e, who.UNRECOGNIZED);
    public static final apas v = new apas(wfn.e, wfn.UNRECOGNIZED);
    private static volatile apca w;
    public int b;
    public String c;
    public apbo d = apbo.a;
    public String e;
    public whm f;
    public apbo g;
    public apbo h;
    public apbo i;
    public apbo j;
    public apbo k;
    public apbo l;
    public apbo m;
    public apbo n;
    public boolean o;
    public apax p;
    public whm q;
    public apbo r;
    public apbo s;
    public apbo t;
    private apbo x;
    private apbo y;
    private apbo z;

    static {
        whc whcVar = new whc();
        a = whcVar;
        apag.registerDefaultInstance(whc.class, whcVar);
    }

    private whc() {
        apbo apboVar = apbo.a;
        this.x = apboVar;
        this.y = apboVar;
        this.z = apboVar;
        this.g = apboVar;
        this.h = apboVar;
        this.i = apboVar;
        this.j = apboVar;
        this.k = apboVar;
        this.l = apboVar;
        this.m = apboVar;
        this.n = apboVar;
        this.r = apboVar;
        this.s = apboVar;
        this.t = apboVar;
        this.c = "";
        this.e = "";
        this.p = emptyProtobufList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0015\u0000\u0001\u0001\u0017\u0015\u000f\u0001\u0000\u0001Ȉ\u00032\u00042\u00052\u00062\u0007Ȉ\bဉ\u0000\t2\n2\u000b2\r2\u000e2\u000f2\u00102\u0011\u0007\u00122\u0013\u001b\u0014ဉ\u0001\u00152\u00162\u00172", new Object[]{"b", "c", "d", wgm.a, "x", wgz.a, "y", wgo.a, "z", wha.a, "e", "f", "g", wgs.a, "j", wgu.a, "k", whb.a, "l", wgt.a, "h", wgq.a, "m", wgv.a, "n", wgw.a, "o", "i", wgp.a, "p", wfq.class, "q", "r", wgy.a, "s", wgx.a, "t", wgn.a});
            case NEW_MUTABLE_INSTANCE:
                return new whc();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = w;
                if (apcaVar == null) {
                    synchronized (whc.class) {
                        apcaVar = w;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            w = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
