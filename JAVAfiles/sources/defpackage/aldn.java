package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aldn extends apag implements apbu {
    public static final aldn a;
    private static volatile apca f;
    public apax b = apag.emptyProtobufList();
    public apax c = apag.emptyProtobufList();
    public apax d = apag.emptyProtobufList();
    public apax e = apag.emptyProtobufList();

    static {
        aldn aldnVar = new aldn();
        a = aldnVar;
        apag.registerDefaultInstance(aldn.class, aldnVar);
    }

    private aldn() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001a\u0002\u001a\u0003\u001a\u0004\u001a", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aldn();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (aldn.class) {
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
