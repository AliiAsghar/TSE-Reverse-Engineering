package defpackage;

import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kms implements aknb {
    final /* synthetic */ kmt a;

    public kms(kmt kmtVar) {
        this.a = kmtVar;
    }

    @Override // defpackage.aknb
    public final algw a() {
        return alfd.a;
    }

    @Override // defpackage.aknb
    public final ListenableFuture c() {
        return aktp.ag(akna.a(new Intent().setClassName(this.a.a, "com.google.android.apps.messaging.main.MainActivity")));
    }

    @Override // defpackage.aknb
    public final /* synthetic */ akna e() {
        return akna.b();
    }

    @Override // defpackage.aknb
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.aknb
    public final /* synthetic */ void d() {
    }
}
