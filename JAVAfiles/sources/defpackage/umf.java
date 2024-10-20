package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class umf extends apag implements apbu {
    public static final umf a;
    private static volatile apca p;
    public int b;
    public int i;
    public boolean k;
    public int l;
    public int m;
    public long o;
    private byte q = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String j = "";
    public String n = "";

    static {
        umf umfVar = new umf();
        a = umfVar;
        apag.registerDefaultInstance(umf.class, umfVar);
    }

    private umf() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.q);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.q = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\n\u0001ᔈ\u0000\u0002ᔈ\u0001\u0003ᔈ\u0002\u0004ᔈ\u0003\u0005ᔈ\u0004\u0006ᔈ\u0005\u0007ᔄ\u0006\bဈ\u0007\tᔇ\b\nᔄ\t\u000bᔄ\n\fဈ\u000b\rဂ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new umf();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = p;
                if (apcaVar == null) {
                    synchronized (umf.class) {
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
