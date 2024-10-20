package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xph implements akgr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public xph(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.akgr
    public final /* synthetic */ akfd a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return zmt.a;
                        }
                        return zmt.a;
                    }
                    akfc akfcVar = zib.a;
                    akfcVar.getClass();
                    return akfcVar;
                }
                return yfr.a;
            }
            return new akgc("typing_status_all_conversations");
        }
        return xpi.a;
    }

    @Override // defpackage.akgr
    public final ListenableFuture b() {
        akul c;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (!((zmt) this.a).d.get()) {
                                return aktp.ag(Optional.empty());
                            }
                            return akul.g(((aiwu) ((zmt) this.a).e.b()).a()).h(new zms(0), andi.a);
                        }
                        return akul.g(((aiwu) ((zmt) this.a).e.b()).a());
                    }
                    zib zibVar = (zib) this.a;
                    c = qjh.c(zibVar.b, arpj.a, arwf.a, new zcb(zibVar, (arpe) null, 3));
                    akul g = akul.g(c);
                    g.getClass();
                    return g;
                }
                return ((yfr) this.a).b().h();
            }
            return ((usk) this.a).k();
        }
        return aktp.ai(new wkf(this, 11), ((xpi) this.a).c);
    }
}
