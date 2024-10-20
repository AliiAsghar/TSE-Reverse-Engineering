package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qez extends apag implements apbu {
    public static final apap a = new qex(3);
    public static final qez b;
    private static volatile apca m;
    public int c;
    public qei e;
    public qfj h;
    public qfa i;
    public qev j;
    public qei k;
    public qfd l;
    public String d = "";
    public apao f = emptyIntList();
    public apax g = emptyProtobufList();

    static {
        qez qezVar = new qez();
        b = qezVar;
        apag.registerDefaultInstance(qez.class, qezVar);
    }

    private qez() {
    }

    public final void a() {
        apao apaoVar = this.f;
        if (!apaoVar.c()) {
            this.f = apag.mutableCopy(apaoVar);
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
                return newMessageInfo(b, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ࠞ\u0004\u001b\u0005ဉ\u0002\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0006\tဉ\u0003", new Object[]{"c", "d", "e", "f", hzn.o, "g", qff.class, "h", "j", "k", "l", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new qez();
            case NEW_BUILDER:
                return new aozy(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                apca apcaVar = m;
                if (apcaVar == null) {
                    synchronized (qez.class) {
                        apcaVar = m;
                        if (apcaVar == null) {
                            apcaVar = new aozz(b);
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
