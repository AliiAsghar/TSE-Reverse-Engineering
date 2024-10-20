package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uzw extends apag implements apbu {
    public static final uzw a;
    private static volatile apca f;
    public int b;
    public apax c = apag.emptyProtobufList();
    public apax d = apag.emptyProtobufList();
    public int e;

    static {
        uzw uzwVar = new uzw();
        a = uzwVar;
        apag.registerDefaultInstance(uzw.class, uzwVar);
    }

    private uzw() {
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
                return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ț\u0002Ț\u0003ဌ\u0000", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new uzw();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (uzw.class) {
                        apcaVar = f;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            f = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
