package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apjn extends apag implements apbu {
    public static final apjn a;
    private static volatile apca h;
    public int b;
    public apax c = emptyProtobufList();
    public apjr d;
    public apct e;
    public apct f;
    public int g;

    static {
        apjn apjnVar = new apjn();
        a = apjnVar;
        apag.registerDefaultInstance(apjn.class, apjnVar);
    }

    private apjn() {
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005᠌\u0003", new Object[]{"b", "c", apjy.class, "d", "e", "f", "g", apjb.q});
            case NEW_MUTABLE_INSTANCE:
                return new apjn();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (apjn.class) {
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
