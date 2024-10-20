package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ymu extends apag implements apbu {
    public static final ymu a;
    private static volatile apca f;
    public int c;
    public apax b = emptyProtobufList();
    public apax d = emptyProtobufList();
    public apax e = emptyProtobufList();

    static {
        ymu ymuVar = new ymu();
        a = ymuVar;
        apag.registerDefaultInstance(ymu.class, ymuVar);
    }

    private ymu() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001b\u0002\f\u0003\u001b\u0004\u001b", new Object[]{"b", ymj.class, "c", "d", ymb.class, "e", ymb.class});
            case NEW_MUTABLE_INSTANCE:
                return new ymu();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (ymu.class) {
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
