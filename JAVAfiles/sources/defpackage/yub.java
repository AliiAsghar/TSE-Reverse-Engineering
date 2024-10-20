package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yub extends apag implements apbu {
    public static final yub a;
    private static volatile apca g;
    public long c;
    public int f;
    public apax b = emptyProtobufList();
    public aozb d = aozb.b;
    public String e = "";

    static {
        yub yubVar = new yub();
        a = yubVar;
        apag.registerDefaultInstance(yub.class, yubVar);
    }

    private yub() {
    }

    public final void a() {
        apax apaxVar = this.b;
        if (!apaxVar.c()) {
            this.b = apag.mutableCopy(apaxVar);
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
                return newMessageInfo(a, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\u0002\u0003\n\u0004Ȉ\u0005\f", new Object[]{"b", yum.class, "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new yub();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (yub.class) {
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
