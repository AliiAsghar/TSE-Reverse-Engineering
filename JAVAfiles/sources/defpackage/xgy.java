package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xgy extends apag implements apbu {
    public static final xgy a;
    private static volatile apca e;
    public int b;
    public xgx c;
    public apax d = emptyProtobufList();

    static {
        xgy xgyVar = new xgy();
        a = xgyVar;
        apag.registerDefaultInstance(xgy.class, xgyVar);
    }

    private xgy() {
    }

    public final void a() {
        apax apaxVar = this.d;
        if (!apaxVar.c()) {
            this.d = apag.mutableCopy(apaxVar);
        }
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0004\u001b", new Object[]{"b", "c", "d", apct.class});
            case NEW_MUTABLE_INSTANCE:
                return new xgy();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (xgy.class) {
                        apcaVar = e;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            e = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
