package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anxx extends apag implements apbu {
    public static final anxx a;
    private static volatile apca k;
    public int b;
    public int c;
    public anxy d;
    public aozb e = aozb.b;
    public aozb f;
    public aozb g;
    public aozb h;
    public aozb i;
    public aozb j;

    static {
        anxx anxxVar = new anxx();
        a = anxxVar;
        apag.registerDefaultInstance(anxx.class, anxxVar);
    }

    private anxx() {
        aozb aozbVar = aozb.b;
        this.f = aozbVar;
        this.g = aozbVar;
        this.h = aozbVar;
        this.i = aozbVar;
        this.j = aozbVar;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new anxx();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (anxx.class) {
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
