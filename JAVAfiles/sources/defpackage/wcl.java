package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wcl implements arln {
    private final int a;
    private final /* synthetic */ int b;
    private final Object c;

    public wcl(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.a = i;
    }

    @Override // defpackage.arln
    public final void a(Object obj, arlq arlqVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (this.a != 0) {
                        ((abms) this.c).g((abni) obj, arlqVar);
                        return;
                    } else {
                        ((abms) this.c).f((abna) obj, arlqVar);
                        return;
                    }
                }
                int i2 = this.a;
                if (i2 != 0) {
                    if (i2 != 1) {
                        ((abmq) this.c).d((abmu) obj, arlqVar);
                        return;
                    } else {
                        ((abmq) this.c).e((abmw) obj, arlqVar);
                        return;
                    }
                }
                ((abmq) this.c).f((abmy) obj, arlqVar);
                return;
            }
            switch (this.a) {
                case 0:
                    ((wcg) this.c).f((wcv) obj, arlqVar);
                    return;
                case 1:
                    ((wcg) this.c).e((wct) obj, arlqVar);
                    return;
                case 2:
                    ((wcg) this.c).j((wdp) obj, arlqVar);
                    return;
                case 3:
                    ((wcg) this.c).i((wdl) obj, arlqVar);
                    return;
                case 4:
                    ((wcg) this.c).h((wdh) obj, arlqVar);
                    return;
                case 5:
                    ((wcg) this.c).d((wbl) obj, arlqVar);
                    return;
                case 6:
                    ((wcg) this.c).c((wbe) obj, arlqVar);
                    return;
                case 7:
                    ((wcg) this.c).g((wdb) obj, arlqVar);
                    return;
                case 8:
                    ((wcg) this.c).l((wdz) obj, arlqVar);
                    return;
                default:
                    ((wcg) this.c).k((wdv) obj, arlqVar);
                    return;
            }
        }
        switch (this.a) {
            case 0:
                ((wck) this.c).f((wdr) obj, arlqVar);
                return;
            case 1:
                ((wck) this.c).e((wdn) obj, arlqVar);
                return;
            case 2:
                ((wck) this.c).i();
                return;
            case 3:
                ((wck) this.c).c((wbn) obj, arlqVar);
                return;
            case 4:
                ((wck) this.c).b((wbg) obj, arlqVar);
                return;
            case 5:
                ((wck) this.c).d((wdd) obj, arlqVar);
                return;
            case 6:
                ((wck) this.c).h((web) obj, arlqVar);
                return;
            default:
                ((wck) this.c).g((wdx) obj, arlqVar);
                return;
        }
    }
}
