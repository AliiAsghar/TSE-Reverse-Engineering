package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ango extends apag implements apbu {
    public static final ango a;
    private static volatile apca s;
    public int b;
    public angp c;
    public boolean g;
    public anha h;
    public boolean i;
    public boolean k;
    public int l;
    public int m;
    public boolean o;
    public int p;
    public int q;
    public angr r;
    private boolean t;
    public String d = "";
    public String e = "";
    public String f = "";
    public String j = "";
    public String n = "";

    static {
        ango angoVar = new ango();
        a = angoVar;
        apag.registerDefaultInstance(ango.class, angoVar);
    }

    private ango() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0011\u0000\u0001\u0001\u0015\u0011\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0005Ȉ\u0006\u0007\u0007ဉ\u0002\b\u0007\nȈ\u000b\u0007\f\u0007\r\u0004\u000e\f\u000fȈ\u0010\u0007\u0013\f\u0014\f\u0015ဉ\u0003", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "t", "k", "l", "m", "n", "o", "p", "q", "r"});
            case NEW_MUTABLE_INSTANCE:
                return new ango();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = s;
                if (apcaVar == null) {
                    synchronized (ango.class) {
                        apcaVar = s;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            s = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
