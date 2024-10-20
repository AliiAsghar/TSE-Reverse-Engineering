package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wgi extends apag<wgi, aozy> implements apbu {
    public static final wgi a;
    private static volatile apca e;
    public int b;
    public String c = "";
    public apax d = emptyProtobufList();

    static {
        wgi wgiVar = new wgi();
        a = wgiVar;
        apag.registerDefaultInstance(wgi.class, wgiVar);
    }

    private wgi() {
    }

    public final void a() {
        apax apaxVar = this.d;
        if (!apaxVar.c()) {
            this.d = apag.mutableCopy(apaxVar);
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
                return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ለ\u0000\u0002\u001b", new Object[]{"b", "c", "d", wgh.class});
            case NEW_MUTABLE_INSTANCE:
                return new wgi();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (wgi.class) {
                        apcaVar = e;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            e = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
