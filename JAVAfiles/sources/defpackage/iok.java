package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.apps.messaging.ui.mediapicker.c2o.Compose2oFragment;
import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CustomizationModel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iok implements aapb {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public iok(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.aapb
    public final boolean k() {
        if (this.b != 0) {
            aapf aapfVar = ((iog) this.a).h;
            if (aapfVar != null) {
                aapfVar.e();
            }
            if (((iog) this.a).h != null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aapb
    public final void l(ContentGridView contentGridView) {
        if (this.b != 0) {
            iog iogVar = (iog) this.a;
            iogVar.k = contentGridView;
            iogVar.h = aapf.g(iogVar.k);
            Object obj = this.a;
            ((iog) obj).h.f(new ioj(obj, 1));
            iog iogVar2 = (iog) this.a;
            aaqq aaqqVar = iogVar2.g;
            aaqqVar.c = iogVar2.k;
            aapf aapfVar = iogVar2.h;
            aaqqVar.b = aapfVar;
            iogVar2.f.f(aapfVar);
            ((iog) this.a).h().E();
            iog iogVar3 = (iog) this.a;
            ((iog) this.a).h.c(iogVar3.g.b((CustomizationModel) ((iog) this.a).l.a, iogVar3.g().be()));
            return;
        }
        iol iolVar = (iol) this.a;
        Compose2oFragment h = iolVar.h();
        aabz g = iolVar.g();
        ((iol) this.a).e = ((iol) this.a).h.i(h, Boolean.valueOf(g.aW()), g.C(), null, ((iol) this.a).d, contentGridView, g, null, null, h.E()).a(apel.CAMERA_GALLERY, -1);
        h.E().a(((iol) this.a).e);
        Object obj2 = this.a;
        ((iol) obj2).e.q(new ioj(obj2, 0));
    }

    @Override // defpackage.aapb
    public final void m(aaas aaasVar) {
        if (this.b != 0) {
            aapf aapfVar = ((iog) this.a).h;
            if (aapfVar != null) {
                aapfVar.i(aaasVar);
                return;
            }
            return;
        }
        ((iol) this.a).e.l(aaasVar);
    }

    @Override // defpackage.aapb
    public final void a() {
    }

    @Override // defpackage.aapb
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.aapb
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.aapb
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.aapb
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.aapb
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.aapb
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.aapb
    public final /* synthetic */ void b(Configuration configuration) {
    }

    @Override // defpackage.aapb
    public final /* synthetic */ void c(Bundle bundle) {
    }

    @Override // defpackage.aapb
    public final /* synthetic */ void h(Bundle bundle) {
    }
}
