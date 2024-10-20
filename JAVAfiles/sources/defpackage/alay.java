package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alay extends apag implements apbu {
    public static final alay a;
    private static volatile apca g;
    public String b = "";
    public apax c;
    public boolean d;
    public boolean e;
    public boolean f;

    static {
        alay alayVar = new alay();
        a = alayVar;
        apag.registerDefaultInstance(alay.class, alayVar);
    }

    private alay() {
        emptyProtobufList();
        this.c = emptyProtobufList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0001\u0000\u0001Ȉ\u0003\u001b\u0004\u0007\u0005\u0007\u0006\u0007", new Object[]{"b", "c", alba.class, "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new alay();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (alay.class) {
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
