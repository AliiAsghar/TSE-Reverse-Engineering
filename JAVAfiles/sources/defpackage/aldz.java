package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aldz extends apag implements apbu {
    public static final aldz a;
    private static volatile apca e;
    public int b;
    public apax c = emptyProtobufList();
    public apax d = apag.emptyProtobufList();

    static {
        aldz aldzVar = new aldz();
        a = aldzVar;
        apag.registerDefaultInstance(aldz.class, aldzVar);
    }

    private aldz() {
        emptyIntList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0002\u0000\u0002\u000b\u0003\u001b\u0004Ț", new Object[]{"b", "c", alep.class, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aldz();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (aldz.class) {
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
