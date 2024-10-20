package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qid extends apag<qid, aozy> implements apbu {
    public static final qid a;
    private static volatile apca s;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public apct g;
    public boolean i;
    public int j;
    public boolean k;
    public int l;
    public boolean m;
    public apct n;
    public apct o;
    private apbo t = apbo.a;
    public String f = "";
    public String h = "";
    public String p = "";
    public String q = "";
    public apax r = apag.emptyProtobufList();

    static {
        qid qidVar = new qid();
        a = qidVar;
        apag.registerDefaultInstance(qid.class, qidVar);
    }

    private qid() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                apam apamVar = qgk.d;
                return newMessageInfo(a, "\u0001\u0010\u0000\u0002\u0002-\u0010\u0001\u0001\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0006ဉ\u0005\u0007ဈ\u0006\bဇ\u0007\t᠌\b\u000eဇ\r\u000f᠌\u000e\u0014ဇ\u0013$2'ဉ$(ဉ%*ဈ&,ဈ'-\u001a", new Object[]{"b", "c", "d", "e", qgk.e, "f", "g", "h", "i", "j", apamVar, "k", "l", apamVar, "m", "t", qib.a, "n", "o", "p", "q", "r"});
            case NEW_MUTABLE_INSTANCE:
                return new qid();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = s;
                if (apcaVar == null) {
                    synchronized (qid.class) {
                        apcaVar = s;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            s = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
