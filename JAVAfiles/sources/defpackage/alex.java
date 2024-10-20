package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alex extends apag implements apbu {
    public static final alex a;
    private static volatile apca k;
    public int b;
    public int c;
    public int i;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public apar j = emptyLongList();

    static {
        alex alexVar = new alex();
        a = alexVar;
        apag.registerDefaultInstance(alex.class, alexVar);
    }

    private alex() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\t\u0000\u0000\u0001\u000e\t\u0000\u0001\u0000\u0001\f\u0002\f\u0004Ȉ\u0005Ȉ\bȈ\tȈ\u000b\f\r%\u000eȈ", new Object[]{"b", "c", "d", "e", "f", "h", "i", "j", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new alex();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (alex.class) {
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
