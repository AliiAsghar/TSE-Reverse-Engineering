package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mey extends apag implements apbu {
    public static final apap a = new qex(1);
    public static final mey b;
    private static volatile apca h;
    public int c;
    public boolean d;
    public boolean e;
    public int f;
    public apao g = emptyIntList();

    static {
        mey meyVar = new mey();
        b = meyVar;
        apag.registerDefaultInstance(mey.class, meyVar);
    }

    private mey() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002\u0004ࠬ", new Object[]{"c", "d", "e", "f", "g", hzn.k});
            case NEW_MUTABLE_INSTANCE:
                return new mey();
            case NEW_BUILDER:
                return new aozy(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (mey.class) {
                        apcaVar = h;
                        if (apcaVar == null) {
                            apcaVar = new aozz(b);
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
