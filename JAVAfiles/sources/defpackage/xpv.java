package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xpv extends apag implements apbu {
    public static final xpv a;
    private static volatile apca j;
    public int b;
    public int c;
    public int h;
    public String d = "";
    public String e = "";
    public String f = "";
    public aozb g = aozb.b;
    public String i = "";

    static {
        xpv xpvVar = new xpv();
        a = xpvVar;
        apag.registerDefaultInstance(xpv.class, xpvVar);
    }

    private xpv() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ည\u0004\u0006င\u0005\u0007ဈ\u0006", new Object[]{"b", "c", wcn.l, "d", "e", "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new xpv();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (xpv.class) {
                        apcaVar = j;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            j = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
