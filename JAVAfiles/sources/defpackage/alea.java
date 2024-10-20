package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alea extends apag implements apbu {
    public static final alea a;
    private static volatile apca e;
    public int b;
    public aozb c;
    public aozb d;

    static {
        alea aleaVar = new alea();
        a = aleaVar;
        apag.registerDefaultInstance(alea.class, aleaVar);
    }

    private alea() {
        aozb aozbVar = aozb.b;
        aozb aozbVar2 = aozb.b;
        this.c = aozbVar2;
        this.d = aozbVar2;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0003\u0005\u0003\u0000\u0000\u0000\u0003\n\u0004\u000b\u0005\n", new Object[]{"d", "b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new alea();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (alea.class) {
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
