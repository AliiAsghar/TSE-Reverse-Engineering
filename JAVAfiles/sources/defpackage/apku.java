package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apku extends apag implements apbu {
    public static final apku a;
    private static volatile apca g;
    public int b;
    public apax c = emptyProtobufList();
    public String d = "";
    public String e = "";
    public apkx f;

    static {
        apku apkuVar = new apku();
        a = apkuVar;
        apag.registerDefaultInstance(apku.class, apkuVar);
    }

    private apku() {
    }

    public final void a() {
        apax apaxVar = this.c;
        if (!apaxVar.c()) {
            this.c = apag.mutableCopy(apaxVar);
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
                return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000", new Object[]{"b", "c", apkt.class, "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new apku();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (apku.class) {
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
