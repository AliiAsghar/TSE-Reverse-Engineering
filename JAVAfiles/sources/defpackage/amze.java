package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amze extends apag implements apbu {
    public static final amze a;
    private static volatile apca l;
    public int b;
    public int c;
    public amzg d;
    public int e;
    public float f;
    public int g;
    public int i;
    public int j;
    public apao h = emptyIntList();
    public String k = "";

    static {
        amze amzeVar = new amze();
        a = amzeVar;
        apag.registerDefaultInstance(amze.class, amzeVar);
    }

    private amze() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0002\u0003ခ\u0003\u0004ဌ\u0004\u0005,\u0006ဉ\u0001\u0007ဌ\u0005\bဌ\u0006\tለ\u0007", new Object[]{"b", "c", "e", "f", "g", "h", "d", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new amze();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = l;
                if (apcaVar == null) {
                    synchronized (amze.class) {
                        apcaVar = l;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            l = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
