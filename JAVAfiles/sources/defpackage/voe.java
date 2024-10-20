package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class voe extends apag implements apbu {
    public static final voe a;
    private static volatile apca d;
    public int b = 0;
    public Object c;

    static {
        voe voeVar = new voe();
        a = voeVar;
        apag.registerDefaultInstance(voe.class, voeVar);
    }

    private voe() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0004\u0001\u0000eh\u0004\u0000\u0000\u0000e<\u0000f<\u0000g<\u0000h<\u0000", new Object[]{"c", "b", vod.class, voc.class, voa.class, vob.class});
            case NEW_MUTABLE_INSTANCE:
                return new voe();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (voe.class) {
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
