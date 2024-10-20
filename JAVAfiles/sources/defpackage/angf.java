package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class angf extends apag implements apbu {
    public static final angf a;
    private static volatile apca p;
    public int b;
    public int c;
    public String d = "";
    public String e;
    public long f;
    public angu g;
    public aozb h;
    public boolean i;
    public String j;
    public boolean k;
    public aozb l;
    public aozb m;
    public long n;
    public String o;

    static {
        angf angfVar = new angf();
        a = angfVar;
        apag.registerDefaultInstance(angf.class, angfVar);
    }

    private angf() {
        aozb aozbVar = aozb.b;
        this.e = "";
        aozb aozbVar2 = aozb.b;
        this.h = aozbVar2;
        this.j = "";
        this.l = aozbVar2;
        this.m = aozbVar2;
        this.o = "";
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\r\u0000\u0001\u0001\u000e\r\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0004Ȉ\u0005\u0002\u0006ဉ\u0000\u0007\n\b\u0007\tȈ\n\u0007\u000b\n\f\n\r\u0002\u000eȈ", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new angf();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = p;
                if (apcaVar == null) {
                    synchronized (angf.class) {
                        apcaVar = p;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            p = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
