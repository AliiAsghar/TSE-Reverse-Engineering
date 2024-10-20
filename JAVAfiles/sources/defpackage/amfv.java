package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amfv extends apag implements apbu {
    public static final amfv a;
    private static volatile apca o;
    public int b;
    public int c;
    public int d;
    public amhb e;
    public int f;
    public amfu g;
    public amkt i;
    public amks j;
    public amkv k;
    public amto l;
    public amvs m;
    public String h = "";
    public String n = "";

    static {
        amfv amfvVar = new amfv();
        a = amfvVar;
        apag.registerDefaultInstance(amfv.class, amfvVar);
    }

    private amfv() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006ဈ\u0005\u0007ဉ\u0006\bဉ\u0007\nဉ\t\rဉ\f\u000eဉ\r\u000fဈ\u000e", new Object[]{"b", "c", amff.q, "d", amff.r, "e", "f", amwm.f, "g", "h", "i", "j", "k", "l", "m", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new amfv();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = o;
                if (apcaVar == null) {
                    synchronized (amfv.class) {
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
