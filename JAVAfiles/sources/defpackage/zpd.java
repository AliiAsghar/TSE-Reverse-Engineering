package defpackage;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zpd extends zph {
    private final ViewGroup a;
    private final View b;
    private final int c;
    private final alog d;
    private final Uri e;

    public zpd(ViewGroup viewGroup, View view, int i, alog alogVar, Uri uri) {
        this.a = viewGroup;
        if (view != null) {
            this.b = view;
            this.c = i;
            if (alogVar != null) {
                this.d = alogVar;
                this.e = uri;
                return;
            }
            throw new NullPointerException("Null corners");
        }
        throw new NullPointerException("Null descriptionView");
    }

    @Override // defpackage.zph
    public final int a() {
        return this.c;
    }

    @Override // defpackage.zph
    public final Uri b() {
        return this.e;
    }

    @Override // defpackage.zph
    public final View c() {
        return this.b;
    }

    @Override // defpackage.zph
    public final ViewGroup d() {
        return this.a;
    }

    @Override // defpackage.zph
    public final alog e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zph) {
            zph zphVar = (zph) obj;
            if (this.a.equals(zphVar.d()) && this.b.equals(zphVar.c()) && this.c == zphVar.a() && alzz.at(this.d, zphVar.e()) && this.e.equals(zphVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        Uri uri = this.e;
        alog alogVar = this.d;
        View view = this.b;
        return "VideoAttachmentThumbnailClickedEvent{inlineView=" + this.a.toString() + ", descriptionView=" + view.toString() + ", cornerRadius=" + this.c + ", corners=" + alogVar.toString() + ", videoSource=" + uri.toString() + "}";
    }
}
