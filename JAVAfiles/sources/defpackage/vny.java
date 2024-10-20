package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vny extends apag implements apbu {
    public static final vny a;
    private static volatile apca g;
    public int b;
    public qei c;
    public qei d;
    public boolean e;
    public vso f;

    static {
        vny vnyVar = new vny();
        a = vnyVar;
        apag.registerDefaultInstance(vny.class, vnyVar);
    }

    private vny() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဉ\u0002\u0003ဉ\u0000\u0004ဉ\u0001\u0005\u0007", new Object[]{"b", "f", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new vny();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (vny.class) {
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
