package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqgh extends apag implements apbu {
    public static final aqgh a;
    private static volatile apca d;
    public aqfn b;
    public apax c;
    private int e;

    static {
        aqgh aqghVar = new aqgh();
        a = aqghVar;
        apag.registerDefaultInstance(aqgh.class, aqghVar);
    }

    private aqgh() {
        emptyIntList();
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
                return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0005\u001b", new Object[]{"e", "b", "c", aqga.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqgh();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (aqgh.class) {
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
