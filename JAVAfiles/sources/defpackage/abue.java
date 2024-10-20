package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abue extends abuf {
    final /* synthetic */ Intent a;
    final /* synthetic */ abst b;

    public abue(Intent intent, abst abstVar) {
        this.a = intent;
        this.b = abstVar;
    }

    @Override // defpackage.abuf
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
