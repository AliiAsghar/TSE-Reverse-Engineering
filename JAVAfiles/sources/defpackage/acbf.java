package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acbf extends apag implements apbu {
    public static final acbf a;
    private static volatile apca o;
    public int b;
    public int c;
    public int h;
    public int j;
    public int l;
    public int m;
    public boolean n;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public long i = -1;
    public String k = "";

    static {
        acbf acbfVar = new acbf();
        a = acbfVar;
        apag.registerDefaultInstance(acbf.class, acbfVar);
    }

    private acbf() {
        emptyProtobufList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u000b\u0000\u0002\u0002$\u000b\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဈ\u0006\u0013ဂ\u0018\u0017င\u001e\u0019᠌\b ဈ!!ဈ\u0004\"င\"#င#$ဇ$", new Object[]{"b", "c", "d", "e", "g", "i", "j", "h", apkm.u, "k", "f", "l", "m", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new acbf();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = o;
                if (apcaVar == null) {
                    synchronized (acbf.class) {
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
