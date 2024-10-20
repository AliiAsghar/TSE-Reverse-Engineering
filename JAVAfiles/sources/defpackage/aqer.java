package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqer extends apag implements apbu {
    public static final aqer a;
    private static volatile apca i;
    public int b;
    public aqgc c;
    public aqfg d;
    public boolean e;
    public long f;
    public aqfz g;
    public aozb h = aozb.b;

    static {
        aqer aqerVar = new aqer();
        a = aqerVar;
        apag.registerDefaultInstance(aqer.class, aqerVar);
    }

    private aqer() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0007\u0004\u0002\u0006ဉ\u0003\b\n", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aqer();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (aqer.class) {
                        apcaVar = i;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            i = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
