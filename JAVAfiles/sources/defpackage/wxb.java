package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wxb extends apag implements apbu {
    public static final wxb a;
    private static volatile apca v;
    public int b;
    public int d;
    public int e;
    public int m;
    public boolean o;
    public String c = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String n = "";
    public String p = "";
    public String q = "";
    public String r = "";
    public String s = "";
    public String t = "";
    public String u = "";

    static {
        wxb wxbVar = new wxb();
        a = wxbVar;
        apag.registerDefaultInstance(wxb.class, wxbVar);
    }

    private wxb() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001ለ\u0000\u0002င\u0001\u0003င\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bለ\u0007\tለ\b\nለ\t\u000bင\n\fለ\u000b\rဇ\f\u000eለ\r\u000fለ\u000e\u0010ለ\u000f\u0011ለ\u0010\u0012ለ\u0011\u0013ለ\u0012", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u"});
            case NEW_MUTABLE_INSTANCE:
                return new wxb();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = v;
                if (apcaVar == null) {
                    synchronized (wxb.class) {
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
