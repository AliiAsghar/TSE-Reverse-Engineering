package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvi implements ny {
    final /* synthetic */ kvw a;

    public kvi(kvw kvwVar) {
        this.a = kvwVar;
    }

    @Override // defpackage.ny
    public final void c(View view) {
        kvw kvwVar = this.a;
        kvwVar.b(kvwVar.b).setImportantForAccessibility(1);
    }

    @Override // defpackage.ny
    public final void d(View view) {
        kvw kvwVar = this.a;
        if (kvwVar.b(kvwVar.b).getChildCount() == 0) {
            kvw kvwVar2 = this.a;
            kvwVar2.b(kvwVar2.b).setImportantForAccessibility(2);
        }
    }
}
