package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ashc extends apag<ashc, aozy> implements apbu {
    public static final ashc a;
    private static volatile apca c;
    public apao b = emptyIntList();

    static {
        ashc ashcVar = new ashc();
        a = ashcVar;
        apag.registerDefaultInstance(ashc.class, ashcVar);
    }

    private ashc() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"b", apwb.m});
            case NEW_MUTABLE_INSTANCE:
                return new ashc();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (ashc.class) {
                        apcaVar = c;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            c = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
