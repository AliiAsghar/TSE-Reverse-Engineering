package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apro extends apag implements apbu {
    public static final apro a;
    private static volatile apca l;
    public int b;
    public Object d;
    public int e;
    public int i;
    public boolean j;
    public aprn k;
    public int c = 0;
    public String f = "";
    public String g = "";
    public apax h = emptyProtobufList();

    static {
        apro aproVar = new apro();
        a = aproVar;
        apag.registerDefaultInstance(apro.class, aproVar);
    }

    private apro() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001\u000b\u0002Ȉ\u0003\f\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b\u0007\tȈ\n\u001b\u000bဉ\u0000", new Object[]{"d", "c", "b", "e", "f", "i", apry.class, aprg.class, aprq.class, aprh.class, "j", "g", "h", apsa.class, "k"});
            case NEW_MUTABLE_INSTANCE:
                return new apro();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = l;
                if (apcaVar == null) {
                    synchronized (apro.class) {
                        apcaVar = l;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            l = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
