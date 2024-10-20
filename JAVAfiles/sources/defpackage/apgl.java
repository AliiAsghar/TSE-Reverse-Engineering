package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apgl extends apag implements apbu {
    public static final apgl a;
    private static volatile apca f;
    public int b;
    public int c;
    public int d;
    public boolean e;

    static {
        apgl apglVar = new apgl();
        a = apglVar;
        apag.registerDefaultInstance(apgl.class, apglVar);
    }

    private apgl() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"b", "c", apgg.h, "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new apgl();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (apgl.class) {
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
