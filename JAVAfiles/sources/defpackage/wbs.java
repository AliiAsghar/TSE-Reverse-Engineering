package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wbs extends apag implements apbu {
    public static final apap a = new qex(6);
    public static final wbs b;
    private static volatile apca j;
    public int c;
    public wda d;
    public wcz e;
    public wcz f;
    public wbu g;
    public apct h;
    public apao i = emptyIntList();

    static {
        wbs wbsVar = new wbs();
        b = wbsVar;
        apag.registerDefaultInstance(wbs.class, wbsVar);
    }

    private wbs() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\bࠬ", new Object[]{"c", "d", "e", "f", "g", "h", "i", qgk.p});
            case NEW_MUTABLE_INSTANCE:
                return new wbs();
            case NEW_BUILDER:
                return new aozy(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (wbs.class) {
                        apcaVar = j;
                        if (apcaVar == null) {
                            apcaVar = new aozz(b);
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
