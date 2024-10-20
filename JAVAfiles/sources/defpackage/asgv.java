package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asgv extends apag implements apbu {
    public static final asgv a;
    private static volatile apca d;
    public apax b = apag.emptyProtobufList();
    public apax c = apag.emptyProtobufList();

    static {
        asgv asgvVar = new asgv();
        a = asgvVar;
        apag.registerDefaultInstance(asgv.class, asgvVar);
    }

    private asgv() {
        apag.emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001Ț\u0002Ț", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new asgv();
            case NEW_BUILDER:
                return new aozy((float[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (asgv.class) {
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
