package defpackage;

import android.widget.CompoundButton;
import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CustomizationModel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaqw implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ int a;
    final /* synthetic */ no b;
    private final /* synthetic */ int c;

    public aaqw(aaqy aaqyVar, int i, int i2) {
        this.c = i2;
        this.a = i;
        this.b = aaqyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        apen apenVar;
        if (this.c != 0) {
            int i = this.a;
            kme kmeVar = (kme) this.b;
            ((kmk) kmeVar.c.get(i)).d(z);
            kmeVar.F(i);
            kmeVar.G();
            return;
        }
        if (z) {
            apenVar = apen.VISIBLE;
        } else {
            apenVar = apen.INVISIBLE;
        }
        no noVar = this.b;
        int i2 = this.a;
        CustomizationModel customizationModel = ((aaqy) noVar).c;
        aozy createBuilder = apem.a.createBuilder((apem) customizationModel.a.get(i2));
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((apem) createBuilder.b).c = apenVar.a();
        customizationModel.a.set(i2, (apem) createBuilder.s());
        customizationModel.c();
        customizationModel.b = true;
    }

    public /* synthetic */ aaqw(kme kmeVar, int i, int i2) {
        this.c = i2;
        this.b = kmeVar;
        this.a = i;
    }
}
