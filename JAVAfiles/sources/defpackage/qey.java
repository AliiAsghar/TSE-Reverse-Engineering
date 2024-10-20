package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qey extends apag implements apbu {
    public static final apap a = new qex(0);
    public static final apap b = new qex(2);
    public static final qey c;
    private static volatile apca r;
    public int d;
    public boolean j;
    public boolean l;
    public qei n;
    public qfm o;
    public qev p;
    public qei q;
    public String e = "";
    public apax f = emptyProtobufList();
    public apax g = emptyProtobufList();
    public apao h = emptyIntList();
    public apao i = emptyIntList();
    public String k = "";
    public String m = "";

    static {
        qey qeyVar = new qey();
        c = qeyVar;
        apag.registerDefaultInstance(qey.class, qeyVar);
    }

    private qey() {
    }

    public final void a() {
        apax apaxVar = this.f;
        if (!apaxVar.c()) {
            this.f = apag.mutableCopy(apaxVar);
        }
    }

    public final void b() {
        apax apaxVar = this.g;
        if (!apaxVar.c()) {
            this.g = apag.mutableCopy(apaxVar);
        }
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                apam apamVar = hzn.o;
                return newMessageInfo(c, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0004\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ࠞ\u0005ࠞ\u0006ဇ\u0001\u0007ဈ\u0002\bဉ\u0005\tဉ\u0006\nဉ\u0007\u000bဉ\b\fဇ\u0003\rဈ\u0004", new Object[]{"d", "e", "f", qei.class, "g", qei.class, "h", apamVar, "i", apamVar, "j", "k", "n", "o", "p", "q", "l", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new qey();
            case NEW_BUILDER:
                return new aozy(c);
            case GET_DEFAULT_INSTANCE:
                return c;
            case GET_PARSER:
                apca apcaVar = r;
                if (apcaVar == null) {
                    synchronized (qey.class) {
                        apcaVar = r;
                        if (apcaVar == null) {
                            apcaVar = new aozz(c);
                            r = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
