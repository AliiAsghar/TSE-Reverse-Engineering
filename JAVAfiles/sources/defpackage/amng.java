package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amng extends apag implements apbu {
    public static final amng a;
    private static volatile apca l;
    public int b;
    public int c;
    public int d;
    public int e;
    public apax f = emptyProtobufList();
    public aozn g;
    public int h;
    public int i;
    public int j;
    public int k;

    static {
        amng amngVar = new amng();
        a = amngVar;
        apag.registerDefaultInstance(amng.class, amngVar);
    }

    private amng() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                apam apamVar = amoo.a;
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004\u001b\u0005ဉ\u0003\u0006᠌\u0004\u0007᠌\u0006\b᠌\u0007\t᠌\u0005", new Object[]{"b", "c", amna.h, "d", apamVar, "e", apamVar, "f", amni.class, "g", "h", amna.f, "j", apamVar, "k", apamVar, "i", amna.g});
            case NEW_MUTABLE_INSTANCE:
                return new amng();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = l;
                if (apcaVar == null) {
                    synchronized (amng.class) {
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
