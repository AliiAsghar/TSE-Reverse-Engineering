package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoco extends apag implements apbu {
    public static final aoco a;
    private static volatile apca h;
    public int b;
    public int c;
    public int d;
    public int e;
    public apao f = emptyIntList();
    public apax g = emptyProtobufList();

    static {
        aoco aocoVar = new aoco();
        a = aocoVar;
        apag.registerDefaultInstance(aoco.class, aocoVar);
    }

    private aoco() {
    }

    public final void a() {
        apax apaxVar = this.g;
        if (!apaxVar.c()) {
            this.g = apag.mutableCopy(apaxVar);
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0002\u0000\u0001\u0004\u0003\f\u0004\u0004\u0005\f\u0006'\u0007\u001b", new Object[]{"b", "c", "d", "e", "f", "g", aocm.class});
            case NEW_MUTABLE_INSTANCE:
                return new aoco();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (aoco.class) {
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
