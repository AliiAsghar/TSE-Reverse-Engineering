package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asjp extends apag implements apbu {
    public static final asjp a;
    private static volatile apca d;
    public apao b = emptyIntList();
    public apao c = emptyIntList();

    static {
        asjp asjpVar = new asjp();
        a = asjpVar;
        apag.registerDefaultInstance(asjp.class, asjpVar);
    }

    private asjp() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001'\u0002'", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new asjp();
            case NEW_BUILDER:
                return new aozy((short[][]) null, (byte[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (asjp.class) {
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
