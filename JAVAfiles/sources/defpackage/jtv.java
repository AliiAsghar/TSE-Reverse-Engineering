package defpackage;

import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jtv implements gjy, arrk {
    final /* synthetic */ jub a;

    public jtv(jub jubVar) {
        this.a = jubVar;
    }

    @Override // defpackage.gjy
    public final Bundle a() {
        Bundle bundle = new Bundle();
        alvw g = jub.a.g();
        g.X(alwp.a, "BugleComposeRow2");
        alvg alvgVar = (alvg) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "createInputStateBundle", 306, "InputsUiAdapterImpl.kt");
        jub jubVar = this.a;
        alvgVar.t("Persisting input display %s", jubVar.q.c());
        bundle.putParcelable("input_display_key", (Parcelable) jubVar.q.c());
        return bundle;
    }

    @Override // defpackage.arrk
    public final armh b() {
        return new arrm(0, this.a, jub.class, "createInputStateBundle", "createInputStateBundle()Landroid/os/Bundle;", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof gjy) && (obj instanceof arrk)) {
            return d.F(b(), ((arrk) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
