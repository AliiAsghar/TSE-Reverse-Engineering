package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qem extends apag implements apbu {
    public static final qem a;
    private static volatile apca g;
    public int b;
    public boolean d;
    public qgr e;
    public String c = "";
    public String f = "";

    static {
        qem qemVar = new qem();
        a = qemVar;
        apag.registerDefaultInstance(qem.class, qemVar);
    }

    private qem() {
    }

    public static /* synthetic */ void a(qem qemVar) {
        qemVar.b |= 2;
        qemVar.d = true;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new qem();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (qem.class) {
                        apcaVar = g;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            g = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
