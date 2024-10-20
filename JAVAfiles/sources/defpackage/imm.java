package defpackage;

import android.net.Uri;
import android.util.Size;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class imm extends GalleryContent {
    public final String a;
    public final Uri b;
    public final ameb c;
    public final Size d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final Uri h;
    public final Optional i;
    public final tqj j;
    public final Uri k;
    public final String l;
    public final int m;

    public imm(String str, Uri uri, ameb amebVar, Size size, long j, boolean z, boolean z2, Uri uri2, Optional optional, tqj tqjVar, Uri uri3, String str2, int i) {
        if (str != null) {
            this.a = str;
            if (uri != null) {
                this.b = uri;
                if (amebVar != null) {
                    this.c = amebVar;
                    if (size != null) {
                        this.d = size;
                        this.e = j;
                        this.f = z;
                        this.g = z2;
                        this.h = uri2;
                        if (optional != null) {
                            this.i = optional;
                            if (tqjVar != null) {
                                this.j = tqjVar;
                                this.k = uri3;
                                this.l = str2;
                                if (i != 0) {
                                    this.m = i;
                                    return;
                                }
                                throw new NullPointerException("Null displayState");
                            }
                            throw new NullPointerException("Null mediaSendType");
                        }
                        throw new NullPointerException("Null duration");
                    }
                    throw new NullPointerException("Null size");
                }
                throw new NullPointerException("Null contentSource");
            }
            throw new NullPointerException("Null uri");
        }
        throw new NullPointerException("Null contentType");
    }

    @Override // defpackage.myn
    public final long a() {
        return this.e;
    }

    @Override // com.google.android.apps.messaging.conversation.draft.model.GalleryContent, defpackage.mxf
    public final Uri b() {
        return this.k;
    }

    @Override // com.google.android.apps.messaging.conversation.draft.model.GalleryContent, defpackage.myn
    public final Uri c() {
        return this.h;
    }

    @Override // defpackage.mxf
    public final Uri d() {
        return this.b;
    }

    @Override // defpackage.myt
    public final Size e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        Uri uri2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof GalleryContent) {
            GalleryContent galleryContent = (GalleryContent) obj;
            if (this.a.equals(galleryContent.j()) && this.b.equals(galleryContent.d()) && this.c.equals(galleryContent.g()) && this.d.equals(galleryContent.e()) && this.e == galleryContent.a() && this.f == galleryContent.k() && this.g == galleryContent.l() && ((uri = this.h) != null ? uri.equals(galleryContent.c()) : galleryContent.c() == null) && this.i.equals(galleryContent.h()) && this.j.equals(galleryContent.f()) && ((uri2 = this.k) != null ? uri2.equals(galleryContent.b()) : galleryContent.b() == null) && ((str = this.l) != null ? str.equals(galleryContent.i()) : galleryContent.i() == null) && this.m == galleryContent.m()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.conversation.draft.model.GalleryContent
    public final tqj f() {
        return this.j;
    }

    @Override // defpackage.imv
    public final ameb g() {
        return this.c;
    }

    @Override // com.google.android.apps.messaging.conversation.draft.model.GalleryContent, defpackage.myn
    public final Optional h() {
        return this.i;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        int hashCode3 = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        Uri uri = this.h;
        int i2 = 0;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        long j = this.e;
        boolean z = this.g;
        boolean z2 = this.f;
        int i3 = 1237;
        if (true != z) {
            i = 1237;
        } else {
            i = 1231;
        }
        if (true == z2) {
            i3 = 1231;
        }
        int hashCode4 = ((((((((((((hashCode3 * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i3) * 1000003) ^ i) * 1000003) ^ hashCode) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        Uri uri2 = this.k;
        if (uri2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = uri2.hashCode();
        }
        int i4 = (hashCode4 ^ hashCode2) * 1000003;
        String str = this.l;
        if (str != null) {
            i2 = str.hashCode();
        }
        int i5 = this.m;
        a.aS(i5);
        return ((i4 ^ i2) * 1000003) ^ i5;
    }

    @Override // com.google.android.apps.messaging.conversation.draft.model.GalleryContent, defpackage.myt
    public final String i() {
        return this.l;
    }

    @Override // defpackage.mym
    public final String j() {
        return this.a;
    }

    @Override // defpackage.myn
    public final boolean k() {
        return this.f;
    }

    @Override // defpackage.myn
    public final boolean l() {
        return this.g;
    }

    @Override // com.google.android.apps.messaging.conversation.draft.model.GalleryContent, defpackage.myn
    public final int m() {
        return this.m;
    }

    public final String toString() {
        Uri uri = this.k;
        tqj tqjVar = this.j;
        Optional optional = this.i;
        Uri uri2 = this.h;
        Size size = this.d;
        ameb amebVar = this.c;
        return "GalleryContent{contentType=" + this.a + ", uri=" + this.b.toString() + ", contentSource=" + amebVar.toString() + ", size=" + size.toString() + ", mediaModifiedTimestamp=" + this.e + ", isResizable=" + this.f + ", saveToExternalStorage=" + this.g + ", previewUri=" + String.valueOf(uri2) + ", duration=" + optional.toString() + ", mediaSendType=" + tqjVar.toString() + ", originalUri=" + String.valueOf(uri) + ", caption=" + this.l + ", displayState=" + lga.aC(this.m) + "}";
    }
}
