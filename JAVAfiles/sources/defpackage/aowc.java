package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aowc extends apag implements apbu {
    public static final aowc a;
    private static volatile apca f;
    public int c;
    public int d;
    public String b = "";
    public apax e = emptyProtobufList();

    static {
        aowc aowcVar = new aowc();
        a = aowcVar;
        apag.registerDefaultInstance(aowc.class, aowcVar);
    }

    private aowc() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u001b", new Object[]{"b", "c", "d", "e", aovr.class});
            case NEW_MUTABLE_INSTANCE:
                return new aowc();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (aowc.class) {
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
