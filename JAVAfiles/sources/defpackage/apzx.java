package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class apzx extends apag implements apbu {
    public static final apzx a;
    private static volatile apca j;
    public int b;
    public String c = "";
    public int d;
    public aqaa e;
    public aqaa f;
    public aqab g;
    public aqab h;
    public aqac i;

    static {
        apzx apzxVar = new apzx();
        a = apzxVar;
        apag.registerDefaultInstance(apzx.class, apzxVar);
    }

    private apzx() {
        emptyProtobufList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0000\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0006ဉ\u0001\u0007ဉ\u0002\tဉ\u0003\nဉ\u0004\u000bဉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new apzx();
            case 4:
                return new aozy(a);
            case 5:
                return a;
            case 6:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (apzx.class) {
                        apcaVar = j;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            j = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
