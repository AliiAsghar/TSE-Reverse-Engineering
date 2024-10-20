package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apmd extends apag implements apbu {
    public static final apmd a;
    private static volatile apca i;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public int f;
    public apmc g;
    public boolean h;

    static {
        apmd apmdVar = new apmd();
        a = apmdVar;
        apag.registerDefaultInstance(apmd.class, apmdVar);
    }

    private apmd() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0011\u0001\u0001\u0002\u0015\u0011\u0000\u0000\u0000\u0002\f\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e\f\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013ဉ\u0000\u0015ဇ\u0001", new Object[]{"d", "c", "b", "e", aplz.class, apma.class, apmh.class, apmg.class, apmi.class, aplv.class, aplu.class, apmb.class, apme.class, apmk.class, "f", aplt.class, apmf.class, aplx.class, "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new apmd();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (apmd.class) {
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
