package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajcb extends apag implements apbu {
    public static final ajcb a;
    private static volatile apca e;
    public String b = "";
    public String c = "";
    public int d;

    static {
        ajcb ajcbVar = new ajcb();
        a = ajcbVar;
        apag.registerDefaultInstance(ajcb.class, ajcbVar);
    }

    private ajcb() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new ajcb();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (ajcb.class) {
                        apcaVar = e;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            e = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
