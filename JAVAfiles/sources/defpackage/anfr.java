package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anfr extends apag implements apbu {
    private static volatile apca B;
    public static final anfr a;
    public boolean A;
    public int b;
    public anfq e;
    public long f;
    public int g;
    public boolean h;
    public boolean i;
    public int k;
    public boolean l;
    public boolean m;
    public int p;
    public angz q;
    public int t;
    public boolean u;
    public angx v;
    public boolean w;
    public angv x;
    public long y;
    public boolean z;
    public String c = "";
    public String d = "";
    public String j = "";
    public String n = "";
    public String o = "";
    public apax r = emptyProtobufList();
    public apax s = apag.emptyProtobufList();

    static {
        anfr anfrVar = new anfr();
        a = anfrVar;
        apag.registerDefaultInstance(anfr.class, anfrVar);
    }

    private anfr() {
    }

    public final void a() {
        apax apaxVar = this.r;
        if (!apaxVar.c()) {
            this.r = apag.mutableCopy(apaxVar);
        }
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0019\u0000\u0001\u0001\u001e\u0019\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0004ဉ\u0000\u0005\u0002\u0006\u0004\u0007\u0007\n\u0007\u000bȈ\f\f\r\u0007\u000e\u0007\u000fȈ\u0011Ȉ\u0012\f\u0013ဉ\u0002\u0014\u001b\u0015Ț\u0016\f\u0018\u0007\u0019ဉ\u0003\u001a\u0007\u001bဉ\u0004\u001c\u0002\u001d\u0007\u001e\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", ango.class, "s", "t", "u", "v", "w", "x", "y", "z", "A"});
            case NEW_MUTABLE_INSTANCE:
                return new anfr();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = B;
                if (apcaVar == null) {
                    synchronized (anfr.class) {
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
