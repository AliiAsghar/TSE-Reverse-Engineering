package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ecs implements ect {
    private final ContentInfo a;

    public ecs(ContentInfo contentInfo) {
        dye.i(contentInfo);
        this.a = contentInfo;
    }

    @Override // defpackage.ect
    public final int a() {
        int flags;
        flags = this.a.getFlags();
        return flags;
    }

    @Override // defpackage.ect
    public final int b() {
        int source;
        source = this.a.getSource();
        return source;
    }

    @Override // defpackage.ect
    public final ClipData c() {
        ClipData clip;
        clip = this.a.getClip();
        return clip;
    }

    @Override // defpackage.ect
    public final Uri d() {
        Uri linkUri;
        linkUri = this.a.getLinkUri();
        return linkUri;
    }

    @Override // defpackage.ect
    public final Bundle e() {
        Bundle extras;
        extras = this.a.getExtras();
        return extras;
    }

    @Override // defpackage.ect
    public final ContentInfo f() {
        return this.a;
    }

    public final String toString() {
        return "ContentInfoCompat{" + this.a + "}";
    }
}
