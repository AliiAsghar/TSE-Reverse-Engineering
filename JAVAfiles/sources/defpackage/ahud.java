package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahud extends apag implements apbu {
    public static final ahud a;
    private static volatile apca g;
    public long e;
    private int h;
    public apbo f = apbo.a;
    public String b = "";
    public aozb c = aozb.b;
    public String d = "";

    static {
        ahud ahudVar = new ahud();
        a = ahudVar;
        apag.registerDefaultInstance(ahud.class, ahudVar);
    }

    private ahud() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"h", "b", "c", "d", "e", "f", ahuc.a});
            case NEW_MUTABLE_INSTANCE:
                return new ahud();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (ahud.class) {
                        apcaVar = g;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
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
