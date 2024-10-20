package defpackage;

import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afvo {
    public final afri a;
    public final ImageView.ScaleType b;

    public afvo() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afvo)) {
            return false;
        }
        afvo afvoVar = (afvo) obj;
        if (d.F(this.a, afvoVar.a) && this.b == afvoVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        afri afriVar = this.a;
        int i = 0;
        if (afriVar == null) {
            hashCode = 0;
        } else {
            hashCode = afriVar.hashCode();
        }
        ImageView.ScaleType scaleType = this.b;
        if (scaleType != null) {
            i = scaleType.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        return "MediaViewHolderConfiguration(aspectRatio=" + this.a + ", scaleType=" + this.b + ")";
    }

    public /* synthetic */ afvo(afri afriVar, int i) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        this.a = 1 == (i & 1) ? null : afriVar;
        this.b = scaleType;
    }
}
