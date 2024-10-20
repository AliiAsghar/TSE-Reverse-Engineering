package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anan extends apag implements apbu {
    public static final anan a;
    private static volatile apca k;
    public int b;
    public int c;
    public anai f;
    public anag g;
    public anao h;
    public anap i;
    public anai j;
    private anaq l;
    private anaj m;
    private anaf n;
    private byte o = 2;
    public String d = "";
    public String e = "";

    static {
        anan ananVar = new anan();
        a = ananVar;
        apag.registerDefaultInstance(anan.class, ananVar);
    }

    private anan() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.o);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.o = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u0016\u000b\u0000\u0000\u0004\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bဉ\u0007\tᐉ\b\u0014ဉ\u0013\u0015ဉ\u0014\u0016ဉ\u0015", new Object[]{"b", "c", amyg.t, "d", "e", "l", "m", "n", "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new anan();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (anan.class) {
                        apcaVar = k;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            k = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
