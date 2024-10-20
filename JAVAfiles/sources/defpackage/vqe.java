package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vqe extends apag implements apbu {
    public static final vqe a;
    private static volatile apca h;
    public int b;
    public Object d;
    public vpx f;
    public int c = 0;
    public String e = "";
    public String g = "";

    static {
        vqe vqeVar = new vqe();
        a = vqeVar;
        apag.registerDefaultInstance(vqe.class, vqeVar);
    }

    private vqe() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0005\u0001\u0001\u0002\u0007\u0005\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0005Ȉ\u0006ဉ\u0000\u0007ለ\u0001", new Object[]{"d", "c", "b", vqd.class, vqc.class, "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new vqe();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (vqe.class) {
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
