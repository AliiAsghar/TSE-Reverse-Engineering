package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agve extends apag implements apbu {
    public static final agve a;
    private static volatile apca c;
    public apax b = emptyProtobufList();

    static {
        agve agveVar = new agve();
        a = agveVar;
        apag.registerDefaultInstance(agve.class, agveVar);
    }

    private agve() {
    }

    public final void a() {
        apax apaxVar = this.b;
        if (!apaxVar.c()) {
            this.b = apag.mutableCopy(apaxVar);
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", agvd.class});
            case NEW_MUTABLE_INSTANCE:
                return new agve();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (agve.class) {
                        apcaVar = c;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            c = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
