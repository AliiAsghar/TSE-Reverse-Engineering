package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zuo implements zsq {
    public static final xze a = xze.g("Bugle", "DelayBanner");
    public final zsl b;
    private final Context c;
    private final zlc d;
    private final znp e;
    private final aohs f;

    public zuo(Context context, zlc zlcVar, aohs aohsVar, znp znpVar, zsl zslVar) {
        this.c = context;
        this.d = zlcVar;
        this.f = aohsVar;
        this.e = znpVar;
        this.b = zslVar;
    }

    @Override // defpackage.zsq
    public final zsm a() {
        return new zsm("DelayBanner", true);
    }

    @Override // defpackage.zsq
    public final void g() {
        znp znpVar = this.e;
        this.f.C(new akfk((ansy) znpVar.a, new ikn(znpVar, 17), "DELAY_BANNER_STATE_KEY", 2), new akgh<Boolean>() { // from class: zuo.1
            @Override // defpackage.akgh
            public final void a(Throwable th) {
                zuo.a.q("Error getting delay banner");
                zuo zuoVar = zuo.this;
                zuoVar.b.a(zuoVar, false);
            }

            @Override // defpackage.akgh
            public final /* bridge */ /* synthetic */ void c(Object obj) {
                zuo zuoVar = zuo.this;
                zuoVar.b.a(zuoVar, false);
            }

            @Override // defpackage.akgh
            public final /* synthetic */ void b() {
            }
        });
    }

    @Override // defpackage.zsq
    public final aabr h() {
        return this.d.a(this.c);
    }

    @Override // defpackage.zsq
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.zsq
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.zsq
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.zsq
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.zsq
    public final void f() {
    }
}
