package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crl implements cri {
    public arqr a;
    public boolean b;
    private crt c;
    private final crh d = new AnonymousClass1();

    /* compiled from: PG */
    /* renamed from: crl$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends crh {
        public a b = a.a;

        /* compiled from: PG */
        /* renamed from: crl$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C00431 extends arrp implements arqr<MotionEvent, arnb> {
            final /* synthetic */ crl a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00431(crl crlVar) {
                super(1);
                this.a = crlVar;
            }

            @Override // defpackage.arqr
            public final /* bridge */ /* synthetic */ Object a(Object obj) {
                this.a.e().a((MotionEvent) obj);
                return arnb.a;
            }
        }

        /* compiled from: PG */
        /* renamed from: crl$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        static final class AnonymousClass2 extends arrp implements arqr<MotionEvent, arnb> {
            final /* synthetic */ crl b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(crl crlVar) {
                super(1);
                this.b = crlVar;
            }

            @Override // defpackage.arqr
            public final /* bridge */ /* synthetic */ Object a(Object obj) {
                a aVar;
                MotionEvent motionEvent = (MotionEvent) obj;
                if (motionEvent.getActionMasked() == 0) {
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    if (((Boolean) this.b.e().a(motionEvent)).booleanValue()) {
                        aVar = a.b;
                    } else {
                        aVar = a.c;
                    }
                    anonymousClass1.b = aVar;
                } else {
                    this.b.e().a(motionEvent);
                }
                return arnb.a;
            }
        }

        public AnonymousClass1() {
        }

        public final void a(cqq cqqVar) {
            List list = cqqVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((crc) list.get(i)).c()) {
                    if (this.b == a.b) {
                        cti ctiVar = this.a;
                        if (ctiVar != null) {
                            crp.a(cqqVar, ctiVar.i(0L), new C00431(crl.this), true);
                        } else {
                            throw new IllegalStateException("layoutCoordinates not set");
                        }
                    }
                    this.b = a.c;
                    return;
                }
            }
            cti ctiVar2 = this.a;
            if (ctiVar2 != null) {
                crp.a(cqqVar, ctiVar2.i(0L), new AnonymousClass2(crl.this), false);
                if (this.b == a.b) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((crc) list.get(i2)).b();
                    }
                    cql cqlVar = cqqVar.b;
                    if (cqlVar != null) {
                        cqlVar.c = !crl.this.b;
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("layoutCoordinates not set");
        }

        public final void b() {
            this.b = a.a;
            crl.this.b = false;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        private static final /* synthetic */ a[] d;

        static {
            a aVar = new a("Unknown", 0);
            a = aVar;
            a aVar2 = new a("Dispatching", 1);
            b = aVar2;
            a aVar3 = new a("NotDispatching", 2);
            c = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            d = aVarArr;
            arhi.f(aVarArr);
        }

        private a(String str, int i) {
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    @Override // defpackage.cga
    public final /* synthetic */ cga a(cga cgaVar) {
        return cfz.a(this, cgaVar);
    }

    @Override // defpackage.cga
    public final /* synthetic */ Object b(Object obj, arqv arqvVar) {
        return cgb.a(this, obj, arqvVar);
    }

    @Override // defpackage.cga
    public final /* synthetic */ boolean c(arqr arqrVar) {
        return cgb.b(this, arqrVar);
    }

    @Override // defpackage.cri
    public final crh d() {
        return this.d;
    }

    public final arqr e() {
        arqr arqrVar = this.a;
        if (arqrVar != null) {
            return arqrVar;
        }
        arro.b("onTouchEvent");
        return null;
    }

    public final void f(crt crtVar) {
        crt crtVar2 = this.c;
        if (crtVar2 != null) {
            crtVar2.a = null;
        }
        this.c = crtVar;
        if (crtVar == null) {
            return;
        }
        crtVar.a = this;
    }
}
