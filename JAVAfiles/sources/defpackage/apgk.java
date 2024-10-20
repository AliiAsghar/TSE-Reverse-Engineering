package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apgk extends apag implements apbu {
    public static final apgk a;
    private static volatile apca f;
    public int b;
    public apao c;
    public int d;
    public int e;

    static {
        apgk apgkVar = new apgk();
        a = apgkVar;
        apag.registerDefaultInstance(apgk.class, apgkVar);
    }

    private apgk() {
        apag.emptyProtobufList();
        this.c = emptyIntList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002᠌\u0000\u0003᠌\u0001\u0004ࠞ", new Object[]{"b", "d", apgg.g, "e", apgg.f, "c", apgg.b});
            case NEW_MUTABLE_INSTANCE:
                return new apgk();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (apgk.class) {
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
