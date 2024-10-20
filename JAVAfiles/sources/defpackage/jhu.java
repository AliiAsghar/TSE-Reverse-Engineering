package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhu implements jhy {
    private final boolean a;
    private final boolean b;
    private final int c;
    private final mjq d;
    private final boolean e;
    private final String f;
    private final jjh g;

    public jhu(boolean z, boolean z2, int i, mjq mjqVar, boolean z3, String str) {
        str.getClass();
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = mjqVar;
        this.e = z3;
        this.f = str;
        this.g = new jjh(aerb.cJ, R.string.send_button_content_description_mms, Integer.valueOf(R.string.send_button_label_mms), (Integer) null, 24);
    }

    @Override // defpackage.jhz
    public final int a() {
        return this.c;
    }

    @Override // defpackage.jhz
    public final jjh b() {
        return this.g;
    }

    @Override // defpackage.jhz
    public final /* bridge */ /* synthetic */ jji c() {
        return null;
    }

    @Override // defpackage.jhz
    public final mjq d() {
        return this.d;
    }

    @Override // defpackage.jhz
    public final /* synthetic */ mjq e() {
        return mjq.SIMPLE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhu)) {
            return false;
        }
        jhu jhuVar = (jhu) obj;
        if (this.a == jhuVar.a && this.b == jhuVar.b && this.c == jhuVar.c && this.d == jhuVar.d && this.e == jhuVar.e && d.F(this.f, jhuVar.f)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.jhz
    public final String f() {
        return this.f;
    }

    @Override // defpackage.jhz
    public final boolean g() {
        return this.b;
    }

    @Override // defpackage.jhz
    public final boolean h() {
        return this.a;
    }

    public final int hashCode() {
        return (((((((((a.v(this.a) * 31) + a.v(this.b)) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + a.v(this.e)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "Mms(mediaAttachmentsSupported=" + this.a + ", locationSharingSupported=" + this.b + ", attachmentCountLimit=" + this.c + ", bestAvailableTransportFeatureSet=" + this.d + ", hasAttachments=" + this.e + ", draftHint=" + this.f + ")";
    }
}
