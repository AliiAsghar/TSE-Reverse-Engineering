package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afnm extends apag implements apbu {
    public static final afnm a;
    private static volatile apca d;
    public apbo b = apbo.a;
    public apbo c = apbo.a;

    static {
        afnm afnmVar = new afnm();
        a = afnmVar;
        apag.registerDefaultInstance(afnm.class, afnmVar);
    }

    private afnm() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"b", afnl.a, "c", afnk.a});
            case NEW_MUTABLE_INSTANCE:
                return new afnm();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (afnm.class) {
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
