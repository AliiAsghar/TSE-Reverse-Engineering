package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uwt extends apag implements apbu {
    public static final uwt a;
    private static volatile apca i;
    public int b;
    public long c;
    public boolean d;
    public boolean e;
    public apct f;
    public boolean g;
    public int h;

    static {
        uwt uwtVar = new uwt();
        a = uwtVar;
        apag.registerDefaultInstance(uwt.class, uwtVar);
    }

    private uwt() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0003\n\u0006\u0000\u0000\u0000\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\tဇ\b\n᠌\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", qgk.h});
            case NEW_MUTABLE_INSTANCE:
                return new uwt();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (uwt.class) {
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
