package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alcw extends apag implements apbu {
    public static final alcw a;
    private static volatile apca f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        alcw alcwVar = new alcw();
        a = alcwVar;
        apag.registerDefaultInstance(alcw.class, alcwVar);
    }

    private alcw() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u00027\u0000\u00034\u0000\u0004:\u0000", new Object[]{"d", "c", "b", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new alcw();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (alcw.class) {
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
