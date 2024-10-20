package androidx.compose.foundation.layout;

import defpackage.aks;
import defpackage.anm;
import defpackage.arqv;
import defpackage.arrp;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cyg;
import defpackage.d;
import defpackage.dre;
import defpackage.dri;
import defpackage.drk;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class WrapContentElement extends cyg<anm> {
    private final aks a;
    private final arqv b;
    private final Object c;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: androidx.compose.foundation.layout.WrapContentElement$a$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends arrp implements arqv<dri, drk, dre> {
            final /* synthetic */ cfq.c a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(cfq.c cVar) {
                super(2);
                this.a = cVar;
            }

            @Override // defpackage.arqv
            public final /* synthetic */ Object a(Object obj, Object obj2) {
                return new dre(4294967295L & this.a.a(0, (int) (((dri) obj).a & 4294967295L)));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: androidx.compose.foundation.layout.WrapContentElement$a$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends arrp implements arqv<dri, drk, dre> {
            final /* synthetic */ cfq a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(cfq cfqVar) {
                super(2);
                this.a = cfqVar;
            }

            @Override // defpackage.arqv
            public final /* synthetic */ Object a(Object obj, Object obj2) {
                return new dre(this.a.a(0L, ((dri) obj).a, (drk) obj2));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* renamed from: androidx.compose.foundation.layout.WrapContentElement$a$3, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass3 extends arrp implements arqv<dri, drk, dre> {
            final /* synthetic */ cfq.b a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(cfq.b bVar) {
                super(2);
                this.a = bVar;
            }

            @Override // defpackage.arqv
            public final /* synthetic */ Object a(Object obj, Object obj2) {
                return new dre(this.a.a(0, (int) (((dri) obj).a >> 32), (drk) obj2) << 32);
            }
        }

        public static final WrapContentElement a(cfq.c cVar) {
            return new WrapContentElement(aks.a, new AnonymousClass1(cVar), cVar);
        }

        public static final WrapContentElement b(cfq cfqVar) {
            return new WrapContentElement(aks.c, new AnonymousClass2(cfqVar), cfqVar);
        }

        public static final WrapContentElement c(cfq.b bVar) {
            return new WrapContentElement(aks.b, new AnonymousClass3(bVar), bVar);
        }
    }

    public WrapContentElement(aks aksVar, arqv arqvVar, Object obj) {
        this.a = aksVar;
        this.b = arqvVar;
        this.c = obj;
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ cga.c d() {
        return new anm(this.a, this.b);
    }

    @Override // defpackage.cyg
    public final /* bridge */ /* synthetic */ void e(cga.c cVar) {
        anm anmVar = (anm) cVar;
        anmVar.a = this.a;
        anmVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        if (this.a == wrapContentElement.a && d.F(this.c, wrapContentElement.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + 1237) * 31) + this.c.hashCode();
    }
}
