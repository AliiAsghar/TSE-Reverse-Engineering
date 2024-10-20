package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asid extends apag implements apbu {
    private static volatile apca A;
    public static final asid a;
    public int b;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public asiy l;
    public int m;
    public asib n;
    public int o;
    public long p;
    public int q;
    public int r;
    public int s;
    public int t;
    public String u;
    public apar v;
    public String w;
    public asig x;
    public asia y;
    public long z;
    private byte B = 2;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        asid asidVar = new asid();
        a = asidVar;
        apag.registerDefaultInstance(asid.class, asidVar);
    }

    private asid() {
        emptyProtobufList();
        this.u = "";
        this.v = emptyLongList();
        this.w = "";
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.B);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.B = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0018\u0000\u0001\u0001\u001c\u0018\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006ဋ\u0006\u0007ဋ\u0007\b᠌\b\nဉ\t\u000bဉ\u000b\rဂ\u000e\u000e᠌\u000f\u000f᠌\u0010\u0010င\u0012\u0011ဈ\u0013\u0013င\u0011\u0014ဈ\u0015\u0015(\u0016ဉ\u0016\u0018᠌\n\u0019ဈ\u0002\u001aဉ\u0017\u001b᠌\f\u001cဂ\u0018", new Object[]{"b", "c", "d", "f", "g", "h", "i", "j", "k", asif.a, "l", "n", "p", "q", asif.c, "r", asif.b, "t", "u", "s", "w", "v", "x", "m", apwb.t, "e", "y", "o", apwb.u, "z"});
            case NEW_MUTABLE_INSTANCE:
                return new asid();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = A;
                if (apcaVar == null) {
                    synchronized (asid.class) {
                        apcaVar = A;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            A = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
