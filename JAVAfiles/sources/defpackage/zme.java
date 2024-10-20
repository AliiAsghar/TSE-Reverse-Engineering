package defpackage;

import com.google.android.apps.messaging.ui.appsettings.SmartsSettingsActivity;
import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CustomizationModel;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zme {
    public final Object a;
    public final Object b;
    public final Object c;

    public zme(SmartsSettingsActivity smartsSettingsActivity, lzv lzvVar, armf armfVar, armf armfVar2, armf armfVar3) {
        this.a = smartsSettingsActivity;
        this.b = lzvVar;
        this.c = armfVar3;
        if (kpt.a() && yig.b()) {
            ajxd ajxdVar = (ajxd) armfVar.b();
            ajyt b = ajyu.b(smartsSettingsActivity);
            b.b(akag.class);
            ajxdVar.c(new akaf((akag) armfVar2.b(), 0));
            b.b(akaa.class);
            ajxdVar.d(b.a());
            ((ajxd) armfVar.b()).c(new zlb(this, armfVar3, 4));
        }
    }

    private final void a() {
        ((ykw) this.c).n("c2o_category_order");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List, java.lang.Object] */
    private final void b() {
        int size = this.b.size();
        apen[] apenVarArr = new apen[size];
        Arrays.fill(apenVarArr, apen.VISIBLE);
        ?? r2 = this.b;
        int size2 = r2.size();
        boolean[] zArr = new boolean[size2];
        for (int i = 0; i < r2.size(); i++) {
            zArr[i] = CustomizationModel.e((ykw) this.c, (apel) r2.get(i), null, false);
        }
        Object obj = this.a;
        ?? r6 = this.b;
        CustomizationModel customizationModel = (CustomizationModel) obj;
        customizationModel.a.clear();
        xyl.a(r6.size(), size);
        xyl.a(r6.size(), size2);
        aozy createBuilder = apem.a.createBuilder();
        for (int i2 = 0; i2 < r6.size(); i2++) {
            apel apelVar = (apel) r6.get(i2);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((apem) createBuilder.b).b = apelVar.a();
            apen apenVar = apenVarArr[i2];
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((apem) createBuilder.b).c = apenVar.a();
            boolean z = zArr[i2];
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((apem) createBuilder.b).d = z;
            customizationModel.a.add((apem) createBuilder.s());
        }
        customizationModel.c();
    }

    private final boolean c() {
        return ((ykw) this.c).p("c2o_category_order");
    }

    public zme(anen anenVar, uac uacVar, ndi ndiVar) {
        anenVar.getClass();
        uacVar.getClass();
        ndiVar.getClass();
        this.c = anenVar;
        this.a = uacVar;
        this.b = ndiVar;
    }

    /* JADX WARN: Type inference failed for: r7v19, types: [java.util.List, java.lang.Object] */
    public zme(ykw ykwVar, alor alorVar) {
        this.c = ykwVar;
        CustomizationModel customizationModel = new CustomizationModel();
        this.a = customizationModel;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.addAll(alorVar.keySet());
        arrayList.remove(apel.CAMERA_GALLERY);
        boolean z = ((Boolean) utw.c.e()).booleanValue() && !ipe.b();
        boolean z2 = ((Boolean) utw.f.e()).booleanValue() && !ipe.c();
        boolean booleanValue = ((Boolean) utw.M.e()).booleanValue();
        boolean booleanValue2 = ((Boolean) utw.g.e()).booleanValue();
        if (!z) {
            arrayList.remove(apel.GIF);
        }
        if (!z2) {
            arrayList.remove(apel.EXPRESSIVE_STICKER);
        }
        if (booleanValue) {
            arrayList.remove(apel.GALLERY);
        }
        if (booleanValue2) {
            arrayList.remove(apel.EMOJI);
        }
        if (arrayList.contains(apel.CUSTOMIZATION)) {
            if (((Boolean) utw.b.e()).booleanValue()) {
                byte[] r = ykwVar.r("c2o_category_order");
                if (r == null) {
                    b();
                    return;
                }
                try {
                    CustomizationModel customizationModel2 = customizationModel;
                    customizationModel.a.clear();
                    CustomizationModel customizationModel3 = customizationModel;
                    customizationModel.a.addAll(((apeo) ((aozy) apeo.a.createBuilder().g(r)).s()).b);
                } catch (apba unused) {
                    xzb.g("Bugle", "CategoryOrderUtil: Cannot re-create category order from preferences. Reloading default order");
                    a();
                    b();
                }
                if (((CustomizationModel) this.a).a() == this.b.size()) {
                    return;
                }
                a();
                b();
                return;
            }
            if (c()) {
                a();
            }
            b();
            return;
        }
        if (c()) {
            a();
        }
        b();
    }

    public zme(armf armfVar, armf armfVar2, armf armfVar3) {
        armfVar.getClass();
        this.c = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
    }
}
