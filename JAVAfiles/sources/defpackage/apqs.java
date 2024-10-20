package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apqs extends apag implements apbu {
    public static final apap a = new aqcx(1);
    public static final apqs b;
    private static volatile apca g;
    public int c;
    public apqq d;
    public int e;
    public apao f = emptyIntList();

    static {
        apqs apqsVar = new apqs();
        b = apqsVar;
        apag.registerDefaultInstance(apqs.class, apqsVar);
    }

    private apqs() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0003\f\u0004,", new Object[]{"c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new apqs();
            case NEW_BUILDER:
                return new aozy(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (apqs.class) {
                        apcaVar = g;
                        if (apcaVar == null) {
                            apcaVar = new aozz(b);
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
