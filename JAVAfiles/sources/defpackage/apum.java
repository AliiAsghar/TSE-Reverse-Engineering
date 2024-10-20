package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apum extends apag implements apbu {
    public static final apum a;
    private static volatile apca h;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;
    public apul g;

    static {
        apum apumVar = new apum();
        a = apumVar;
        apag.registerDefaultInstance(apum.class, apumVar);
    }

    private apum() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0004\f\u0005\f\tဉ\u0000", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new apum();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (apum.class) {
                        apcaVar = h;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            h = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
