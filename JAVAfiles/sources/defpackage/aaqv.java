package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CustomizationModel;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaqv extends qw {
    final /* synthetic */ aaqy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaqv(aaqy aaqyVar) {
        super(3, 0);
        this.c = aaqyVar;
    }

    @Override // defpackage.qs
    public final boolean n(oo ooVar, oo ooVar2) {
        aaqy aaqyVar = this.c;
        int b = ooVar.b();
        int b2 = ooVar2.b();
        if (b >= 0 && b2 >= 0) {
            CustomizationModel customizationModel = aaqyVar.c;
            if (b < customizationModel.a() && b2 < customizationModel.a() && b != b2) {
                apem b3 = customizationModel.b(b);
                customizationModel.a.remove(b);
                customizationModel.a.add(b2, b3);
                customizationModel.c();
                customizationModel.b = true;
            }
        }
        aaqyVar.q(b);
        aaqyVar.q(b2);
        aaqyVar.t(b, b2);
        return true;
    }

    @Override // defpackage.qs
    public final void h(oo ooVar, int i) {
    }
}
