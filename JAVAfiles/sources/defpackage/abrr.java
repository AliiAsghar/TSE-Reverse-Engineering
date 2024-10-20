package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abrr extends abrp {
    public final addy b;

    public abrr(addy addyVar, acit acitVar) {
        super(3, acitVar);
        this.b = addyVar;
    }

    @Override // defpackage.abro
    public final boolean a(absl abslVar) {
        return ((abtd) this.b.b).c;
    }

    @Override // defpackage.abro
    public final Feature[] b(absl abslVar) {
        return ((abtd) this.b.b).b;
    }

    @Override // defpackage.abrp
    public final void c(absl abslVar) {
        ((abtd) this.b.b).b(abslVar.b, this.a);
        absw a = ((abtd) this.b.b).a();
        if (a != null) {
            abslVar.d.put(a, this.b);
        }
    }

    @Override // defpackage.abrp, defpackage.abru
    public final /* bridge */ /* synthetic */ void g(znp znpVar, boolean z) {
    }
}
