package defpackage;

import androidx.compose.foundation.HoverableElement;
import defpackage.ajt;
import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpv {
    public static final bpv a = new bpv();
    public static final float b;
    private static final clr c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bpv$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ ajr b;
        final /* synthetic */ cez c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ajr ajrVar, cez cezVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = ajrVar;
            this.c = cezVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass1) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            int i = this.a;
            aqil.P(obj);
            if (i == 0) {
                ajr ajrVar = this.b;
                final cez cezVar = this.c;
                asai a = ajrVar.a();
                asaj asajVar = new asaj() { // from class: bpv.1.1
                    @Override // defpackage.asaj
                    public final /* bridge */ /* synthetic */ Object fv(Object obj2, arpe arpeVar) {
                        ajp ajpVar = (ajp) obj2;
                        if (ajpVar instanceof ajt.b) {
                            cez.this.add(ajpVar);
                        } else if (ajpVar instanceof ajt.c) {
                            cez.this.remove(((ajt.c) ajpVar).a);
                        } else if (ajpVar instanceof ajt.a) {
                            cez.this.remove(((ajt.a) ajpVar).a);
                        } else if (ajpVar instanceof aji) {
                            cez.this.add(ajpVar);
                        } else if (ajpVar instanceof ajj) {
                            cez.this.remove(((ajj) ajpVar).a);
                        } else if (ajpVar instanceof ajh) {
                            cez.this.remove(((ajh) ajpVar).a);
                        }
                        return arnb.a;
                    }
                };
                this.a = 1;
                if (ascj.g((ascj) a, asajVar, this) == arplVar) {
                    return arplVar;
                }
            }
            return arnb.a;
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass1(this.b, this.c, arpeVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bpv$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ ajr b;
        final /* synthetic */ cga c;
        final /* synthetic */ bpt d;
        final /* synthetic */ boolean e;
        final /* synthetic */ long f;
        final /* synthetic */ int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ajr ajrVar, cga cgaVar, bpt bptVar, boolean z, long j, int i) {
            super(2);
            this.b = ajrVar;
            this.c = cgaVar;
            this.d = bptVar;
            this.e = z;
            this.f = j;
            this.g = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            bpv.this.c(this.b, this.c, this.d, this.e, this.f, (bwj) obj, bzh.a(this.g | 1));
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bpv$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqw<cny, cjn, cku, arnb> {
        public static final AnonymousClass3 a = new AnonymousClass3();

        public AnonymousClass3() {
            super(3);
        }

        @Override // defpackage.arqw
        public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            cny cnyVar = (cny) obj;
            long j = ((cjn) obj2).a;
            long j2 = ((cku) obj3).i;
            bpv bpvVar = bpv.a;
            cnw.g(cnyVar, j2, cnyVar.em(bpv.b) / 2.0f, j, null, 120);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bpv$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqr<cny, arnb> {
        final /* synthetic */ bqb a;
        final /* synthetic */ long b;
        final /* synthetic */ long c;
        final /* synthetic */ long d;
        final /* synthetic */ long e;
        final /* synthetic */ float f;
        final /* synthetic */ float g;
        final /* synthetic */ arqv h;
        final /* synthetic */ arqw i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(bqb bqbVar, long j, long j2, long j3, long j4, float f, float f2, arqv arqvVar, arqw arqwVar) {
            super(1);
            this.a = bqbVar;
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
            this.f = f;
            this.g = f2;
            this.h = arqvVar;
            this.i = arqwVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            float f;
            long j;
            float f2;
            cny cnyVar = (cny) obj;
            bpv bpvVar = bpv.a;
            bqb bqbVar = this.a;
            float b = bqbVar.b();
            float eg = cnyVar.eg(bqbVar.f.b());
            float eh = cnyVar.eh(0);
            float eg2 = cnyVar.eg(this.a.d());
            long z = a.z(brg.a, cjn.c(cnyVar.a()));
            long z2 = a.z(cjt.c(cnyVar.o()), cjn.c(cnyVar.a()));
            float em = cnyVar.em(eg);
            long z3 = a.z(cjn.b(z) + ((cjn.b(z2) - cjn.b(z)) * b), cjn.c(cnyVar.a()));
            long z4 = a.z(cjn.b(z) + ((cjn.b(z2) - cjn.b(z)) * brg.a), cjn.c(cnyVar.a()));
            float f3 = em / 2.0f;
            float em2 = cnyVar.em(this.g);
            float f4 = this.f;
            if (Float.compare(f4, brg.a) > 0) {
                cnyVar.em(eh);
                cnyVar.em(f4);
                f = (cnyVar.em(eg2) / 2.0f) + cnyVar.em(f4);
            } else {
                f = 0.0f;
            }
            arqv arqvVar = this.h;
            if (cjn.b(z3) < (cjn.b(z2) - f) - f3) {
                long j2 = this.b;
                float b2 = cjn.b(z3) + f;
                float b3 = cjn.b(z2);
                j = z2;
                f2 = em;
                bpv.a(cnyVar, a.z(b2, brg.a), a.z(b3 - b2, em), j2, em2, f3);
                if (arqvVar != null) {
                    arqvVar.a(cnyVar, new cjn(a.z(b3 - f3, cjn.c(cnyVar.a()))));
                }
            } else {
                j = z2;
                f2 = em;
            }
            float b4 = (cjn.b(z3) - f) + brg.a;
            if (b4 > f3) {
                bpv.a(cnyVar, a.z(brg.a, brg.a), a.z(b4, f2), this.c, f3, em2);
            }
            a.z(cjn.b(z) + f3, cjn.c(z));
            a.z(cjn.b(j) - f3, cjn.c(j));
            cjn.b(z4);
            cjn.b(z4);
            new arsy(cjn.b(z3) - f, cjn.b(z3) + f);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bpv$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ bqb b;
        final /* synthetic */ cga c;
        final /* synthetic */ boolean d;
        final /* synthetic */ bpt e;
        final /* synthetic */ arqv f;
        final /* synthetic */ arqw g;
        final /* synthetic */ float h;
        final /* synthetic */ float i;
        final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(bqb bqbVar, cga cgaVar, boolean z, bpt bptVar, arqv arqvVar, arqw arqwVar, float f, float f2, int i) {
            super(2);
            this.b = bqbVar;
            this.c = cgaVar;
            this.d = z;
            this.e = bptVar;
            this.f = arqvVar;
            this.g = arqwVar;
            this.h = f;
            this.i = f2;
            this.j = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            bpv.this.d(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (bwj) obj, bzh.a(this.j | 1));
            return arnb.a;
        }
    }

    static {
        buo buoVar = bvj.a;
        b = bvj.n;
        c = new cke((byte[]) null);
    }

    private bpv() {
    }

    public static final void a(cny cnyVar, long j, long j2, long j3, float f, float f2) {
        long z = a.z(f, f);
        long z2 = a.z(f2, f2);
        cjr a2 = cjs.a(cjq.a(a.z(cjn.b(j), brg.a), a.z(cjt.c(j2), cjt.a(j2))), z, z2, z2, z);
        clr clrVar = c;
        clq.c(clrVar, a2);
        cnw.d(cnyVar, clrVar, j3, null, 60);
        clrVar.l();
    }

    public static final bpt b(blh blhVar) {
        long f;
        long f2;
        long f3;
        long f4;
        long f5;
        bpt bptVar = blhVar.V;
        if (bptVar == null) {
            buo buoVar = bvj.a;
            long b2 = bli.b(blhVar, bvj.h);
            long b3 = bli.b(blhVar, bvj.a);
            long b4 = bli.b(blhVar, bvj.l);
            long b5 = bli.b(blhVar, bvj.l);
            long b6 = bli.b(blhVar, bvj.a);
            f = ckw.f(cku.d(r13), cku.c(r13), cku.b(r13), bvj.e, cku.f(bli.b(blhVar, bvj.d)));
            long h = ckw.h(f, blhVar.p);
            f2 = ckw.f(cku.d(r1), cku.c(r1), cku.b(r1), bvj.c, cku.f(bli.b(blhVar, bvj.b)));
            f3 = ckw.f(cku.d(r1), cku.c(r1), cku.b(r1), bvj.g, cku.f(bli.b(blhVar, bvj.f)));
            f4 = ckw.f(cku.d(r1), cku.c(r1), cku.b(r1), bvj.g, cku.f(bli.b(blhVar, bvj.f)));
            f5 = ckw.f(cku.d(r1), cku.c(r1), cku.b(r1), bvj.c, cku.f(bli.b(blhVar, bvj.b)));
            bpt bptVar2 = new bpt(b2, b3, b4, b5, b6, h, f2, f3, f4, f5);
            blhVar.V = bptVar2;
            return bptVar2;
        }
        return bptVar;
    }

    public final void c(ajr ajrVar, cga cgaVar, bpt bptVar, boolean z, long j, bwj bwjVar, int i) {
        int i2;
        long j2;
        cga a2;
        long j3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        bwj c2 = bwjVar.c(-290277409);
        if ((i & 6) == 0) {
            if (true != c2.G(ajrVar)) {
                i8 = 2;
            } else {
                i8 = 4;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c2.G(cgaVar)) {
                i7 = 16;
            } else {
                i7 = 32;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (true != c2.G(bptVar)) {
                i6 = 128;
            } else {
                i6 = 256;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (true != c2.H(z)) {
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (true != c2.F(j)) {
                i4 = 8192;
            } else {
                i4 = 16384;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (true != c2.G(this)) {
                i3 = 65536;
            } else {
                i3 = 131072;
            }
            i2 |= i3;
        }
        if ((74899 & i2) == 74898 && c2.L()) {
            c2.v();
        } else {
            c2.w();
            if ((i & 1) != 0 && !c2.J()) {
                c2.v();
            }
            c2.n();
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = new cez();
                bwkVar.ad(T);
            }
            int i9 = i2 & 14;
            cez cezVar = (cez) T;
            Object T2 = bwkVar.T();
            if (i9 == 4 || T2 == bwj.a.a) {
                T2 = new AnonymousClass1(ajrVar, cezVar, null);
                bwkVar.ad(T2);
            }
            bxl.g(ajrVar, (arqv) T2, c2);
            if (!cezVar.isEmpty()) {
                float b2 = dra.b(j) / 2.0f;
                float a3 = dra.a(j);
                j2 = (Float.floatToRawIntBits(a3) & 4294967295L) | (Float.floatToRawIntBits(b2) << 32);
            } else {
                j2 = j;
            }
            a2 = amv.i(cgaVar, j2).a(new HoverableElement(ajrVar));
            if (z) {
                j3 = bptVar.a;
            } else {
                j3 = bptVar.f;
            }
            buo buoVar = bvj.a;
            amx.a(adf.a(a2, j3, bpl.a(bvj.j, c2)), c2);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass2(ajrVar, cgaVar, bptVar, z, j, i);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v8 ??, still in use, count: 1, list:
          (r14v8 ?? I:java.lang.Object) from 0x018e: INVOKE (r15v3 ?? I:bwk), (r14v8 ?? I:java.lang.Object) VIRTUAL call: bwk.ad(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:399)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public final void d(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v8 ??, still in use, count: 1, list:
          (r14v8 ?? I:java.lang.Object) from 0x018e: INVOKE (r15v3 ?? I:bwk), (r14v8 ?? I:java.lang.Object) VIRTUAL call: bwk.ad(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:399)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r24v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
}
