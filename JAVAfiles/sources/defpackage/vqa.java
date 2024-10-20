package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vqa extends apag implements apbu {
    public static final vqa a;
    private static volatile apca f;
    public int b;
    public Object d;
    public int c = 0;
    public aozb e = aozb.b;

    static {
        vqa vqaVar = new vqa();
        a = vqaVar;
        apag.registerDefaultInstance(vqa.class, vqaVar);
    }

    private vqa() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0004\u0001\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005ည\u0000", new Object[]{"d", "c", "b", vqe.class, vqb.class, vqf.class, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new vqa();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (vqa.class) {
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
