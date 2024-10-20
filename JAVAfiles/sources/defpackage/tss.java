package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tss extends apag implements apbu {
    public static final tss a;
    private static volatile apca d;
    public String b = "";
    public apax c = emptyProtobufList();

    static {
        tss tssVar = new tss();
        a = tssVar;
        apag.registerDefaultInstance(tss.class, tssVar);
    }

    private tss() {
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
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"b", "c", qei.class});
            case NEW_MUTABLE_INSTANCE:
                return new tss();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (tss.class) {
                        apcaVar = d;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            d = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
