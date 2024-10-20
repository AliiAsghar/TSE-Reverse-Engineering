package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apfo extends apag implements apbu {
    public static final apfo a;
    private static volatile apca q;
    public int b;
    public int c;
    public int e;
    public int f;
    public apfs g;
    public int k;
    public int l;
    public int n;
    public int p;
    public int d = 1;
    public String h = "";
    public String i = "";
    public String j = "";
    public apax m = emptyProtobufList();
    public String o = "";

    static {
        apfo apfoVar = new apfo();
        a = apfoVar;
        apag.registerDefaultInstance(apfo.class, apfoVar);
    }

    private apfo() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004င\u0003\u0005ဉ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tင\b\nင\t\u000b\u001b\f᠌\n\rဈ\u000b\u000e᠌\f", new Object[]{"b", "c", apez.j, "d", apez.m, "e", apez.n, "f", "g", "h", "i", "j", "k", "l", "m", apfn.class, "n", apez.l, "o", "p", apez.k});
            case NEW_MUTABLE_INSTANCE:
                return new apfo();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = q;
                if (apcaVar == null) {
                    synchronized (apfo.class) {
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
