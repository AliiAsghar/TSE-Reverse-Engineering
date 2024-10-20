package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqcy extends apag implements apbu {
    public static final apap a = new aqcx(0);
    public static final aqcy b;
    private static volatile apca q;
    public int c;
    public int d;
    public int e;
    public int f;
    public aqbv h;
    public aqdd i;
    public int k;
    public long n;
    public aqcl p;
    public apao g = emptyIntList();
    public String j = "";
    public String l = "";
    public String m = "";
    public String o = "";

    static {
        aqcy aqcyVar = new aqcy();
        b = aqcyVar;
        apag.registerDefaultInstance(aqcy.class, aqcyVar);
    }

    private aqcy() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0000\r\u0000\u0001\u0001\u0010\r\u0000\u0001\u0000\u0001\f\u0003\f\u0004ဉ\u0000\u0005ဉ\u0001\u0006Ȉ\u0007\f\bȈ\tȈ\u000b\u0002\f\f\rȈ\u000eဉ\u0002\u0010,", new Object[]{"c", "d", "f", "h", "i", "j", "k", "l", "m", "n", "e", "o", "p", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aqcy();
            case NEW_BUILDER:
                return new aozy(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                apca apcaVar = q;
                if (apcaVar == null) {
                    synchronized (aqcy.class) {
                        apcaVar = q;
                        if (apcaVar == null) {
                            apcaVar = new aozz(b);
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
