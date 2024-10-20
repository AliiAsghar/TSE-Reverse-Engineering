package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amtm extends apag implements apbu {
    public static final amtm a;
    private static volatile apca f;
    public int b;
    public int c;
    public long d;
    public int e;

    static {
        amtm amtmVar = new amtm();
        a = amtmVar;
        apag.registerDefaultInstance(amtm.class, amtmVar);
    }

    private amtm() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003င\u0002", new Object[]{"b", "c", amtc.j, "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new amtm();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (amtm.class) {
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
