package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqgg extends apag implements apbu {
    public static final aqgg a;
    private static volatile apca e;
    public int b;
    public aqfn c;
    public apax d = emptyProtobufList();

    static {
        aqgg aqggVar = new aqgg();
        a = aqggVar;
        apag.registerDefaultInstance(aqgg.class, aqggVar);
    }

    private aqgg() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001c", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aqgg();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (aqgg.class) {
                        apcaVar = e;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            e = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
