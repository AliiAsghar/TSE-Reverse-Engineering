package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wdr extends apag implements apbu {
    public static final wdr a;
    private static volatile apca j;
    public int b;
    public aoyo c;
    public wdu d;
    public wbk e;
    public wca f;
    public wcd g;
    public int h;
    public long i;

    static {
        wdr wdrVar = new wdr();
        a = wdrVar;
        apag.registerDefaultInstance(wdr.class, wdrVar);
    }

    private wdr() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006᠌\u0005\u0007ဂ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", wcn.a, "i"});
            case NEW_MUTABLE_INSTANCE:
                return new wdr();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (wdr.class) {
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
