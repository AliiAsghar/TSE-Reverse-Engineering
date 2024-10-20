package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apiv extends apag implements apbu {
    public static final apiv a;
    private static volatile apca h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;

    static {
        apiv apivVar = new apiv();
        a = apivVar;
        apag.registerDefaultInstance(apiv.class, apivVar);
    }

    private apiv() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"b", "c", aphl.r, "d", aphl.s, "e", aphl.q, "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new apiv();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (apiv.class) {
                        apcaVar = h;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            h = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
