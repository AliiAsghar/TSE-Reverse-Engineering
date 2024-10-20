package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qfo extends apag implements apbu {
    public static final apap a = new qex(4);
    public static final qfo b;
    private static volatile apca o;
    public int c;
    public qei d;
    public qei e;
    public qei f;
    public apwq i;
    public apct k;
    public amgu l;
    public qgr m;
    private byte p = 2;
    public String g = "";
    public String h = "";
    public apax j = emptyProtobufList();
    public apao n = emptyIntList();

    static {
        qfo qfoVar = new qfo();
        b = qfoVar;
        apag.registerDefaultInstance(qfo.class, qfoVar);
    }

    private qfo() {
    }

    public final void a() {
        apax apaxVar = this.j;
        if (!apaxVar.c()) {
            this.j = apag.mutableCopy(apaxVar);
        }
    }

    public final void b() {
        apao apaoVar = this.n;
        if (!apaoVar.c()) {
            this.n = apag.mutableCopy(apaoVar);
        }
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b2 = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b2 = 0;
                }
                this.p = b2;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\u0001\u0001ဉ\u0000\u0002ဉ\u0002\u0003ဈ\u0005\u0004ဈ\u0006\u0005ဉ\u0007\u0006\u001b\u0007ဉ\b\bᐉ\t\tဉ\n\nࠬ\u000bဉ\u0004", new Object[]{"c", "d", "e", "g", "h", "i", "j", qej.class, "k", "l", "m", "n", hzn.s, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new qfo();
            case NEW_BUILDER:
                return new aozy(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                apca apcaVar = o;
                if (apcaVar == null) {
                    synchronized (qfo.class) {
                        apcaVar = o;
                        if (apcaVar == null) {
                            apcaVar = new aozz(b);
                            o = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
