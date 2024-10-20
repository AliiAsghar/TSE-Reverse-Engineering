package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apqp extends apag implements apbu {
    public static final apap a = new qex(20);
    public static final apqp b;
    private static volatile apca g;
    public String c = "";
    public String d = "";
    public String e = "";
    public apao f = emptyIntList();

    static {
        apqp apqpVar = new apqp();
        b = apqpVar;
        apag.registerDefaultInstance(apqp.class, apqpVar);
    }

    private apqp() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004,", new Object[]{"c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new apqp();
            case NEW_BUILDER:
                return new aozy(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (apqp.class) {
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
