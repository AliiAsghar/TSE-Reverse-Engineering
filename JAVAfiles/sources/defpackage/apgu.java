package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apgu extends apag implements apbu {
    public static final apgu a;
    private static volatile apca f;
    public int b;
    public int c;
    public apgk d;
    public apgj e;

    static {
        apgu apguVar = new apgu();
        a = apguVar;
        apag.registerDefaultInstance(apgu.class, apguVar);
    }

    private apgu() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", apgo.j, "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new apgu();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (apgu.class) {
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
