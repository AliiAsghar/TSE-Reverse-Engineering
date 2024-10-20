package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amig extends apag implements apbu {
    public static final amig a;
    private static volatile apca k;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public amif f;
    public int g = -1;
    public apao h = emptyIntList();
    public String i = "";
    public int j;

    static {
        amig amigVar = new amig();
        a = amigVar;
        apag.registerDefaultInstance(amig.class, amigVar);
    }

    private amig() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005င\u0004\u0006'\u0007ဈ\u0005\b᠌\u0006", new Object[]{"b", "c", "d", "e", amid.c, "f", "g", "h", "i", "j", amwm.f});
            case NEW_MUTABLE_INSTANCE:
                return new amig();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (amig.class) {
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
