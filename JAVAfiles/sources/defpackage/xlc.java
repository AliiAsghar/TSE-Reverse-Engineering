package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xlc extends apag implements apbu {
    public static final xlc a;
    private static volatile apca h;
    public int b;
    public apax c = emptyProtobufList();
    public xku d;
    public xkw e;
    public boolean f;
    public apct g;

    static {
        xlc xlcVar = new xlc();
        a = xlcVar;
        apag.registerDefaultInstance(xlc.class, xlcVar);
    }

    private xlc() {
    }

    public final void a() {
        apax apaxVar = this.c;
        if (!apaxVar.c()) {
            this.c = apag.mutableCopy(apaxVar);
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
                return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u0007\u0005ဉ\u0002", new Object[]{"b", "c", xlb.class, "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new xlc();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (xlc.class) {
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
