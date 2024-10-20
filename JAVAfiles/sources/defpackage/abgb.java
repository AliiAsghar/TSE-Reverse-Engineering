package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abgb extends apag implements apbu {
    public static final abgb a;
    private static volatile apca e;
    public int b;
    public long c;
    public boolean d;
    private apbo f = apbo.a;
    private apbo g = apbo.a;

    static {
        abgb abgbVar = new abgb();
        a = abgbVar;
        apag.registerDefaultInstance(abgb.class, abgbVar);
    }

    private abgb() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0007\u000e\u0004\u0002\u0000\u0000\u00072\b2\tဂ\u0000\u000eဇ\u0004", new Object[]{"b", "f", abfz.a, "g", abga.a, "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new abgb();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (abgb.class) {
                        apcaVar = e;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            e = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
