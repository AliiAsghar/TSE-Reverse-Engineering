package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqeq extends apag implements apbu {
    public static final aqeq a;
    private static volatile apca i;
    public int b;
    public aqgb c;
    public aqfn d;
    public long e;
    public int f;
    public aozb g = aozb.b;
    public aqep h;

    static {
        aqeq aqeqVar = new aqeq();
        a = aqeqVar;
        apag.registerDefaultInstance(aqeq.class, aqeqVar);
    }

    private aqeq() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0010\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0002\u0004\n\rဉ\u0002\u0010\f", new Object[]{"b", "c", "d", "e", "g", "h", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aqeq();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (aqeq.class) {
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
