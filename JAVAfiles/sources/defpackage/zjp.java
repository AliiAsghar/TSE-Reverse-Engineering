package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zjp {
    public final armf a;
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public Optional f = Optional.empty();
    public Optional g = Optional.empty();
    public final akgh h = new akgh<yiy>() { // from class: zjp.1
        @Override // defpackage.akgh
        public final void a(Throwable th) {
            zjp.this.f.ifPresent(new zih(4));
            zjp.this.g.ifPresent(new zih(5));
        }

        @Override // defpackage.akgh
        public final void b() {
            zjp.this.f.ifPresent(new zih(2));
            zjp.this.g.ifPresent(new zih(3));
        }

        @Override // defpackage.akgh
        public final /* bridge */ /* synthetic */ void c(Object obj) {
            yiy yiyVar = (yiy) obj;
            zjp.this.f.ifPresent(new zjo(yiyVar, 4));
            zjp.this.g.ifPresent(new zjo(yiyVar, 5));
        }
    };
    public final akbp i = new akbp<Boolean, Void>() { // from class: zjp.2
        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            zjp.this.f.ifPresent(new zjo((Boolean) obj, 6));
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            zjp.this.f.ifPresent(new zjo((Boolean) obj, 7));
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            zjp.this.f.ifPresent(new zih(6));
        }
    };
    public final akbp j = new akbp<Boolean, Void>() { // from class: zjp.3
        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            zjp.this.g.ifPresent(new zjo((Boolean) obj, 8));
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            zjp.this.g.ifPresent(new zjo((Boolean) obj, 9));
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            zjp.this.g.ifPresent(new zih(7));
        }
    };

    public zjp(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        this.d = armfVar4;
        this.e = armfVar5;
    }

    public static boolean b() {
        if (ier.a() && ((Boolean) ((utz) ier.c.get()).e()).booleanValue()) {
            return true;
        }
        return false;
    }

    public final Optional a(int i) {
        return Optional.ofNullable(((zjn) this.a.b()).a(((zjn) this.a.b()).S(i)));
    }
}
