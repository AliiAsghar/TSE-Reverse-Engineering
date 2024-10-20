package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yty extends apag implements apbu {
    public static final yty a;
    private static volatile apca g;
    public boolean b;
    public boolean c;
    public apbo f = apbo.a;
    public apax d = emptyProtobufList();
    public apax e = emptyProtobufList();

    static {
        yty ytyVar = new yty();
        a = ytyVar;
        apag.registerDefaultInstance(yty.class, ytyVar);
    }

    private yty() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0002\u0000\u0001\u0007\u0002\u0007\u0003\u001b\u0004\u001b\u00052", new Object[]{"b", "c", "d", apct.class, "e", apct.class, "f", ytx.a});
            case NEW_MUTABLE_INSTANCE:
                return new yty();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (yty.class) {
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
