package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iai extends apag implements apbu {
    public static final iai a;
    private static volatile apca g;
    public int b;
    public aozb c;
    public String d;
    public long e;
    public long f;

    static {
        iai iaiVar = new iai();
        a = iaiVar;
        apag.registerDefaultInstance(iai.class, iaiVar);
    }

    private iai() {
        aozb aozbVar = aozb.b;
        this.c = aozb.b;
        this.d = "";
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0006\n\u0004\u0000\u0000\u0000\u0006ဈ\u0007\u0007ည\u0004\tဂ\b\nဂ\t", new Object[]{"b", "d", "c", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new iai();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (iai.class) {
                        apcaVar = g;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            g = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
