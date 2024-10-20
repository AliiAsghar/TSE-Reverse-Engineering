package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mof extends apag implements apbu {
    public static final mof a;
    private static volatile apca n;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;

    static {
        mof mofVar = new mof();
        a = mofVar;
        apag.registerDefaultInstance(mof.class, mofVar);
    }

    private mof() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ဃ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဃ\t\u000bဃ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new mof();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = n;
                if (apcaVar == null) {
                    synchronized (mof.class) {
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
