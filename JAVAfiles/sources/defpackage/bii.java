package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.ajt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bii extends biz implements bit {
    private bis a;
    private biw j;

    /* compiled from: PG */
    /* renamed from: bii$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<arnb> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            cwy.a(bii.this);
            return arnb.a;
        }
    }

    public bii(ajq ajqVar, boolean z, float f, ckx ckxVar, arqg arqgVar) {
        super(ajqVar, z, f, ckxVar, arqgVar);
    }

    private final void j(biw biwVar) {
        this.j = biwVar;
        cwy.a(this);
    }

    @Override // defpackage.biz
    public final void a(ajt.b bVar, long j, float f) {
        bis bisVar = this.a;
        if (bisVar == null) {
            bisVar = bjc.b(bjc.a((View) cwn.a(this, AndroidCompositionLocals_androidKt.f)));
            this.a = bisVar;
            bisVar.getClass();
        }
        biw a = bisVar.a(this);
        a.a(bVar, ((biz) this).c, j, arsk.g(f), h(), ((bin) this.d.a()).d, new AnonymousClass1());
        j(a);
    }

    @Override // defpackage.bit
    public final void b() {
        j(null);
    }

    @Override // defpackage.biz
    public final void d(cny cnyVar) {
        ckr b = cnyVar.q().b();
        biw biwVar = this.j;
        if (biwVar != null) {
            biwVar.d(this.g, arsk.g(this.f), h(), ((bin) this.d.a()).d);
            biwVar.draw(cjx.a(b));
        }
    }

    @Override // defpackage.biz
    public final void e(ajt.b bVar) {
        biw biwVar = this.j;
        if (biwVar != null) {
            biwVar.c();
        }
    }

    @Override // cga.c
    public final void s() {
        bis bisVar = this.a;
        if (bisVar != null) {
            bisVar.b(this);
        }
    }
}
