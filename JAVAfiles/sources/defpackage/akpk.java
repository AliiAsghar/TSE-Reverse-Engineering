package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akpk extends apag implements apbu {
    public static final akpk a;
    private static volatile apca g;
    public int b;
    public long e;
    public long c = -1;
    public apax d = emptyProtobufList();
    public apao f = emptyIntList();

    static {
        akpk akpkVar = new akpk();
        a = akpkVar;
        apag.registerDefaultInstance(akpk.class, akpkVar);
    }

    private akpk() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဂ\u0000\u0002\u001b\u0003ဂ\u0001\u0004\u0016", new Object[]{"b", "c", "d", akpj.class, "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new akpk();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (akpk.class) {
                        apcaVar = g;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            g = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
