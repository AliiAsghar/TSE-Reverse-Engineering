package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asha extends apag<asha, asgz> implements apbu {
    public static final asha a;
    private static volatile apca n;
    public int b;
    public int d;
    public int e;
    public int f;
    public long g;
    public long h;
    public long i;
    public long j;
    public boolean k;
    public asgy l;
    public ashu m;
    private byte o = 2;
    public String c = "";

    static {
        asha ashaVar = new asha();
        a = ashaVar;
        apag.registerDefaultInstance(asha.class, ashaVar);
    }

    private asha() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.o);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.o = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0001\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002\u0004᠌\u0003\u0005ဂ\u0004\u0006ဂ\u0006\u0007ဂ\u0007\bဇ\b\tဉ\t\nဂ\u0005\u000bᐉ\n", new Object[]{"b", "c", "d", apwb.m, "e", "f", apwb.l, "g", "i", "j", "k", "l", "h", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new asha();
            case NEW_BUILDER:
                return new asgz();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = n;
                if (apcaVar == null) {
                    synchronized (asha.class) {
                        apcaVar = n;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            n = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
