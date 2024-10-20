package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apjy extends apag implements apbu {
    public static final apjy a;
    private static volatile apca f;
    public int b;
    public int c;
    public apax d = emptyProtobufList();
    public int e;

    static {
        apjy apjyVar = new apjy();
        a = apjyVar;
        apag.registerDefaultInstance(apjy.class, apjyVar);
    }

    private apjy() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0004᠌\u0002", new Object[]{"b", "c", apjw.c, "d", apjv.class, "e", apjb.u});
            case NEW_MUTABLE_INSTANCE:
                return new apjy();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (apjy.class) {
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
