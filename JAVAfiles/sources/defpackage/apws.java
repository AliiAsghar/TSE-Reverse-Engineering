package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apws extends apag implements apbu {
    public static final apws a;
    private static volatile apca c;
    public apbo b = apbo.a;

    static {
        apws apwsVar = new apws();
        a = apwsVar;
        apag.registerDefaultInstance(apws.class, apwsVar);
    }

    private apws() {
    }

    public final apbo a() {
        apbo apboVar = this.b;
        if (!apboVar.b) {
            this.b = apboVar.a();
        }
        return this.b;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", apwr.a});
            case NEW_MUTABLE_INSTANCE:
                return new apws();
            case NEW_BUILDER:
                return new aozy((char[][]) null, (byte[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (apws.class) {
                        apcaVar = c;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            c = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
