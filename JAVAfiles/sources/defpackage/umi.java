package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class umi extends apag implements apbu {
    public static final umi a;
    private static volatile apca i;
    public int b;
    public int d;
    public long e;
    public amgu f;
    public long g;
    public long h;
    private byte j = 2;
    public String c = "";

    static {
        umi umiVar = new umi();
        a = umiVar;
        apag.registerDefaultInstance(umi.class, umiVar);
    }

    private umi() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\t\u0006\u0000\u0000\u0004\u0002ᔈ\u0000\u0003ᔄ\u0001\u0004ᔂ\u0002\u0007ᐉ\u0003\bဂ\u0004\tဂ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new umi();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (umi.class) {
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
