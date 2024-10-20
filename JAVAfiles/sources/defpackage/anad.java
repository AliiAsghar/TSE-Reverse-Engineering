package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anad extends apag implements apbu {
    public static final anad a;
    private static volatile apca c;
    public apax b = apag.emptyProtobufList();

    static {
        anad anadVar = new anad();
        a = anadVar;
        apag.registerDefaultInstance(anad.class, anadVar);
    }

    private anad() {
        apag.emptyProtobufList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001a", new Object[]{"b"});
            case NEW_MUTABLE_INSTANCE:
                return new anad();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (anad.class) {
                        apcaVar = c;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            c = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
