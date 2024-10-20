package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ames extends apag implements apbu {
    public static final ames a;
    private static volatile apca d;
    public int b = 0;
    public Object c;

    static {
        ames amesVar = new ames();
        a = amesVar;
        apag.registerDefaultInstance(ames.class, amesVar);
    }

    private ames() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000e\u0001\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000", new Object[]{"c", "b", amqg.class, amop.class, ampx.class, ampz.class, amsl.class, amsk.class, amsm.class, amqb.class, amqa.class, amuf.class, amug.class, amuc.class, amsn.class, amqc.class});
            case NEW_MUTABLE_INSTANCE:
                return new ames();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (ames.class) {
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
