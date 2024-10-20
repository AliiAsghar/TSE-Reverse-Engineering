package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecp implements ecq {
    private final ContentInfo.Builder a;

    public ecp(ClipData clipData, int i) {
        this.a = new ContentInfo.Builder(clipData, i);
    }

    @Override // defpackage.ecq
    public final ecv a() {
        ContentInfo build;
        build = this.a.build();
        return new ecv(new ecs(build));
    }

    @Override // defpackage.ecq
    public final void b(ClipData clipData) {
        this.a.setClip(clipData);
    }

    @Override // defpackage.ecq
    public final void c(Bundle bundle) {
        this.a.setExtras(bundle);
    }

    @Override // defpackage.ecq
    public final void d(int i) {
        this.a.setFlags(i);
    }

    @Override // defpackage.ecq
    public final void e(Uri uri) {
        this.a.setLinkUri(uri);
    }

    public ecp(ecv ecvVar) {
        this.a = new ContentInfo.Builder(ecvVar.f());
    }
}
