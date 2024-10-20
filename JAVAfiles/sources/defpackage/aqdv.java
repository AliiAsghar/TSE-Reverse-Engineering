package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqdv extends apag implements apbu {
    public static final aqdv a;
    private static volatile apca h;
    public int b;
    public aqgb c;
    public apax d = emptyProtobufList();
    public boolean e;
    public aqdl f;
    public boolean g;

    static {
        aqdv aqdvVar = new aqdv();
        a = aqdvVar;
        apag.registerDefaultInstance(aqdv.class, aqdvVar);
    }

    private aqdv() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u0007\u0005ဉ\u0002\u0007\u0007", new Object[]{"b", "c", "d", aqfn.class, "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aqdv();
            case NEW_BUILDER:
                return new aozy((char[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (aqdv.class) {
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
