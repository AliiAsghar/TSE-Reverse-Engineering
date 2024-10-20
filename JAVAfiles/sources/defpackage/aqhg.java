package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqhg extends apag implements apbu {
    public static final aqhg a;
    private static volatile apca k;
    public int b;
    public int c;
    public aqfn d;
    public apax e = emptyProtobufList();
    public apct f;
    public int g;
    public aozb h;
    public int i;
    public aqfn j;

    static {
        aqhg aqhgVar = new aqhg();
        a = aqhgVar;
        apag.registerDefaultInstance(aqhg.class, aqhgVar);
    }

    private aqhg() {
        emptyIntList();
        this.h = aozb.b;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\b\u0000\u0001\u0001\u0011\b\u0000\u0001\u0000\u0001\f\u0002ဉ\u0000\u0003\u001b\u0004ဉ\u0001\u0005\f\u000f\n\u0010\f\u0011ဉ\u0006", new Object[]{"b", "c", "d", "e", aqhr.class, "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new aqhg();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (aqhg.class) {
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
