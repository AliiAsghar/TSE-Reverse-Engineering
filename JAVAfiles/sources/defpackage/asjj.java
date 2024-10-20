package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asjj extends apag implements apbu {
    public static final asjj a;
    private static volatile apca h;
    public apar b = emptyLongList();
    public apar c = emptyLongList();
    public apao d = emptyIntList();
    public apao e = emptyIntList();
    public apao f = emptyIntList();
    public apax g = apag.emptyProtobufList();

    static {
        asjj asjjVar = new asjj();
        a = asjjVar;
        apag.registerDefaultInstance(asjj.class, asjjVar);
    }

    private asjj() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0006\u0000\u0001%\u0002%\u0003'\u0004'\u0005'\u0006\u001a", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new asjj();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (asjj.class) {
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
