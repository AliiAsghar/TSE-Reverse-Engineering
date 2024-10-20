package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qel extends apag implements apbu {
    public static final qel a;
    private static volatile apca f;
    public int b;
    public apbo e = apbo.a;
    public String c = "";
    public String d = "";

    static {
        qel qelVar = new qel();
        a = qelVar;
        apag.registerDefaultInstance(qel.class, qelVar);
    }

    private qel() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u00032", new Object[]{"b", "c", "d", "e", qek.a});
            case NEW_MUTABLE_INSTANCE:
                return new qel();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (qel.class) {
                        apcaVar = f;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            f = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
