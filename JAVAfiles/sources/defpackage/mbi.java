package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mbi extends apag implements apbu {
    public static final mbi a;
    private static volatile apca d;
    public int b;
    public apax c = emptyProtobufList();
    private int e;

    static {
        mbi mbiVar = new mbi();
        a = mbiVar;
        apag.registerDefaultInstance(mbi.class, mbiVar);
    }

    private mbi() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"e", "b", apwb.b, "c", mbg.class});
            case NEW_MUTABLE_INSTANCE:
                return new mbi();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (mbi.class) {
                        apcaVar = d;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            d = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
