package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqds extends apag implements apbu {
    public static final aqds a;
    private static volatile apca l;
    public int b;
    public int d;
    public long f;
    public aqfn g;
    public aqfn h;
    public aqfn i;
    public int j;
    public aqdx k;
    public String c = "";
    public aozb e = aozb.b;

    static {
        aqds aqdsVar = new aqds();
        a = aqdsVar;
        apag.registerDefaultInstance(aqds.class, aqdsVar);
    }

    private aqds() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\t\u0000\u0001\u0001\u0017\t\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0002\u0005\f\bဉ\u0000\tဉ\u0001\nဉ\u0002\f\n\u0017ဉ\u0003", new Object[]{"b", "c", "d", "f", "j", "g", "h", "i", "e", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new aqds();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = l;
                if (apcaVar == null) {
                    synchronized (aqds.class) {
                        apcaVar = l;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            l = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
