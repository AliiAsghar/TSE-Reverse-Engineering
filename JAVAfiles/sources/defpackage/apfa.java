package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apfa extends apag implements apbu {
    public static final apfa a;
    private static volatile apca i;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public int f;
    public int g;
    public int h;

    static {
        apfa apfaVar = new apfa();
        a = apfaVar;
        apag.registerDefaultInstance(apfa.class, apfaVar);
    }

    private apfa() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003᠌\u0002\u0004<\u0000\u0005᠌\u0003", new Object[]{"d", "c", "b", "e", apez.b, "f", "g", apez.c, apey.class, "h", apez.a});
            case NEW_MUTABLE_INSTANCE:
                return new apfa();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (apfa.class) {
                        apcaVar = i;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            i = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
