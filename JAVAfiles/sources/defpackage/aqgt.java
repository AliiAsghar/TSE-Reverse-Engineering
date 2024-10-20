package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqgt extends apag implements apbu {
    public static final aqgt a;
    private static volatile apca d;
    public aqfp b;
    public aqgw c;
    private int e;

    static {
        aqgt aqgtVar = new aqgt();
        a = aqgtVar;
        apag.registerDefaultInstance(aqgt.class, aqgtVar);
    }

    private aqgt() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0003\u0006\u0002\u0000\u0000\u0000\u0003ဉ\u0001\u0006ဉ\u0003", new Object[]{"e", "b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aqgt();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (aqgt.class) {
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
