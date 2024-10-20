package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anav extends apag implements apbu {
    public static final anav a;
    private static volatile apca k;
    public int b;
    public anau c;
    public int e;
    public int h;
    public anba j;
    private byte l = 2;
    public String d = "";
    public String f = "";
    public String g = "";
    public String i = "";

    static {
        anav anavVar = new anav();
        a = anavVar;
        apag.registerDefaultInstance(anav.class, anavVar);
    }

    private anav() {
        apag.emptyProtobufList();
        apag.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0000\u0004\u0001ᔉ\u0000\u0002ᔈ\u0001\u0003ᔄ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\b\bᐉ\n\rင\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "i", "j", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new anav();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (anav.class) {
                        apcaVar = k;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            k = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
