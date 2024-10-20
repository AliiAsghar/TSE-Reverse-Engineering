package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qgf extends apag implements apbu {
    public static final qgf a;
    private static volatile apca m;
    public int b;
    public qei c;
    public qei d;
    public qei e;
    public apwq h;
    public qej i;
    public qft k;
    public qgr l;
    public String f = "";
    public String g = "";
    public aozb j = aozb.b;

    static {
        qgf qgfVar = new qgf();
        a = qgfVar;
        apag.registerDefaultInstance(qgf.class, qgfVar);
    }

    private qgf() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bည\u0007\tဉ\b\nဉ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new qgf();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = m;
                if (apcaVar == null) {
                    synchronized (qgf.class) {
                        apcaVar = m;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            m = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
