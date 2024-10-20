package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apoq extends apag implements apbu {
    public static final apoq a;
    private static volatile apca j;
    public Object c;
    public int d;
    public int h;
    public boolean i;
    public int b = 0;
    public String e = "";
    public String f = "";
    public apax g = emptyProtobufList();

    static {
        apoq apoqVar = new apoq();
        a = apoqVar;
        apag.registerDefaultInstance(apoq.class, apoqVar);
    }

    private apoq() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\n\u0001\u0000\u0001\n\n\u0000\u0001\u0000\u0001\u000b\u0002Ȉ\u0003\f\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b\u0007\tȈ\n\u001b", new Object[]{"c", "b", "d", "e", "h", apoz.class, apok.class, apor.class, apol.class, "i", "f", "g", appf.class});
            case NEW_MUTABLE_INSTANCE:
                return new apoq();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (apoq.class) {
                        apcaVar = j;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            j = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
