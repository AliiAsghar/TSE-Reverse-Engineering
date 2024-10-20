package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wie extends apag implements apbu {
    public static final wie a;
    private static volatile apca e;
    public apbo b = apbo.a;
    public apbo c;
    public apbo d;

    static {
        wie wieVar = new wie();
        a = wieVar;
        apag.registerDefaultInstance(wie.class, wieVar);
    }

    private wie() {
        apbo apboVar = apbo.a;
        this.c = apboVar;
        this.d = apboVar;
    }

    public final apbo a() {
        apbo apboVar = this.d;
        if (!apboVar.b) {
            this.d = apboVar.a();
        }
        return this.d;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0003\u0000\u0000\u00012\u00022\u00032", new Object[]{"b", wic.a, "c", wid.a, "d", wib.a});
            case NEW_MUTABLE_INSTANCE:
                return new wie();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (wie.class) {
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
