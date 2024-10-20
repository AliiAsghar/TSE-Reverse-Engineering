package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qgg extends apag implements apbu {
    public static final qgg a;
    private static volatile apca i;
    public int b;
    public qeg c;
    public apct e;
    public boolean f;
    public qga g;
    public amgu h;
    private byte j = 2;
    public aozb d = aozb.b;

    static {
        qgg qggVar = new qgg();
        a = qggVar;
        apag.registerDefaultInstance(qgg.class, qggVar);
    }

    private qgg() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0001\u0001ဉ\u0000\u0002ည\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\nᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new qgg();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (qgg.class) {
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
