package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apjg extends apag implements apbu {
    public static final apjg a;
    private static volatile apca s;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int i;
    public int j;
    public int k;
    public long l;
    public int m;
    public int o;
    public int p;
    public int q;
    public String h = "";
    public String n = "";
    public String r = "";

    static {
        apjg apjgVar = new apjg();
        a = apjgVar;
        apag.registerDefaultInstance(apjg.class, apjgVar);
    }

    private apjg() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                apam apamVar = apjb.e;
                return newMessageInfo(a, "\u0004\u0010\u0000\u0001\u0001\u0012\u0010\u0000\u0000\u0000\u0001᠌\u0001\u0002᠌\u0002\u0003᠌\u0003\u0004ဈ\u0005\u0005င\u0006\u0006ဂ\t\bဈ\f\nင\u000e\u000bင\u000f\fင\u0010\r᠌\b\u000e᠌\u0004\u000f᠌\u0000\u0010᠌\u000b\u0011ဈ\u0011\u0012᠌\u0007", new Object[]{"b", "d", apjb.d, "e", apjb.f, "f", apjb.h, "h", "i", "l", "n", "o", "p", "q", "k", apamVar, "g", apjb.g, "c", apjb.j, "m", apjb.i, "r", "j", apamVar});
            case NEW_MUTABLE_INSTANCE:
                return new apjg();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = s;
                if (apcaVar == null) {
                    synchronized (apjg.class) {
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
