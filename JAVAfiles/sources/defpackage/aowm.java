package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aowm extends apag implements apbu {
    public static final aowm a;
    private static volatile apca f;
    public int d;
    public apax b = emptyProtobufList();
    public apax c = apag.emptyProtobufList();
    public apax e = emptyProtobufList();

    static {
        aowm aowmVar = new aowm();
        a = aowmVar;
        apag.registerDefaultInstance(aowm.class, aowmVar);
    }

    private aowm() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0002\u0005\u0004\u0000\u0003\u0000\u0002\u001b\u0003Ț\u0004\f\u0005\u001b", new Object[]{"b", aowj.class, "c", "d", "e", aowl.class});
            case NEW_MUTABLE_INSTANCE:
                return new aowm();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (aowm.class) {
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
