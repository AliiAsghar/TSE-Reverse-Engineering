package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aose extends apag implements apbu {
    public static final aose a;
    private static volatile apca f;
    public int b;
    public aozb c = aozb.b;
    public apao d = emptyIntList();
    public apao e = emptyIntList();

    static {
        aose aoseVar = new aose();
        a = aoseVar;
        apag.registerDefaultInstance(aose.class, aoseVar);
    }

    private aose() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0007\n\u0003\u0000\u0002\u0000\u0007ည\u0001\t\u0016\n\u0016", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aose();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (aose.class) {
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
