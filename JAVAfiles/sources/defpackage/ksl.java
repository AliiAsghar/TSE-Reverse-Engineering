package defpackage;

import android.graphics.Bitmap;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksl {
    public final alog a;
    public final ksu b;
    public final Bitmap c;
    public final alor d;
    public final Optional e;
    private final alog f;

    public ksl() {
        throw null;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ksl) {
            ksl kslVar = (ksl) obj;
            if (alzz.at(this.a, kslVar.a) && alzz.at(this.f, kslVar.f) && this.b.equals(kslVar.b) && ((bitmap = this.c) != null ? bitmap.equals(kslVar.c) : kslVar.c == null) && alzz.am(this.d, kslVar.d) && this.e.equals(kslVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.b.hashCode();
        Bitmap bitmap = this.c;
        if (bitmap == null) {
            hashCode = 0;
        } else {
            hashCode = bitmap.hashCode();
        }
        return (((((hashCode2 * 1000003) ^ hashCode) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        Optional optional = this.e;
        alor alorVar = this.d;
        Bitmap bitmap = this.c;
        ksu ksuVar = this.b;
        alog alogVar = this.f;
        return "FeedbackActivityLaunchData{feedbackDataList=" + String.valueOf(this.a) + ", unselectedFeedbackDataList=" + String.valueOf(alogVar) + ", consentData=" + String.valueOf(ksuVar) + ", screenshot=" + String.valueOf(bitmap) + ", extraPsd=" + String.valueOf(alorVar) + ", throwable=" + String.valueOf(optional) + "}";
    }

    public ksl(alog alogVar, alog alogVar2, ksu ksuVar, Bitmap bitmap, alor alorVar, Optional optional) {
        this.a = alogVar;
        this.f = alogVar2;
        this.b = ksuVar;
        this.c = bitmap;
        this.d = alorVar;
        this.e = optional;
    }
}
