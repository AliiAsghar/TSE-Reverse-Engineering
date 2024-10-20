package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qoo extends apag implements apbu {
    public static final qoo a;
    private static volatile apca w;
    public int b;
    public long c;
    public long d;
    public long i;
    public int n;
    public apct s;
    public int v;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String m = "";
    public String o = "";
    public String p = "";
    public String q = "";
    public String r = "";
    public apax t = emptyProtobufList();
    public String u = "";

    static {
        qoo qooVar = new qoo();
        a = qooVar;
        apag.registerDefaultInstance(qoo.class, qooVar);
    }

    private qoo() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0014\u0000\u0001\u0001\u0014\u0014\u0000\u0001\u0000\u0001\u0002\u0002\u0002\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\u0002\bለ\u0000\tለ\u0001\nለ\u0002\u000bለ\u0003\f\u0004\rለ\u0004\u000eለ\u0005\u000fለ\u0006\u0010ለ\u0007\u0011ဉ\b\u0012\u001b\u0013ለ\t\u0014င\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", qon.class, "u", "v"});
            case NEW_MUTABLE_INSTANCE:
                return new qoo();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = w;
                if (apcaVar == null) {
                    synchronized (qoo.class) {
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
