package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoul extends apag implements apbu {
    public static final aoul a;
    private static volatile apca b;
    private int c;
    private aouk d;
    private aouk e;
    private aouk f;
    private aouf g;

    static {
        aoul aoulVar = new aoul();
        a = aoulVar;
        apag.registerDefaultInstance(aoul.class, aoulVar);
    }

    private aoul() {
    }

    public static /* synthetic */ void a(aoul aoulVar, aouk aoukVar) {
        aoukVar.getClass();
        aoulVar.f = aoukVar;
        aoulVar.c |= 4;
    }

    public static /* synthetic */ void b(aoul aoulVar, aouk aoukVar) {
        aoukVar.getClass();
        aoulVar.e = aoukVar;
        aoulVar.c |= 2;
    }

    public static /* synthetic */ void c(aoul aoulVar, aouf aoufVar) {
        aoufVar.getClass();
        aoulVar.g = aoufVar;
        aoulVar.c |= 8;
    }

    public static /* synthetic */ void d(aoul aoulVar, aouk aoukVar) {
        aoukVar.getClass();
        aoulVar.d = aoukVar;
        aoulVar.c |= 1;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aoul();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = b;
                if (apcaVar == null) {
                    synchronized (aoul.class) {
                        apcaVar = b;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            b = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
