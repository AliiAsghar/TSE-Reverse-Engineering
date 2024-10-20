package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xsb extends apag implements apbu {
    public static final xsb a;
    private static volatile apca m;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public aozb f = aozb.b;
    public String g = "";
    public String h = "";
    public qel i;
    public qel j;
    public long k;
    public qei l;

    static {
        xsb xsbVar = new xsb();
        a = xsbVar;
        apag.registerDefaultInstance(xsb.class, xsbVar);
    }

    private xsb() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ည\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဉ\u0006\tဉ\u0007\nဂ\b\u000bဉ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new xsb();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = m;
                if (apcaVar == null) {
                    synchronized (xsb.class) {
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
