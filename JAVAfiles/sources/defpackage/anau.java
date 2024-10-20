package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anau extends apag implements apbu {
    public static final anau a;
    private static volatile apca d;
    public int b;
    public long c;
    private int e;
    private int f;
    private byte g = 2;

    static {
        anau anauVar = new anau();
        a = anauVar;
        apag.registerDefaultInstance(anau.class, anauVar);
    }

    private anau() {
    }

    public static /* synthetic */ void a(anau anauVar) {
        anauVar.b |= 4;
        anauVar.f = 0;
    }

    public static /* synthetic */ void b(anau anauVar) {
        anauVar.b |= 2;
        anauVar.e = 0;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔂ\u0000\u0002ᔆ\u0001\u0003ᔆ\u0002", new Object[]{"b", "c", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new anau();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (anau.class) {
                        apcaVar = d;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            d = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
