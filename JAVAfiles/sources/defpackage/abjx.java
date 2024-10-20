package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abjx extends apag implements apbu {
    public static final abjx a;
    private static volatile apca n;
    public Object c;
    public int e;
    public int b = 0;
    public String d = "";
    public apax f = apag.emptyProtobufList();
    public apao g = emptyIntList();
    public apao h = emptyIntList();
    public apao i = emptyIntList();
    public apar j = emptyLongList();
    public apan k = emptyFloatList();
    public apaj l = emptyDoubleList();
    public apai m = emptyBooleanList();

    static {
        abjx abjxVar = new abjx();
        a = abjxVar;
        apag.registerDefaultInstance(abjx.class, abjxVar);
    }

    private abjx() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0012\u0001\u0000\u0001\u0012\u0012\u0000\b\u0000\u0001Ȉ\u0002\f\u0003Ȼ\u0000\u00047\u0000\u00057\u0000\u00067\u0000\u00075\u0000\b4\u0000\t3\u0000\n:\u0000\u000bȚ\f'\r'\u000e'\u000f%\u0010$\u0011#\u0012*", new Object[]{"c", "b", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new abjx();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = n;
                if (apcaVar == null) {
                    synchronized (abjx.class) {
                        apcaVar = n;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            n = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
