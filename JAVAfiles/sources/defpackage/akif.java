package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akif extends apag implements apbu {
    public static final akif a;
    private static volatile apca f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        akif akifVar = new akif();
        a = akifVar;
        apag.registerDefaultInstance(akif.class, akifVar);
    }

    private akif() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0007\u0001\u0001\u0001\n\u0007\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\u0006=\u0000\nဈ\u0000", new Object[]{"d", "c", "b", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new akif();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (akif.class) {
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
