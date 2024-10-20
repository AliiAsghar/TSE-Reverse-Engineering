package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajzb extends apab<ajzb, apaa> implements apac {
    public static final ajzb a;
    private static volatile apca j;
    public int b;
    public boolean g;
    private byte k = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String h = "";
    public String i = "";

    static {
        ajzb ajzbVar = new ajzb();
        a = ajzbVar;
        apag.registerDefaultInstance(ajzb.class, ajzbVar);
    }

    private ajzb() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0004\u0004ဈ\u0005\u0005ဇ\u0006\u0006ဈ\u0007\u0007ဈ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new ajzb();
            case 4:
                return new apaa(a);
            case 5:
                return a;
            case 6:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (ajzb.class) {
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
