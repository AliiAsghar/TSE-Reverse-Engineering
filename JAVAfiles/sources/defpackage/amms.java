package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amms extends apag implements apbu {
    public static final amms a;
    private static volatile apca l;
    public int b;
    public int c;
    public int d;
    public apao e;
    public int f;
    public apax g;
    public apax h;
    public int i;
    public String j;
    public int k;

    static {
        amms ammsVar = new amms();
        a = ammsVar;
        apag.registerDefaultInstance(amms.class, ammsVar);
    }

    private amms() {
        emptyIntList();
        emptyIntList();
        this.e = emptyIntList();
        this.g = emptyProtobufList();
        this.h = emptyProtobufList();
        this.j = "";
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0002\r\t\u0000\u0003\u0000\u0002᠌\u0000\u0003င\u0001\u0006᠌\u0002\u0007\u001b\t᠌\u0004\nဈ\u0005\u000bࠞ\f᠌\u0006\r\u001b", new Object[]{"b", "c", amln.u, "d", "f", apwb.d, "g", ammu.class, "i", apwb.g, "j", "e", apwb.k, "k", apwb.h, "h", ammq.class});
            case NEW_MUTABLE_INSTANCE:
                return new amms();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = l;
                if (apcaVar == null) {
                    synchronized (amms.class) {
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
