package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anah extends apag implements apbu {
    public static final anah a;
    private static volatile apca q;
    public int b;
    public int c;
    public amzw e;
    public anan f;
    public anal g;
    public anak h;
    public anac i;
    public boolean j;
    public String k;
    public int l;
    public String m;
    public int n;
    public int o;
    public boolean p;
    private amzy r;
    private anae s;
    private byte t = 2;
    public int d = 1;

    static {
        anah anahVar = new anah();
        a = anahVar;
        apag.registerDefaultInstance(anah.class, anahVar);
    }

    private anah() {
        emptyProtobufList();
        emptyProtobufList();
        this.k = "";
        this.m = "";
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.t);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.t = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0002\u0001&\u000f\u0000\u0000\u0003\u0001᠌\u0001\u0002ဉ\u0002\u0003ᐉ\u0003\u0005ᐉ\u0006\bᐉ\b\fဉ\t\u000eဉ\n\u0018ဉ\u0017\u001bဇ\u0018\u001eဈ\u001b ᠌\u001d!ဈ\u001e\"᠌\u001f#᠌ &ဇ#", new Object[]{"b", "c", "d", amyg.n, "e", "r", "f", "s", "g", "h", "i", "j", "k", "l", amyg.q, "m", "n", amyg.p, "o", amyg.o, "p"});
            case NEW_MUTABLE_INSTANCE:
                return new anah();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = q;
                if (apcaVar == null) {
                    synchronized (anah.class) {
                        apcaVar = q;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            q = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
