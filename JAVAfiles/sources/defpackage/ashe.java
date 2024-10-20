package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ashe extends apag implements apbu {
    public static final ashe a;
    private static volatile apca m;
    public int b;
    public int c;
    public long d;
    public ashu g;
    public int h;
    public long i;
    public ashn j;
    public long k;
    public long l;
    private byte n = 2;
    public String e = "";
    public String f = "";

    static {
        ashe asheVar = new ashe();
        a = asheVar;
        apag.registerDefaultInstance(ashe.class, asheVar);
    }

    private ashe() {
        emptyProtobufList();
        emptyProtobufList();
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
                apam apamVar = apwb.n;
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0001\u0001᠌\u0000\u0002᠌\u0005\u0003ဂ\u0006\u0006ဉ\u0007\u0007ဂ\b\bစ\u0001\tဈ\u0002\nဈ\u0003\u000bᐉ\u0004\fဂ\t", new Object[]{"b", "c", apamVar, "h", apamVar, "i", "j", "k", "d", "e", "f", "g", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new ashe();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = m;
                if (apcaVar == null) {
                    synchronized (ashe.class) {
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
