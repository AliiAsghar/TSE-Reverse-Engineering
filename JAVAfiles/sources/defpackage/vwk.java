package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vwk extends apag implements apbu {
    public static final vwk a;
    private static volatile apca g;
    public String b = "";
    public apax c = apag.emptyProtobufList();
    public int d;
    public int e;
    public int f;

    static {
        vwk vwkVar = new vwk();
        a = vwkVar;
        apag.registerDefaultInstance(vwk.class, vwkVar);
    }

    private vwk() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003\f\u0004\u000b\u0005\u000b", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new vwk();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (vwk.class) {
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
