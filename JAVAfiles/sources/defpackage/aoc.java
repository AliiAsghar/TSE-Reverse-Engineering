package defpackage;

import defpackage.ajw;
import defpackage.cfq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoc {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: aoc$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ aov b;
        final /* synthetic */ amj c;
        final /* synthetic */ boolean d;
        final /* synthetic */ boolean e;
        final /* synthetic */ ahl f;
        final /* synthetic */ boolean g;
        final /* synthetic */ cfq.b h;
        final /* synthetic */ ajw.e i;
        final /* synthetic */ cfq.c j;
        final /* synthetic */ ajw.b k;
        final /* synthetic */ arqr l;
        final /* synthetic */ int m;
        final /* synthetic */ int n;
        final /* synthetic */ int o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cga cgaVar, aov aovVar, amj amjVar, boolean z, boolean z2, ahl ahlVar, boolean z3, cfq.b bVar, ajw.e eVar, cfq.c cVar, ajw.b bVar2, arqr arqrVar, int i, int i2, int i3) {
            super(2);
            this.a = cgaVar;
            this.b = aovVar;
            this.c = amjVar;
            this.d = z;
            this.e = z2;
            this.f = ahlVar;
            this.g = z3;
            this.h = bVar;
            this.i = eVar;
            this.j = cVar;
            this.k = bVar2;
            this.l = arqrVar;
            this.m = i;
            this.n = i2;
            this.o = i3;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int i = this.m;
            int i2 = this.n;
            int a = bzh.a(i | 1);
            int a2 = bzh.a(i2);
            int i3 = this.o;
            aoc.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (bwj) obj, a, a2, i3);
            return arnb.a;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v16 ??, still in use, count: 1, list:
          (r1v16 ?? I:java.lang.Object) from 0x03b1: INVOKE (r0v3 ?? I:bwk), (r1v16 ?? I:java.lang.Object) VIRTUAL call: bwk.ad(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:38)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public static final void a(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v16 ??, still in use, count: 1, list:
          (r1v16 ?? I:java.lang.Object) from 0x03b1: INVOKE (r0v3 ?? I:bwk), (r1v16 ?? I:java.lang.Object) VIRTUAL call: bwk.ad(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:38)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r33v0 ??
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
