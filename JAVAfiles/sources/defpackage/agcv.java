package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agcv extends arrp implements arqv {
    final /* synthetic */ agcj a;
    final /* synthetic */ agcw b;
    final /* synthetic */ bqn c;
    final /* synthetic */ byn d;
    final /* synthetic */ byn e;
    final /* synthetic */ byn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agcv(agcj agcjVar, agcw agcwVar, bqn bqnVar, byn bynVar, byn bynVar2, byn bynVar3) {
        super(2);
        this.a = agcjVar;
        this.b = agcwVar;
        this.c = bqnVar;
        this.d = bynVar;
        this.e = bynVar2;
        this.f = bynVar3;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v9 ??, still in use, count: 1, list:
          (r9v9 ?? I:java.lang.Object) from 0x004e: INVOKE (r8v1 ?? I:bwj), (r9v9 ?? I:java.lang.Object) INTERFACE call: bwj.B(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:79)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ java.lang.Object a(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v9 ??, still in use, count: 1, list:
          (r9v9 ?? I:java.lang.Object) from 0x004e: INVOKE (r8v1 ?? I:bwj), (r9v9 ?? I:java.lang.Object) INTERFACE call: bwj.B(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:79)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r8v0 ??
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
