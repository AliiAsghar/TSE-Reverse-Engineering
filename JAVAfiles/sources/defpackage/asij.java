package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asij extends apab implements apac {
    public static final asij a;
    private static volatile apca m;
    public int b;
    public long d;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public int k;
    private byte n = 2;
    public String c = "";
    public String e = "";

    static {
        asij asijVar = new asij();
        a = asijVar;
        apag.registerDefaultInstance(asij.class, asijVar);
    }

    private asij() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002စ\u0003\u0003စ\u0004\u0004ဂ\t\u0005ဂ\n\u0006ဂ\f\u0007᠌\r\bစ\u0001\tဈ\u0002", new Object[]{"b", "c", "f", "g", "h", "i", "j", "k", asif.f, "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new asij();
            case NEW_BUILDER:
                return new apaa(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = m;
                if (apcaVar == null) {
                    synchronized (asij.class) {
                        apcaVar = m;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            m = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
