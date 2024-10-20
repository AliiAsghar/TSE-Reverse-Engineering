package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amhx extends apag implements apbu {
    public static final amhx a;
    private static volatile apca m;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public long g;
    public long h;
    public String i = "";
    public long j;
    public amje k;
    public apfr l;

    static {
        amhx amhxVar = new amhx();
        a = amhxVar;
        apag.registerDefaultInstance(amhx.class, amhxVar);
    }

    private amhx() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                apam apamVar = amhj.s;
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006\bဂ\u0007\tဉ\b\u000bဉ\n", new Object[]{"b", "c", apamVar, "d", apamVar, "e", amwm.f, "f", "g", "h", "i", "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new amhx();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = m;
                if (apcaVar == null) {
                    synchronized (amhx.class) {
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
