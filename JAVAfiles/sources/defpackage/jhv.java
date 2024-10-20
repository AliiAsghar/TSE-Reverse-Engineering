package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhv implements jhz {
    public final mjq a;
    public final mit b;
    private final boolean c;
    private final boolean d;
    private final int e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final String i;
    private final mjq j;
    private final jjh k;

    public jhv(boolean z, boolean z2, int i, mjq mjqVar, boolean z3, mit mitVar, boolean z4, boolean z5, String str) {
        jjh jjhVar;
        mitVar.getClass();
        str.getClass();
        this.c = z;
        this.d = z2;
        this.e = i;
        this.a = mjqVar;
        this.f = z3;
        this.b = mitVar;
        this.g = z4;
        this.h = z5;
        this.i = str;
        this.j = mjqVar;
        if (z4) {
            jjhVar = new jjh(aerb.cM, R.string.send_button_content_description_rcs, (Integer) null, (Integer) null, 28);
        } else {
            if (mjqVar.h) {
                jjhVar = new jjh(aerb.cK, R.string.send_button_content_description_rcs_encrypted, (Integer) null, z5 ? Integer.valueOf(R.string.send_button_content_description_rcs_encrypted_with_profile) : null, 12);
            } else {
                jjhVar = new jjh(aerb.cJ, R.string.send_button_content_description_rcs, (Integer) null, z5 ? Integer.valueOf(R.string.send_button_content_description_rcs_with_profile) : null, 12);
            }
        }
        this.k = jjhVar;
    }

    @Override // defpackage.jhz
    public final int a() {
        return this.e;
    }

    @Override // defpackage.jhz
    public final jjh b() {
        return this.k;
    }

    @Override // defpackage.jhz
    public final /* bridge */ /* synthetic */ jji c() {
        return null;
    }

    @Override // defpackage.jhz
    public final mjq d() {
        return this.a;
    }

    @Override // defpackage.jhz
    public final mjq e() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhv)) {
            return false;
        }
        jhv jhvVar = (jhv) obj;
        if (this.c == jhvVar.c && this.d == jhvVar.d && this.e == jhvVar.e && this.a == jhvVar.a && this.f == jhvVar.f && this.b == jhvVar.b && this.g == jhvVar.g && this.h == jhvVar.h && d.F(this.i, jhvVar.i)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.jhz
    public final String f() {
        return this.i;
    }

    @Override // defpackage.jhz
    public final boolean g() {
        return this.d;
    }

    @Override // defpackage.jhz
    public final boolean h() {
        return this.c;
    }

    public final int hashCode() {
        int v = (((((((((a.v(this.c) * 31) + a.v(this.d)) * 31) + this.e) * 31) + this.a.hashCode()) * 31) + a.v(this.f)) * 31) + this.b.hashCode();
        String str = this.i;
        return (((((v * 31) + a.v(this.g)) * 31) + a.v(this.h)) * 31) + str.hashCode();
    }

    public final String toString() {
        return "Rcs(mediaAttachmentsSupported=" + this.c + ", locationSharingSupported=" + this.d + ", attachmentCountLimit=" + this.e + ", bestAvailableTransportFeatureSet=" + this.a + ", hasAttachments=" + this.f + ", kind=" + this.b + ", isGeminiConversation=" + this.g + ", enableProfileInteractionSharing=" + this.h + ", draftHint=" + this.i + ")";
    }
}
