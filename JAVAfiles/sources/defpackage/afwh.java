package defpackage;

import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afwh extends arsm {
    final /* synthetic */ afwi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afwh(afwi afwiVar) {
        super(null);
        this.a = afwiVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        ajmg ajmgVar = (ajmg) obj2;
        ajmg ajmgVar2 = (ajmg) obj;
        if (ajmgVar2 != null) {
            ((TabLayout) this.a.c.i).k(ajmgVar2);
        }
        if (ajmgVar != null) {
            ((TabLayout) this.a.c.i).f(ajmgVar);
        }
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
