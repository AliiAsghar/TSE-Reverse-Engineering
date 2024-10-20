package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhx implements jhy {
    private final jji a;
    private final boolean b;
    private final boolean c;
    private final int d;
    private final mjq e;
    private final boolean f;
    private final jjg g;
    private final String h;
    private final jjh i;

    public jhx(jji jjiVar, boolean z, boolean z2, int i, mjq mjqVar, boolean z3, String str) {
        str.getClass();
        this.a = jjiVar;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = mjqVar;
        this.f = z3;
        this.g = null;
        this.h = str;
        this.i = new jjh(aerb.cJ, R.string.send_button_content_description_sms, Integer.valueOf(R.string.send_button_label_sms), (Integer) null, 16);
    }

    public static final jhx i(jhx jhxVar, jji jjiVar) {
        if (jhxVar.a == null) {
            jjiVar = null;
        }
        return new jhx(jjiVar, jhxVar.b, jhxVar.c, jhxVar.d, jhxVar.e, jhxVar.f, jhxVar.h);
    }

    @Override // defpackage.jhz
    public final int a() {
        return this.d;
    }

    @Override // defpackage.jhz
    public final jjh b() {
        return this.i;
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
    public final /* synthetic */ mjq e() {
        return mjq.SIMPLE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhx)) {
            return false;
        }
        jhx jhxVar = (jhx) obj;
        if (!d.F(this.a, jhxVar.a) || this.b != jhxVar.b || this.c != jhxVar.c || this.d != jhxVar.d || this.e != jhxVar.e || this.f != jhxVar.f) {
            return false;
        }
        jjg jjgVar = jhxVar.g;
        if (d.F(this.h, jhxVar.h)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.jhz
    public final String f() {
        return this.h;
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
        return (((((((((((hashCode * 31) + a.v(this.b)) * 31) + a.v(this.c)) * 31) + this.d) * 31) + this.e.hashCode()) * 31) + a.v(this.f)) * 961) + this.h.hashCode();
    }

    public final String toString() {
        return "Sms(textCounter=" + this.a + ", mediaAttachmentsSupported=" + this.b + ", locationSharingSupported=" + this.c + ", attachmentCountLimit=" + this.d + ", bestAvailableTransportFeatureSet=" + this.e + ", isMassSms=" + this.f + ", disabled=null, draftHint=" + this.h + ")";
    }
}
