package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abjv extends apag implements apbu {
    public static final abjv a;
    private static volatile apca h;
    public int b;
    public int d;
    public boolean f;
    public boolean g;
    private int i;
    public String c = "";
    public apax e = apag.emptyProtobufList();

    static {
        abjv abjvVar = new abjv();
        a = abjvVar;
        apag.registerDefaultInstance(abjv.class, abjvVar);
    }

    private abjv() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003င\u0000\u0004Ț\u0005\u0007\u0006\u0007", new Object[]{"i", "b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new abjv();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (abjv.class) {
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
