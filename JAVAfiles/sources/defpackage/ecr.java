package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecr implements ecq {
    ClipData a;
    final int b;
    int c;
    Uri d;
    Bundle e;

    public ecr(ClipData clipData, int i) {
        this.a = clipData;
        this.b = i;
    }

    @Override // defpackage.ecq
    public final ecv a() {
        return new ecv(new ecu(this));
    }

    @Override // defpackage.ecq
    public final void b(ClipData clipData) {
        this.a = clipData;
    }

    @Override // defpackage.ecq
    public final void c(Bundle bundle) {
        this.e = bundle;
    }

    @Override // defpackage.ecq
    public final void d(int i) {
        this.c = i;
    }

    @Override // defpackage.ecq
    public final void e(Uri uri) {
        this.d = uri;
    }

    public ecr(ecv ecvVar) {
        this.a = ecvVar.d();
        this.b = ecvVar.b();
        this.c = ecvVar.a();
        this.d = ecvVar.a.d();
        this.e = ecvVar.a.e();
    }
}
