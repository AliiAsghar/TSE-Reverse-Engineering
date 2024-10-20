package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vww extends apag implements apbu {
    public static final vww a;
    private static volatile apca f;
    public int b;
    public String c = "";
    public apax d;
    public qei e;

    static {
        vww vwwVar = new vww();
        a = vwwVar;
        apag.registerDefaultInstance(vww.class, vwwVar);
    }

    private vww() {
        apag.emptyProtobufList();
        this.d = emptyProtobufList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001Ȉ\u0003\u001b\u0004ဉ\u0000", new Object[]{"b", "c", "d", msz.class, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new vww();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (vww.class) {
                        apcaVar = f;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            f = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
