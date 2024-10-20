package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wbn extends apag implements apbu {
    public static final wbn a;
    private static volatile apca g;
    public int b;
    public aoyo c;
    public wcy d;
    public String e = "";
    public apax f = emptyProtobufList();

    static {
        wbn wbnVar = new wbn();
        a = wbnVar;
        apag.registerDefaultInstance(wbn.class, wbnVar);
    }

    private wbn() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0004ဈ\u0003\u0005\u001b", new Object[]{"b", "c", "d", "e", "f", wcz.class});
            case NEW_MUTABLE_INSTANCE:
                return new wbn();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (wbn.class) {
                        apcaVar = g;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            g = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
