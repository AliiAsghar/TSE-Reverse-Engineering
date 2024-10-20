package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhw implements jhz {
    private final jji a;
    private final boolean b;
    private final boolean c;
    private final int d;
    private final mjq e;
    private final String f;
    private final mjq g;
    private final jjh h = new jjh(aerb.cJ, R.string.send_button_content_description_satellite, (Integer) null, (Integer) null, 28);

    public jhw(jji jjiVar, boolean z, boolean z2, int i, mjq mjqVar, String str) {
        this.a = jjiVar;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = mjqVar;
        this.f = str;
        this.g = mjqVar;
    }

    @Override // defpackage.jhz
    public final int a() {
        return this.d;
    }

    @Override // defpackage.jhz
    public final jjh b() {
        return this.h;
    }

    @Override // defpackage.jhz
    public final jji c() {
        return this.a;
    }

    @Override // defpackage.jhz
    public final mjq d() {
        return this.e;
    }

    @Override // defpackage.jhz
    public final mjq e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhw)) {
            return false;
        }
        jhw jhwVar = (jhw) obj;
        if (d.F(this.a, jhwVar.a) && this.b == jhwVar.b && this.c == jhwVar.c && this.d == jhwVar.d && this.e == jhwVar.e && d.F(this.f, jhwVar.f)) {
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
        return this.c;
    }

    @Override // defpackage.jhz
    public final boolean h() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode;
        jji jjiVar = this.a;
        if (jjiVar == null) {
            hashCode = 0;
        } else {
            hashCode = jjiVar.hashCode();
        }
        return (((((((((hashCode * 31) + a.v(this.b)) * 31) + a.v(this.c)) * 31) + this.d) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "Satellite(textCounter=" + this.a + ", mediaAttachmentsSupported=" + this.b + ", locationSharingSupported=" + this.c + ", attachmentCountLimit=" + this.d + ", bestAvailableTransportFeatureSet=" + this.e + ", draftHint=" + this.f + ")";
    }
}
