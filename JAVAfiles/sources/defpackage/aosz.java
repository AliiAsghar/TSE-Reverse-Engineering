package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aosz extends apag implements apbu {
    public static final aosz a;
    private static volatile apca g;
    public int b;
    public String c = "";
    public apax d = emptyProtobufList();
    public String e = "";
    public aota f;

    static {
        aosz aoszVar = new aosz();
        a = aoszVar;
        apag.registerDefaultInstance(aosz.class, aoszVar);
    }

    private aosz() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0001\u0000\u0002Ȉ\u0004\u001b\u0005Ȉ\u0006ဉ\u0000", new Object[]{"b", "c", "d", aoth.class, "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aosz();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (aosz.class) {
                        apcaVar = g;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            g = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
