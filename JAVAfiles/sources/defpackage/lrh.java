package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lrh {
    public static final xze a = xze.g("Bugle", "EtouffeeToggleFragmentPeer");
    public final lrg b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public Optional h = Optional.empty();
    public final akgh i = new akgh<Boolean>() { // from class: lrh.1
        @Override // defpackage.akgh
        public final void a(Throwable th) {
            lrh.this.h.ifPresent(new ldx(5));
            lrh.a.n("Failed to load etouffee setting data", th);
        }

        @Override // defpackage.akgh
        public final void b() {
            lrh.this.h.ifPresent(new ldx(6));
        }

        @Override // defpackage.akgh
        public final /* bridge */ /* synthetic */ void c(Object obj) {
            lrh.this.h.ifPresent(new leq((Boolean) obj, 9));
        }
    };
    public final akbp j = new akbp<Boolean, Void>() { // from class: lrh.2
        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            lrh.this.h.ifPresent(new leq((Boolean) obj, 10));
            lrh.a.n("Failed to save etouffee setting data", th);
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            lrh.this.h.ifPresent(new ldx(8));
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            lrh.this.h.ifPresent(new ldx(7));
        }
    };

    public lrh(lrg lrgVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        this.b = lrgVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.f = armfVar;
        this.g = armfVar5;
    }
}
