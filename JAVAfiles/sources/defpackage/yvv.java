package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yvv extends apag implements apbu {
    public static final yvv a;
    private static volatile apca y;
    public int b;
    public apct g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean p;
    public boolean q;
    public int r;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public String c = "";
    public String d = "";
    public apax e = emptyProtobufList();
    public String f = "";
    public String k = "";
    public String l = "";
    public String m = "";
    public String n = "";
    public String o = "";
    public String s = "";
    public apax x = emptyProtobufList();

    static {
        yvv yvvVar = new yvv();
        a = yvvVar;
        apag.registerDefaultInstance(yvv.class, yvvVar);
    }

    private yvv() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0016\u0000\u0001\u0001\u0016\u0016\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ȉ\u0005ဉ\u0000\u0006\u0007\u0007\u0007\b\u0007\tȈ\nȈ\u000bȈ\fȈ\rȈ\u000e\u0007\u000f\u0007\u0010\u0004\u0011Ȉ\u0012\u0004\u0013\u0004\u0014\u0004\u0015\u0007\u0016\u001b", new Object[]{"b", "c", "d", "e", ywd.class, "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", yvw.class});
            case NEW_MUTABLE_INSTANCE:
                return new yvv();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = y;
                if (apcaVar == null) {
                    synchronized (yvv.class) {
                        apcaVar = y;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            y = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
