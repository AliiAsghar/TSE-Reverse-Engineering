package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qfg extends apag implements apbu {
    public static final qfg a;
    private static volatile apca e;
    public apax b = emptyProtobufList();
    public apax c = emptyProtobufList();
    public apax d = emptyProtobufList();

    static {
        qfg qfgVar = new qfg();
        a = qfgVar;
        apag.registerDefaultInstance(qfg.class, qfgVar);
    }

    private qfg() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new Object[]{"b", qea.class, "c", qfw.class, "d", qgy.class});
            case NEW_MUTABLE_INSTANCE:
                return new qfg();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (qfg.class) {
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
