package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amxm extends apag implements apbu {
    public static final amxm a;
    private static volatile apca k;
    public int b;
    public int c;
    public String d = "";
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;

    static {
        amxm amxmVar = new amxm();
        a = amxmVar;
        apag.registerDefaultInstance(amxm.class, amxmVar);
    }

    private amxm() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003င\u0002\u0004᠌\u0004\u0005င\u0005\u0006င\u0006\u0007ဇ\u0007\bင\u0003", new Object[]{"b", "c", "d", "e", "g", amwm.q, "h", "i", "j", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new amxm();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (amxm.class) {
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
