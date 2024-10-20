package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qgj extends apag implements apbu {
    public static final qgj a;
    private static volatile apca j;
    public int b;
    public Object d;
    public qgr g;
    public qei h;
    public qei i;
    public int c = 0;
    public String e = "";
    public String f = "";

    static {
        qgj qgjVar = new qgj();
        a = qgjVar;
        apag.registerDefaultInstance(qgj.class, qgjVar);
    }

    private qgj() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000e\u0001\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဈ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\bဈ\u0001\tဉ\u0002\n<\u0000\u000bဉ\u0003\fဉ\u0004\r<\u0000\u000e<\u0000", new Object[]{"d", "c", "b", "e", qge.class, qgi.class, qgh.class, qgl.class, qgq.class, qgp.class, "f", "g", qgo.class, "h", "i", qgn.class, qgm.class});
            case NEW_MUTABLE_INSTANCE:
                return new qgj();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (qgj.class) {
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
