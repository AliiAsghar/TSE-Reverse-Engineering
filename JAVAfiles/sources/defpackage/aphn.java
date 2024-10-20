package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aphn extends apag implements apbu {
    public static final aphn a;
    private static volatile apca u;
    public int b;
    public long c;
    public int d;
    public int f;
    public int g;
    public int i;
    public int k;
    public int o;
    public apfs p;
    public int q;
    public aphj r;
    public int t;
    public int e = 1;
    public String h = "";
    public String j = "";
    public String l = "";
    public String m = "";
    public String n = "";
    public apao s = emptyIntList();

    static {
        aphn aphnVar = new aphn();
        a = aphnVar;
        apag.registerDefaultInstance(aphn.class, aphnVar);
    }

    private aphn() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0012\u0000\u0001\u0001\u0017\u0012\u0000\u0001\u0000\u0001စ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005င\u0004\u0006င\u0006\u0007ဈ\t\bဈ\u000b\t᠌\r\nဉ\u000e\fဈ\u0007\rင\u0010\u0010ဈ\u0005\u0011ဈ\f\u0012ဉ\u0013\u0015င\b\u0016ࠬ\u0017᠌\u0016", new Object[]{"b", "c", "d", anbb.k, "e", anbb.l, "f", anbb.j, "g", "i", "l", "m", "o", apjw.j, "p", "j", "q", "h", "n", "r", "k", "s", aphl.b, "t", aphl.a});
            case NEW_MUTABLE_INSTANCE:
                return new aphn();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = u;
                if (apcaVar == null) {
                    synchronized (aphn.class) {
                        apcaVar = u;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            u = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
