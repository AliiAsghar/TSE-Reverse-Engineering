package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoxa extends apag implements apbu {
    public static final aoxa a;
    private static volatile apca j;
    public int b;
    public String c = "";
    public apax d = apag.emptyProtobufList();
    public apax e = apag.emptyProtobufList();
    public apax f = apag.emptyProtobufList();
    public apax g = apag.emptyProtobufList();
    public aowz h;
    public int i;

    static {
        aoxa aoxaVar = new aoxa();
        a = aoxaVar;
        apag.registerDefaultInstance(aoxa.class, aoxaVar);
    }

    private aoxa() {
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
                return newMessageInfo(a, "\u0000\u0007\u0000\u0001\u0001\t\u0007\u0000\u0004\u0000\u0001Ȉ\u0003Ț\u0004Ț\u0005Ț\u0006Ț\bဉ\u0000\t\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aoxa();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (aoxa.class) {
                        apcaVar = j;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            j = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
