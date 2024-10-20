package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anfy extends apag implements apbu {
    public static final anfy a;
    private static volatile apca k;
    public int d;
    public boolean e;
    public long f;
    public int g;
    public aozb h;
    public boolean i;
    public aozb j;
    private byte l = 2;
    public String b = "";
    public aozb c = aozb.b;

    static {
        anfy anfyVar = new anfy();
        a = anfyVar;
        apag.registerDefaultInstance(anfy.class, anfyVar);
    }

    private anfy() {
        aozb aozbVar = aozb.b;
        this.h = aozbVar;
        this.j = aozbVar;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\t\u0000\u0000\u0001\u000b\t\u0000\u0000\u0000\u0001Ȉ\u0003\u0002\u0004\f\u0006\u0007\u0007\u0004\b\n\t\u0007\n\n\u000b\n", new Object[]{"b", "f", "g", "e", "d", "h", "i", "c", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new anfy();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (anfy.class) {
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
