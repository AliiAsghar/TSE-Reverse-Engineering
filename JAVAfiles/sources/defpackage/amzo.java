package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amzo extends apag implements apbu {
    public static final amzo a;
    private static volatile apca m;
    public int b;
    public Object d;
    public aozb f;
    public aozb g;
    public amzi h;
    public amzm i;
    public amzs j;
    public amzj k;
    public amzk l;
    public int c = 0;
    public aozb e = aozb.b;

    static {
        amzo amzoVar = new amzo();
        a = amzoVar;
        apag.registerDefaultInstance(amzo.class, amzoVar);
    }

    private amzo() {
        aozb aozbVar = aozb.b;
        this.f = aozbVar;
        this.g = aozbVar;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\n\u0001\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004<\u0000\u0006<\u0000\u0007ဉ\u0003\bဉ\u0004\tဉ\u0005\nဉ\u0007\u000bဉ\u0006", new Object[]{"d", "c", "b", "e", "f", "g", amze.class, amzv.class, "h", "i", "j", "l", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new amzo();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = m;
                if (apcaVar == null) {
                    synchronized (amzo.class) {
                        apcaVar = m;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            m = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
