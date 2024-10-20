package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apji extends apag implements apbu {
    public static final apji a;
    private static volatile apca i;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public apko h;

    static {
        apji apjiVar = new apji();
        a = apjiVar;
        apag.registerDefaultInstance(apji.class, apjiVar);
    }

    private apji() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003᠌\u0002\u0005ဇ\u0004\u0006᠌\u0005\u0007ဉ\u0006", new Object[]{"b", "c", apjb.k, "d", "e", apjb.l, "f", "g", apkm.g, "h"});
            case NEW_MUTABLE_INSTANCE:
                return new apji();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (apji.class) {
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
