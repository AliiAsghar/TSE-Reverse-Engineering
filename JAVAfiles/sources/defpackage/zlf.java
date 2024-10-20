package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zlf {
    public akbp a;
    public akbp b;
    public akbp c;
    public final gfl d;
    public final armf e;
    public Optional f;
    public Optional g;
    public Optional h;
    public final armf i;
    public final armf j;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class a implements akgh<lef> {
        public a() {
        }

        @Override // defpackage.akgh
        public final void a(Throwable th) {
            zlf.this.f.ifPresent(new zih(9));
            zlf.this.h.ifPresent(new zih(16));
            zlf.this.g.ifPresent(new zih(17));
        }

        @Override // defpackage.akgh
        public final void b() {
            zlf.this.f.ifPresent(new zih(13));
            zlf.this.h.ifPresent(new zih(14));
            zlf.this.g.ifPresent(new zih(15));
        }

        @Override // defpackage.akgh
        public final /* synthetic */ void c(Object obj) {
            lef lefVar = (lef) obj;
            zlf.this.f.ifPresent(new zih(18));
            zlf.this.f.ifPresent(new zjo(lefVar, 14));
            if (lefVar.b) {
                zlf.this.f.ifPresent(new zih(20));
            }
            zlf.this.h.ifPresent(new zle(1));
            zlf.this.h.ifPresent(new zjo(lefVar, 15));
            zlf.this.g.ifPresent(new zle(0));
            zlf.this.g.ifPresent(new zjo(lefVar, 13));
            if (!lefVar.b && !lefVar.a) {
                zlf.this.g.ifPresent(new zih(10));
            }
            zlf.this.f.ifPresent(new zih(11));
            zlf.this.h.ifPresent(new zih(12));
            zlf.this.g.ifPresent(new zih(19));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class b implements akbp<Boolean, Void> {
        public b() {
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            zlf.this.h.ifPresent(new zjo((Boolean) obj, 16));
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            zlf.this.h.ifPresent(new zle(3));
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            zlf.this.h.ifPresent(new zle(2));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class c implements akbp<Boolean, Void> {
        public c() {
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            zlf.this.f.ifPresent(new zle(6));
            zlf.this.f.ifPresent(new zjo((Boolean) obj, 17));
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            zlf.this.f.ifPresent(new zle(5));
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            zlf.this.f.ifPresent(new zle(4));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class d implements akbp<Boolean, Void> {
        public d() {
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            zlf.this.g.ifPresent(new zjo((Boolean) obj, 18));
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            zlf.this.g.ifPresent(new zle(7));
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            zlf.this.g.ifPresent(new zle(8));
        }
    }

    public zlf(zld zldVar, armf armfVar, armf armfVar2, armf armfVar3) {
        this.d = zldVar;
        this.e = armfVar;
        this.i = armfVar2;
        this.j = armfVar3;
    }
}
