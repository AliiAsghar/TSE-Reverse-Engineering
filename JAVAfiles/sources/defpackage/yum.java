package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yum extends apag implements apbu {
    public static final yum a;
    private static volatile apca f;
    public int b;
    public aozb c = aozb.b;
    public aozb d = aozb.b;
    public apct e;

    static {
        yum yumVar = new yum();
        a = yumVar;
        apag.registerDefaultInstance(yum.class, yumVar);
    }

    private yum() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\b\u0003\u0000\u0000\u0000\u0001\n\u0002\n\bဉ\u0000", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new yum();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (yum.class) {
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
