package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aosc extends apag implements apbu {
    public static final aosc a;
    private static volatile apca y;
    public int b;
    public aose c;
    public aose d;
    public aose e;
    public aose f;
    public aose g;
    public aose h;
    public aose i;
    public aose j;
    public aose k;
    public aose l;
    public aose m;
    public int o;
    public boolean u;
    private byte z = 2;
    public String n = "";
    public String p = "";
    public String q = "";
    public String r = "";
    public String s = "";
    public String t = "";
    public apax v = emptyProtobufList();
    public apax w = emptyProtobufList();
    public String x = "";

    static {
        aosc aoscVar = new aosc();
        a = aoscVar;
        apag.registerDefaultInstance(aosc.class, aoscVar);
    }

    private aosc() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.z);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.z = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0016\u0000\u0001\u0001\u001c\u0016\u0000\u0002\u0003\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tᔈ\u0011\nင\u0012\u000bဈ\u0013\rဈ\u0016\u000fဈ\u0017\u0010ဈ\u0018\u0011ဈ\u0014\u0012ဇ\u0019\u0013Л\u0014Л\u0015ဉ\b\u0017ဈ\u001b\u0019ဉ\t\u001cဉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "n", "o", "p", "r", "s", "t", "q", "u", "v", aosa.class, "w", aosa.class, "k", "x", "l", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new aosc();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = y;
                if (apcaVar == null) {
                    synchronized (aosc.class) {
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
