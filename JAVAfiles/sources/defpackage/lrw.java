package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lrw {
    public static final xze a = xze.g("Bugle", "PrivacySettingsFragmentPeer");
    public final lrv b;
    public final akbo c;
    public final akvf d;
    public final armf e;
    public Optional f;
    public final akgh g = new akgh<Boolean>() { // from class: lrw.1
        @Override // defpackage.akgh
        public final void a(Throwable th) {
            lrw.this.f.ifPresent(new ldx(9));
            lrw.a.n("Failed to load etouffee setting data", th);
        }

        @Override // defpackage.akgh
        public final void b() {
            lrw.this.f.ifPresent(new ldx(10));
        }

        @Override // defpackage.akgh
        public final /* bridge */ /* synthetic */ void c(Object obj) {
            lrw.this.f.ifPresent(new leq((Boolean) obj, 12));
        }
    };
    public final akbp h = new akbp<Boolean, Void>() { // from class: lrw.2
        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            lrw.this.f.ifPresent(new leq((Boolean) obj, 13));
            lrw.a.n("Failed to save etouffee setting data", th);
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            lrw.this.f.ifPresent(new ldx(11));
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            lrw.this.f.ifPresent(new ldx(12));
        }
    };
    public final aohs i;

    public lrw(lrv lrvVar, aohs aohsVar, akbo akboVar, akvf akvfVar, armf armfVar) {
        this.b = lrvVar;
        this.i = aohsVar;
        this.c = akboVar;
        this.d = akvfVar;
        this.e = armfVar;
    }
}
