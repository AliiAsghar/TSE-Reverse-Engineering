package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class angz extends apag implements apbu {
    public static final angz a;
    private static volatile apca i;
    public int b;
    public anha c;
    public boolean d;
    public int g;
    public String e = "";
    public String f = "";
    public String h = "";

    static {
        angz angzVar = new angz();
        a = angzVar;
        apag.registerDefaultInstance(angz.class, angzVar);
    }

    private angz() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0003Ȉ\u0004Ȉ\u0005\u0004\u0006ለ\u0001", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new angz();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (angz.class) {
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
