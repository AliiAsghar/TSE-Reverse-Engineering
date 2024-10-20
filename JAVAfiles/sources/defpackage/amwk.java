package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amwk extends apag implements apbu {
    public static final amwk a;
    private static volatile apca d;
    public int b;
    public int c;
    private int e;
    private int f;
    private int g;
    private int h;

    static {
        amwk amwkVar = new amwk();
        a = amwkVar;
        apag.registerDefaultInstance(amwk.class, amwkVar);
    }

    private amwk() {
    }

    public static /* synthetic */ void a(amwk amwkVar) {
        amwkVar.b |= 16;
        amwkVar.h = 0;
    }

    public static /* synthetic */ void b(amwk amwkVar) {
        amwkVar.b |= 1;
        amwkVar.e = 0;
    }

    public static /* synthetic */ void c(amwk amwkVar) {
        amwkVar.b |= 2;
        amwkVar.f = 0;
    }

    public static /* synthetic */ void d(amwk amwkVar) {
        amwkVar.b |= 8;
        amwkVar.g = 0;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"b", "e", "f", "c", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new amwk();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (amwk.class) {
                        apcaVar = d;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            d = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
