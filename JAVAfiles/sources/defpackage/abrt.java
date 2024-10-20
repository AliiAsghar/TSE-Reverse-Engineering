package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abrt extends abrp {
    public final absw b;

    public abrt(absw abswVar, acit acitVar) {
        super(4, acitVar);
        this.b = abswVar;
    }

    @Override // defpackage.abro
    public final boolean a(absl abslVar) {
        addy addyVar = (addy) abslVar.d.get(this.b);
        if (addyVar != null && ((abtd) addyVar.b).c) {
            return true;
        }
        return false;
    }

    @Override // defpackage.abro
    public final Feature[] b(absl abslVar) {
        addy addyVar = (addy) abslVar.d.get(this.b);
        if (addyVar == null) {
            return null;
        }
        return ((abtd) addyVar.b).b;
    }

    @Override // defpackage.abrp
    public final void c(absl abslVar) {
        addy addyVar = (addy) abslVar.d.remove(this.b);
        if (addyVar != null) {
            ((abte) ((ahjj) addyVar.c).a).b.a(abslVar.b, this.a);
            ((abtd) addyVar.b).a.a();
            return;
        }
        this.a.d(false);
    }

    @Override // defpackage.abrp, defpackage.abru
    public final /* bridge */ /* synthetic */ void g(znp znpVar, boolean z) {
    }
}
