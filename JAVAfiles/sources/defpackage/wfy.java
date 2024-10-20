package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wfy extends apag<wfy, aozy> implements apbu {
    public static final wfy a;
    private static volatile apca i;
    public int b;
    public int c;
    public int d;
    public apct e;
    public boolean f;
    public boolean g;
    public int h;

    static {
        wfy wfyVar = new wfy();
        a = wfyVar;
        apag.registerDefaultInstance(wfy.class, wfyVar);
    }

    private wfy() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0006ဇ\u0005\u0007ဌ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new wfy();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (wfy.class) {
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
