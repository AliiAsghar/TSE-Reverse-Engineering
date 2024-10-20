package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqfl extends apag implements apbu {
    public static final aqfl a;
    private static volatile apca h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public String g = "";

    static {
        aqfl aqflVar = new aqfl();
        a = aqflVar;
        apag.registerDefaultInstance(aqfl.class, aqflVar);
    }

    private aqfl() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0006\u0000\u0000\u0003\n\u0006\u0000\u0000\u0000\u0003\u0004\u0004\u0004\u0005\u0004\u0007\f\t\f\nȈ", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aqfl();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (aqfl.class) {
                        apcaVar = h;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            h = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
