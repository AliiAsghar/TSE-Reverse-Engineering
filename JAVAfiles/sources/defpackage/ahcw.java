package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahcw extends apab<ahcw, apaa> implements ahcx {
    public static final ahcw a;
    private static volatile apca i;
    public int b;
    public anas d;
    public int e;
    public long f;
    public long g;
    public long h;
    private byte j = 2;
    public apao c = emptyIntList();

    static {
        ahcw ahcwVar = new ahcw();
        a = ahcwVar;
        apag.registerDefaultInstance(ahcw.class, ahcwVar);
    }

    private ahcw() {
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0002\b\u0006\u0000\u0001\u0001\u0002\u0016\u0004ᐉ\u0000\u0005᠌\u0001\u0006ဂ\u0002\u0007ဂ\u0003\bဂ\u0004", new Object[]{"b", "c", "d", "e", amna.p, "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new ahcw();
            case NEW_BUILDER:
                return new apaa(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (ahcw.class) {
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
