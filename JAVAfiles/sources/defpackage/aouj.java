package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aouj extends apag implements apbu {
    public static final aouj a;
    private static volatile apca b;
    private int c;
    private aoup d;
    private boolean e;
    private apun f;

    static {
        aouj aoujVar = new aouj();
        a = aoujVar;
        apag.registerDefaultInstance(aouj.class, aoujVar);
    }

    private aouj() {
    }

    public static /* synthetic */ void a(aouj aoujVar, apun apunVar) {
        apunVar.getClass();
        aoujVar.f = apunVar;
        aoujVar.c |= 2;
    }

    public static /* synthetic */ void b(aouj aoujVar, aoup aoupVar) {
        aoupVar.getClass();
        aoujVar.d = aoupVar;
        aoujVar.c |= 1;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0003ဉ\u0001", new Object[]{"c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aouj();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = b;
                if (apcaVar == null) {
                    synchronized (aouj.class) {
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
