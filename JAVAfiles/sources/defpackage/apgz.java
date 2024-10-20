package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apgz extends apag implements apbu {
    public static final apgz a;
    private static volatile apca g;
    public apao b;
    public apao c;
    public apao d;
    public apao e;
    public apao f;

    static {
        apgz apgzVar = new apgz();
        a = apgzVar;
        apag.registerDefaultInstance(apgz.class, apgzVar);
    }

    private apgz() {
        apag.emptyProtobufList();
        this.b = emptyIntList();
        apag.emptyProtobufList();
        this.c = emptyIntList();
        apag.emptyProtobufList();
        this.d = emptyIntList();
        this.e = emptyIntList();
        this.f = emptyIntList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                apam apamVar = apgg.b;
                return newMessageInfo(a, "\u0001\u0005\u0000\u0000\u0004\b\u0005\u0000\u0005\u0000\u0004ࠞ\u0005ࠞ\u0006ࠞ\u0007ࠞ\bࠞ", new Object[]{"b", apamVar, "c", apamVar, "d", apamVar, "e", apamVar, "f", apamVar});
            case NEW_MUTABLE_INSTANCE:
                return new apgz();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (apgz.class) {
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
