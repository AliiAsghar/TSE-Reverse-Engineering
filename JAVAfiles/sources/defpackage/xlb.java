package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xlb extends apag implements apbu {
    public static final xlb a;
    private static volatile apca j;
    public int b;
    public Object d;
    public apct g;
    public xla i;
    public int c = 0;
    public aozb e = aozb.b;
    public apax f = emptyProtobufList();
    public apax h = emptyProtobufList();

    static {
        xlb xlbVar = new xlb();
        a = xlbVar;
        apag.registerDefaultInstance(xlb.class, xlbVar);
    }

    private xlb() {
    }

    public final void a() {
        apax apaxVar = this.h;
        if (!apaxVar.c()) {
            this.h = apag.mutableCopy(apaxVar);
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
                return newMessageInfo(a, "\u0000\b\u0001\u0001\u0001\t\b\u0000\u0002\u0000\u0001\n\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006\u001b\u0007ဉ\u0000\b\u001b\tဉ\u0001", new Object[]{"d", "c", "b", "e", xkv.class, xkx.class, xky.class, "f", xlb.class, "g", "h", xlb.class, "i"});
            case NEW_MUTABLE_INSTANCE:
                return new xlb();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (xlb.class) {
                        apcaVar = j;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            j = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
