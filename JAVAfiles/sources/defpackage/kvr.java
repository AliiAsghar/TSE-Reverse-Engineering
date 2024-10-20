package defpackage;

import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class kvr implements akbp<Void, Intent> {
    final /* synthetic */ kvw a;

    public kvr(kvw kvwVar) {
        this.a = kvwVar;
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
    }

    @Override // defpackage.akbp
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        this.a.b.startActivityForResult((Intent) obj2, 2);
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void b(Object obj) {
    }
}
