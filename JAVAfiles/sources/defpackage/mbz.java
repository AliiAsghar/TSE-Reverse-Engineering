package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mbz extends apag implements apbu {
    public static final mbz a;
    private static volatile apca d;
    public int b;
    public double c;
    private int e;

    static {
        mbz mbzVar = new mbz();
        a = mbzVar;
        apag.registerDefaultInstance(mbz.class, mbzVar);
    }

    private mbz() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002က\u0001", new Object[]{"e", "b", hzn.j, "c"});
            case NEW_MUTABLE_INSTANCE:
                return new mbz();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (mbz.class) {
                        apcaVar = d;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            d = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
