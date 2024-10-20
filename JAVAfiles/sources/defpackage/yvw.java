package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yvw extends apag implements apbu {
    public static final yvw a;
    private static volatile apca q;
    public int b;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public ywd l;
    public apct m;
    public int o;
    public wks p;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String k = "";
    public apax n = emptyProtobufList();

    static {
        yvw yvwVar = new yvw();
        a = yvwVar;
        apag.registerDefaultInstance(yvw.class, yvwVar);
    }

    private yvw() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0007\u0006\u0004\u0007\u0004\b\u0004\tȈ\nဉ\u0000\u000bဉ\u0001\f\u001b\r\u0004\u000eဉ\u0002", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", ywb.class, "o", "p"});
            case NEW_MUTABLE_INSTANCE:
                return new yvw();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = q;
                if (apcaVar == null) {
                    synchronized (yvw.class) {
                        apcaVar = q;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            q = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
