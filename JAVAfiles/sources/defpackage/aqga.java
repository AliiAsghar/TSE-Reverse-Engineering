package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqga extends apag implements apbu {
    public static final aqga a;
    private static volatile apca h;
    public int b;
    public aozb c = aozb.b;
    public apao d = emptyIntList();
    public apax e = emptyProtobufList();
    public aqfu f;
    public long g;

    static {
        aqga aqgaVar = new aqga();
        a = aqgaVar;
        apag.registerDefaultInstance(aqga.class, aqgaVar);
    }

    private aqga() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0002\u0000\u0001\n\u0002'\u0003ဉ\u0000\u0006\u001b\u0007\u0003", new Object[]{"b", "c", "d", "f", "e", aqfh.class, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aqga();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (aqga.class) {
                        apcaVar = h;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            h = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
