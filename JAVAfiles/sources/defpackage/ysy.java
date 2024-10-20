package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ysy extends apag implements apbu {
    public static final ysy a;
    private static volatile apca c;
    public apax b = emptyProtobufList();

    static {
        ysy ysyVar = new ysy();
        a = ysyVar;
        apag.registerDefaultInstance(ysy.class, ysyVar);
    }

    private ysy() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", ysx.class});
            case NEW_MUTABLE_INSTANCE:
                return new ysy();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (ysy.class) {
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
