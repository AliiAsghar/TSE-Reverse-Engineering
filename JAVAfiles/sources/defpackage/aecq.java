package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aecq extends apag implements apbu {
    public static final aecq a;
    private static volatile apca e;
    public int b;
    public aecm c;
    public apax d = emptyProtobufList();

    static {
        aecq aecqVar = new aecq();
        a = aecqVar;
        apag.registerDefaultInstance(aecq.class, aecqVar);
    }

    private aecq() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"b", "c", "d", aecs.class});
            case NEW_MUTABLE_INSTANCE:
                return new aecq();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (aecq.class) {
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
