package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alde extends apag implements apbu {
    public static final alde a;
    private static volatile apca m;
    public int b;
    public alcs c;
    public int d;
    public int e;
    public float f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public apao l = emptyIntList();

    static {
        alde aldeVar = new alde();
        a = aldeVar;
        apag.registerDefaultInstance(alde.class, aldeVar);
    }

    private alde() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဉ\u0000\u0002င\u0001\u0003᠌\u0002\u0004ခ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007င\u0006\b᠌\u0007\t᠌\b\nࠬ", new Object[]{"b", "c", "d", "e", ahbp.m, "f", "g", "h", "i", "j", ahbp.n, "k", ahbp.l, "l", apwb.k});
            case NEW_MUTABLE_INSTANCE:
                return new alde();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = m;
                if (apcaVar == null) {
                    synchronized (alde.class) {
                        apcaVar = m;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            m = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
