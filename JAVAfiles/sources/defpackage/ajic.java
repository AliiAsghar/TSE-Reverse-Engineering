package defpackage;

import android.graphics.Typeface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajic extends ajka {
    final /* synthetic */ ajie a;

    public ajic(ajie ajieVar) {
        this.a = ajieVar;
    }

    @Override // defpackage.ajka
    public final void a(int i) {
        this.a.c = true;
        ajid ajidVar = (ajid) this.a.d.get();
        if (ajidVar != null) {
            ajidVar.i();
        }
    }

    @Override // defpackage.ajka
    public final void b(Typeface typeface, boolean z) {
        if (!z) {
            this.a.c = true;
            ajid ajidVar = (ajid) this.a.d.get();
            if (ajidVar != null) {
                ajidVar.i();
            }
        }
    }
}
