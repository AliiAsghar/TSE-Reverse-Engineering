package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amoq extends apag implements apbu {
    public static final amoq a;
    private static volatile apca j;
    public int b;
    public Object d;
    public Object f;
    public Object h;
    public aozn i;
    public int c = 0;
    public int e = 0;
    public int g = 0;

    static {
        amoq amoqVar = new amoq();
        a = amoqVar;
        apag.registerDefaultInstance(amoq.class, amoqVar);
    }

    private amoq() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u000e\u0003\u0001\u0002ĭ\u000e\u0000\u0000\u0000\u0002ဉ\u0000e<\u0000f<\u0000g<\u0000É<\u0001Ê<\u0001Ë<\u0001Ì<\u0001Í<\u0001Î<\u0001Ï<\u0001Ð<\u0001Ñ<\u0001ĭ<\u0002", new Object[]{"d", "c", "f", "e", "h", "g", "b", "i", amqj.class, ampa.class, ampp.class, ampq.class, amox.class, ampm.class, ampb.class, ampn.class, amos.class, amor.class, amoy.class, ampo.class, amoz.class});
            case NEW_MUTABLE_INSTANCE:
                return new amoq();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (amoq.class) {
                        apcaVar = j;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            j = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
