package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kcl implements kaa {
    public final miz a;
    public final boolean b;
    public final Uri c;
    public final boolean d;
    public final boolean e;
    public final myt f;
    public final boolean g;
    public final String h;

    public kcl(miz mizVar, boolean z, Uri uri, boolean z2, boolean z3, myt mytVar, boolean z4, String str) {
        this.a = mizVar;
        this.b = z;
        this.c = uri;
        this.d = z2;
        this.e = z3;
        this.f = mytVar;
        this.g = z4;
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcl)) {
            return false;
        }
        kcl kclVar = (kcl) obj;
        if (d.F(this.a, kclVar.a) && this.b == kclVar.b && d.F(this.c, kclVar.c) && this.d == kclVar.d && this.e == kclVar.e && d.F(this.f, kclVar.f) && this.g == kclVar.g && d.F(this.h, kclVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Uri uri = this.c;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        return ((((((((((((hashCode2 + a.v(this.b)) * 31) + hashCode) * 31) + a.v(this.d)) * 31) + a.v(this.e)) * 31) + this.f.hashCode()) * 31) + a.v(this.g)) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "ImageBubbleArgs(message=" + this.a + ", isOutgoing=" + this.b + ", previewUri=" + this.c + ", isGroupConversation=" + this.d + ", isSpatulaSettingsEnabled=" + this.e + ", content=" + this.f + ", isHighlighted=" + this.g + ", contentDescription=" + this.h + ")";
    }
}
