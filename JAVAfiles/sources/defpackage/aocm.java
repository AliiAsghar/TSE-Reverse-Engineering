package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aocm extends apag implements apbu {
    public static final aocm a;
    private static volatile apca h;
    public int b;
    public float c;
    public int d;
    public String e = "";
    public String f = "";
    public boolean g;

    static {
        aocm aocmVar = new aocm();
        a = aocmVar;
        apag.registerDefaultInstance(aocm.class, aocmVar);
    }

    private aocm() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0000\u0001\b\u0006\u0000\u0000\u0000\u0001\u0004\u0003\u0001\u0004\f\u0005Ȉ\u0006Ȉ\b\u0007", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aocm();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (aocm.class) {
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
