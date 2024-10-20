package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amly extends apag implements apbu {
    public static final amly a;
    private static volatile apca k;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public amlu g;
    public int h;
    public amkr i;
    public amva j;

    static {
        amly amlyVar = new amly();
        a = amlyVar;
        apag.registerDefaultInstance(amly.class, amlyVar);
    }

    private amly() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001᠌\u0000\u0003᠌\u0002\u0004င\u0003\u0005င\u0004\u0006ဉ\u0005\u0007᠌\u0006\bဉ\u0007\tဉ\b", new Object[]{"b", "c", amlv.a, "d", amln.e, "e", "f", "g", "h", wcn.f, "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new amly();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (amly.class) {
                        apcaVar = k;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            k = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
