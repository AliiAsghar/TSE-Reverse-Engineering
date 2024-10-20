package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aors extends apag implements apbu {
    public static final aors a;
    private static volatile apca h;
    public int b;
    public boolean c;
    public boolean f;
    private boolean i;
    public apax d = apag.emptyProtobufList();
    public long e = -1;
    public String g = "";

    static {
        aors aorsVar = new aors();
        a = aorsVar;
        apag.registerDefaultInstance(aors.class, aorsVar);
    }

    private aors() {
    }

    public static /* synthetic */ void a(aors aorsVar) {
        aorsVar.b |= 8;
        aorsVar.i = true;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001a\u0003ဂ\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဈ\u0004", new Object[]{"b", "c", "d", "e", "f", "i", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aors();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (aors.class) {
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
