package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vee extends apag implements apbu {
    public static final vee a;
    private static volatile apca v;
    public int b;
    public String c = "";
    public aozb d = aozb.b;
    public long e;
    public aozb f;
    public aozb g;
    public aozb h;
    public int i;
    public int j;
    public int k;
    public aqfk l;
    public aqfk m;
    public aqfj n;
    public aqfj o;
    public String p;
    public long q;
    public int r;
    public aqhz s;
    public aqhz t;
    public String u;

    static {
        vee veeVar = new vee();
        a = veeVar;
        apag.registerDefaultInstance(vee.class, veeVar);
    }

    private vee() {
        aozb aozbVar = aozb.b;
        this.f = aozbVar;
        this.g = aozbVar;
        this.h = aozbVar;
        this.p = "";
        this.u = "";
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0013\u0000\u0001\u0001\u0015\u0013\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\u0002\u0004\n\u0005\n\b\n\t\f\n\f\u000b\f\fဉ\u0000\rဉ\u0001\u000eဉ\u0002\u000fဉ\u0003\u0010Ȉ\u0011\u0002\u0012\u0004\u0013ဉ\u0004\u0014ဉ\u0005\u0015ለ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u"});
            case NEW_MUTABLE_INSTANCE:
                return new vee();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = v;
                if (apcaVar == null) {
                    synchronized (vee.class) {
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
