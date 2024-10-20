package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqff extends apag implements apbu {
    public static final aqff a;
    private static volatile apca f;
    public int b;
    public aqgc c;
    public aqfg d;
    public aozb e = aozb.b;

    static {
        aqff aqffVar = new aqff();
        a = aqffVar;
        apag.registerDefaultInstance(aqff.class, aqffVar);
    }

    private aqff() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0003\b\u0003\u0000\u0000\u0000\u0003ဉ\u0000\u0004ဉ\u0001\b\n", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aqff();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (aqff.class) {
                        apcaVar = f;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            f = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
