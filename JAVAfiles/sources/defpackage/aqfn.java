package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqfn extends apag implements apbu {
    public static final aqfn a;
    private static volatile apca f;
    public int b;
    public String c = "";
    public String d = "";
    public aozb e = aozb.b;

    static {
        aqfn aqfnVar = new aqfn();
        a = aqfnVar;
        apag.registerDefaultInstance(aqfn.class, aqfnVar);
    }

    private aqfn() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0006\n", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aqfn();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (aqfn.class) {
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
