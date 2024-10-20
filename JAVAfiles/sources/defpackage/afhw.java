package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afhw implements agen {
    public static final arml a = armd.a(aezo.j);
    public final int b;
    public final afip c;
    public final afgo d;
    public final arml e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    private final Integer j;
    private final boolean k;

    public afhw() {
        this(null, null, null, false, false, false, false, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afhw)) {
            return false;
        }
        afhw afhwVar = (afhw) obj;
        Integer num = afhwVar.j;
        if (!d.F(null, null) || this.b != afhwVar.b || !d.F(this.c, afhwVar.c) || !d.F(this.d, afhwVar.d) || !d.F(this.e, afhwVar.e) || this.f != afhwVar.f) {
            return false;
        }
        boolean z = afhwVar.k;
        if (this.g == afhwVar.g && this.h == afhwVar.h && this.i == afhwVar.i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.b * 31) + this.c.hashCode();
        afgo afgoVar = this.d;
        if (afgoVar == null) {
            hashCode = 0;
        } else {
            hashCode = afgoVar.hashCode();
        }
        return (((((((((((((hashCode2 * 31) + hashCode) * 31) + this.e.hashCode()) * 31) + a.v(this.f)) * 31) + a.v(false)) * 31) + a.v(this.g)) * 31) + a.v(this.h)) * 31) + a.v(this.i);
    }

    public final String toString() {
        return "CameraGalleryConfiguration(columnMaxCount=null, columnMinWidth=" + this.b + ", systemContentPicker=" + this.c + ", camera=" + this.d + ", supportedFormats=" + this.e + ", expandToMaxHeightUponHeaderAppearance=" + this.f + ", autoScrollToTopOnRefresh=false, observeDraftAttachmentsController=" + this.g + ", requireFullVisibleRowsInScrollCalculation=" + this.h + ", skipGalleryInvalidationDuringLayout=" + this.i + ")";
    }

    public /* synthetic */ afhw(afip afipVar, afgo afgoVar, arml armlVar, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        boolean z5 = false;
        afipVar = (i & 4) != 0 ? new afip(z5, z5, 15) : afipVar;
        afgoVar = (i & 8) != 0 ? null : afgoVar;
        armlVar = (i & 16) != 0 ? a : armlVar;
        int i2 = (i & 2) != 0 ? R.dimen.gallery_item_min_width : 0;
        boolean z6 = z & ((i & 32) == 0);
        boolean z7 = z2 | (!((i & 128) == 0));
        boolean z8 = z3 | (!((i & 256) == 0));
        boolean z9 = (i & 512) == 0;
        afipVar.getClass();
        armlVar.getClass();
        this.j = null;
        this.b = i2;
        this.c = afipVar;
        this.d = afgoVar;
        this.e = armlVar;
        this.f = z6;
        this.k = false;
        this.g = z7;
        this.h = z8;
        this.i = z4 & z9;
    }
}
