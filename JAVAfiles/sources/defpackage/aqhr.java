package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqhr extends apag implements apbu {
    public static final aqhr a;
    private static volatile apca k;
    public int b;
    public Object d;
    public aqfn f;
    public aqfn g;
    public apct h;
    public int i;
    public int j;
    public int c = 0;
    public String e = "";

    static {
        aqhr aqhrVar = new aqhr();
        a = aqhrVar;
        apag.registerDefaultInstance(aqhr.class, aqhrVar);
    }

    private aqhr() {
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
                return newMessageInfo(a, "\u0000\f\u0001\u0001\u0001\u000e\f\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0006ဉ\u0003\u0007\f\bȻ\u0000\tȻ\u0000\n<\u0000\u000b<\u0000\f<\u0000\r\f\u000e<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "h", "i", aqhl.class, aqhj.class, aqhk.class, "j", aqhm.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqhr();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (aqhr.class) {
                        apcaVar = k;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            k = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
