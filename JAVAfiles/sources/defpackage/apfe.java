package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apfe extends apag implements apbu {
    public static final apfe a;
    private static volatile apca d;
    public int b;
    public int c;

    static {
        apfe apfeVar = new apfe();
        a = apfeVar;
        apag.registerDefaultInstance(apfe.class, apfeVar);
    }

    private apfe() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u000f\u000f\u0001\u0000\u0000\u0000\u000f᠌\u000e", new Object[]{"b", "c", apjw.n});
            case NEW_MUTABLE_INSTANCE:
                return new apfe();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (apfe.class) {
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
