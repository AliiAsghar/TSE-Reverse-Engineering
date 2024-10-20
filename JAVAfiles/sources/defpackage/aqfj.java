package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqfj extends apag implements apbu {
    public static final aqfj a;
    private static volatile apca c;
    public apax b = emptyProtobufList();

    static {
        aqfj aqfjVar = new aqfj();
        a = aqfjVar;
        apag.registerDefaultInstance(aqfj.class, aqfjVar);
    }

    private aqfj() {
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
                return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", aqfh.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqfj();
            case NEW_BUILDER:
                return new aozy((float[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (aqfj.class) {
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
