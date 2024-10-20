package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aocn extends apag implements apbu {
    public static final aocn a;
    private static volatile apca e;
    public int b;
    public apax c = apag.emptyProtobufList();
    public apao d = emptyIntList();

    static {
        aocn aocnVar = new aocn();
        a = aocnVar;
        apag.registerDefaultInstance(aocn.class, aocnVar);
    }

    private aocn() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0004\u0002Ț\u0003'", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aocn();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (aocn.class) {
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
