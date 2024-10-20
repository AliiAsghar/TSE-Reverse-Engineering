package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wca extends apag implements apbu {
    public static final apap a = new qex(7);
    public static final wca b;
    private static volatile apca l;
    public int c;
    public wda d;
    public wcz e;
    public wcz f;
    public apct h;
    public apwq i;
    public boolean j;
    public apax g = emptyProtobufList();
    public apao k = emptyIntList();

    static {
        wca wcaVar = new wca();
        b = wcaVar;
        apag.registerDefaultInstance(wca.class, wcaVar);
    }

    private wca() {
    }

    public final void a() {
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
                return newMessageInfo(b, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဇ\u0005\bࠬ", new Object[]{"c", "d", "e", "f", "g", wce.class, "h", "i", "j", "k", qgk.p});
            case NEW_MUTABLE_INSTANCE:
                return new wca();
            case NEW_BUILDER:
                return new aozy(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                apca apcaVar = l;
                if (apcaVar == null) {
                    synchronized (wca.class) {
                        apcaVar = l;
                        if (apcaVar == null) {
                            apcaVar = new aozz(b);
                            l = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
