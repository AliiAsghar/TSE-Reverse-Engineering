package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aedx extends apag implements apbu {
    public static final aedx a;
    private static volatile apca o;
    public int b;
    public long c;
    public long d;
    public apct e;
    public aozb f = aozb.b;
    public aozb g;
    public long h;
    public long i;
    public boolean j;
    public aozb k;
    public boolean l;
    public String m;
    public boolean n;

    static {
        aedx aedxVar = new aedx();
        a = aedxVar;
        apag.registerDefaultInstance(aedx.class, aedxVar);
    }

    private aedx() {
        aozb aozbVar = aozb.b;
        this.g = aozbVar;
        this.k = aozbVar;
        this.m = "";
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\f\u0000\u0001\u0001\u000e\f\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004ည\u0003\u0005ဂ\u0005\u0006ဂ\u0006\u0007ည\u0004\nဇ\u0007\u000bည\b\fဇ\t\rဈ\n\u000eဇ\u000b", new Object[]{"b", "c", "d", "e", "f", "h", "i", "g", "j", "k", "l", "m", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new aedx();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = o;
                if (apcaVar == null) {
                    synchronized (aedx.class) {
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
