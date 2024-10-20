package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afwi {
    public static final /* synthetic */ artm[] a;
    public final arwe b;
    public final afvz c;
    public List d;
    public final arsn e = new afwh(this);

    static {
        arrr arrrVar = new arrr(afwi.class, "onTabSelectedListener", "getOnTabSelectedListener()Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", 0);
        int i = arsc.a;
        a = new artm[]{arrrVar};
    }

    public afwi(arwe arweVar, afvz afvzVar) {
        this.b = arweVar;
        this.c = afvzVar;
    }

    public final void a(agek agekVar) {
        List list = this.d;
        Integer num = null;
        if (list == null) {
            arro.b("tabs");
            list = null;
        }
        Integer valueOf = Integer.valueOf(list.indexOf(agekVar));
        if (valueOf.intValue() >= 0) {
            num = valueOf;
        }
        if (num != null) {
            afvz afvzVar = this.c;
            int intValue = num.intValue();
            TabLayout tabLayout = (TabLayout) afvzVar.i;
            tabLayout.l(tabLayout.d(intValue));
            return;
        }
        Objects.toString(agekVar);
        throw new IllegalStateException("No tab found for category ".concat(agekVar.toString()));
    }

    public final boolean b() {
        if (((TabLayout) this.c.i).getVisibility() == 0) {
            return true;
        }
        return false;
    }
}
