package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apgp extends apag implements apbu {
    public static final apgp a;
    private static volatile apca f;
    public int b;
    public int c;
    public apgq d;
    public int e;

    static {
        apgp apgpVar = new apgp();
        a = apgpVar;
        apag.registerDefaultInstance(apgp.class, apgpVar);
    }

    private apgp() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"b", "c", apgo.a, "d", "e", apgo.c});
            case NEW_MUTABLE_INSTANCE:
                return new apgp();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (apgp.class) {
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
