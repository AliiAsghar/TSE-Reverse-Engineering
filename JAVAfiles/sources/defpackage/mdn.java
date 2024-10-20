package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mdn extends apag implements apbu {
    public static final mdn a;
    private static volatile apca o;
    public int b;
    public long c = -1;
    public long d = -1;
    public boolean e = true;
    public long f = -1;
    public long g = -1;
    public long h = -1;
    public long i = -1;
    public long j = -1;
    public String k;
    public apct l;
    public apct m;
    public long n;

    static {
        mdn mdnVar = new mdn();
        a = mdnVar;
        apag.registerDefaultInstance(mdn.class, mdnVar);
    }

    private mdn() {
        apag.emptyProtobufList();
        this.k = "";
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\u000bဈ\t\fဉ\n\rဂ\f\u000eဉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "n", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new mdn();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = o;
                if (apcaVar == null) {
                    synchronized (mdn.class) {
                        apcaVar = o;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            o = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
