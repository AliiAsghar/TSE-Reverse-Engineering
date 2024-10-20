package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wbz extends apag implements apbu {
    public static final wbz a;
    private static volatile apca h;
    public int b;
    public String c = "";
    public wcz d;
    public wcz e;
    public boolean f;
    public int g;

    static {
        wbz wbzVar = new wbz();
        a = wbzVar;
        apag.registerDefaultInstance(wbz.class, wbzVar);
    }

    private wbz() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005᠌\u0004", new Object[]{"b", "c", "d", "e", "f", "g", qgk.t});
            case NEW_MUTABLE_INSTANCE:
                return new wbz();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (wbz.class) {
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
