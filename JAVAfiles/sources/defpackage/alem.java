package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alem extends apag implements apbu {
    public static final alem a;
    private static volatile apca e;
    public int b;
    public alen c;
    private byte f = 2;
    public apax d = emptyProtobufList();

    static {
        alem alemVar = new alem();
        a = alemVar;
        apag.registerDefaultInstance(alem.class, alemVar);
    }

    private alem() {
    }

    public final void a() {
        apax apaxVar = this.d;
        if (!apaxVar.c()) {
            this.d = apag.mutableCopy(apaxVar);
        }
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"b", "c", "d", alea.class});
            case NEW_MUTABLE_INSTANCE:
                return new alem();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (alem.class) {
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
