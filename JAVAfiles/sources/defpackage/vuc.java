package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vuc extends apag implements apbu {
    public static final vuc a;
    private static volatile apca h;
    public long b;
    public String c = "";
    public String d = "";
    public String e = "";
    public apax f = apag.emptyProtobufList();
    public String g = "";

    static {
        vuc vucVar = new vuc();
        a = vucVar;
        apag.registerDefaultInstance(vuc.class, vucVar);
    }

    private vuc() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0002\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ț\u0006Ȉ", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new vuc();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (vuc.class) {
                        apcaVar = h;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            h = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
