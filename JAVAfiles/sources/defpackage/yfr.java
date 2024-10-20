package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yfr {
    public static final akfc a = new akgc("IMAGE_COMPRESSION_SETTINGS_DATA_SOURCE_CONTENT_KEY");
    public final armf b;
    public final armf c;
    public final ahiy d;
    private final armf e;
    private wul f;

    public yfr(armf armfVar, ahiy ahiyVar, armf armfVar2, armf armfVar3) {
        this.e = armfVar;
        this.d = ahiyVar;
        this.b = armfVar2;
        this.c = armfVar3;
    }

    public static boolean d(long j) {
        if (j > ((Long) uif.n.e()).longValue()) {
            return true;
        }
        return false;
    }

    public final int a(long j) {
        Integer num;
        Integer num2;
        try {
            if (((pjx) this.c.b()).a()) {
                if (c()) {
                    if (d(j)) {
                        num2 = (Integer) yfs.e.e();
                    } else {
                        num2 = (Integer) yfs.a.e();
                    }
                    return num2.intValue();
                }
                if (d(j)) {
                    num = (Integer) yfs.g.e();
                } else {
                    num = (Integer) yfs.c.e();
                }
                return num.intValue();
            }
            return ((yfq) b().l()).c;
        } catch (apba e) {
            ((mbl) this.b.b()).c("Bugle.Media.FastImageSending.FailToGetLongDimension.Count");
            throw e;
        }
    }

    public final wul b() {
        if (this.f == null) {
            znj znjVar = (znj) this.e.b();
            aiwl a2 = wus.a();
            a2.i(wuk.IMAGE_COMPRESSION);
            a2.k(yfq.a);
            this.f = znjVar.ab(a2.f());
        }
        return this.f;
    }

    public final boolean c() {
        return ((yfq) b().l()).e;
    }
}
