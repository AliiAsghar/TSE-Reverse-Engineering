package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apwq extends apag implements apbu {
    public static final apwq a;
    private static volatile apca c;
    public apbo b = apbo.a;

    static {
        apwq apwqVar = new apwq();
        a = apwqVar;
        apag.registerDefaultInstance(apwq.class, apwqVar);
    }

    private apwq() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", apwp.a});
            case NEW_MUTABLE_INSTANCE:
                return new apwq();
            case NEW_BUILDER:
                return new aozy((int[]) null, (byte[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (apwq.class) {
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
