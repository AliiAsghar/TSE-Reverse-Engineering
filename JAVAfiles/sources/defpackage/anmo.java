package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anmo extends apag implements apbu {
    public static final anmo a;
    private static volatile apca z;
    public int b;
    public int e;
    public int f;
    public anmb h;
    public boolean j;
    public aozn k;
    public apct n;
    public boolean o;
    public boolean p;
    public int q;
    public long v;
    public apbo c = apbo.a;
    public apbo y = apbo.a;
    public apax d = emptyProtobufList();
    public String g = "";
    public apax i = emptyProtobufList();
    public String l = "";
    public String m = "";
    public aozb r = aozb.b;
    public String s = "";
    public String t = "";
    public String u = "";
    public apax w = emptyProtobufList();
    public apax x = emptyProtobufList();

    static {
        anmo anmoVar = new anmo();
        a = anmoVar;
        apag.registerDefaultInstance(anmo.class, anmoVar);
    }

    private anmo() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0017\u0000\u0001\u0001\u0018\u0017\u0002\u0004\u0000\u00012\u0002\u001c\u0003\u0004\u0004\u0004\u0005Ȉ\u0006ဉ\u0000\u0007\u001b\b\u0007\nဉ\u0001\u000bȈ\fȈ\rဉ\u0002\u000e\u0007\u000f\u0007\u0010\f\u0011\n\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015\u0002\u0016\u001b\u0017\u001b\u00182", new Object[]{"b", "c", anml.a, "d", "e", "f", "g", "h", "i", anmc.class, "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", apct.class, "x", apct.class, "y", anmk.a});
            case NEW_MUTABLE_INSTANCE:
                return new anmo();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = z;
                if (apcaVar == null) {
                    synchronized (anmo.class) {
                        apcaVar = z;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            z = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
