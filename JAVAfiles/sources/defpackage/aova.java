package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aova extends apag implements apbu {
    public static final aova a;
    private static volatile apca i;
    public int c;
    public aour d;
    public apax h;
    private int j;
    public String b = "";
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        aova aovaVar = new aova();
        a = aovaVar;
        apag.registerDefaultInstance(aova.class, aovaVar);
    }

    private aova() {
        apag.emptyProtobufList();
        apag.emptyProtobufList();
        this.h = emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0007\u0000\u0001\u0001\u0013\u0007\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0006Ȉ\u0007Ȉ\bȈ\u0011\u001b\u0013ဉ\u0001", new Object[]{"j", "b", "c", "e", "f", "g", "h", aouy.class, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aova();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (aova.class) {
                        apcaVar = i;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            i = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
