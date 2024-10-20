package defpackage;

import defpackage.cee;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdy {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cdy$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqg<arnb> {
        final /* synthetic */ cdz a;
        final /* synthetic */ ceh b;
        final /* synthetic */ cee c;
        final /* synthetic */ String d;
        final /* synthetic */ Object e;
        final /* synthetic */ Object[] f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cdz cdzVar, ceh cehVar, cee ceeVar, String str, Object obj, Object[] objArr) {
            super(0);
            this.a = cdzVar;
            this.b = cehVar;
            this.c = ceeVar;
            this.d = str;
            this.e = obj;
            this.f = objArr;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            boolean z;
            cdz cdzVar = this.a;
            cee ceeVar = cdzVar.b;
            cee ceeVar2 = this.c;
            boolean z2 = true;
            if (ceeVar != ceeVar2) {
                cdzVar.b = ceeVar2;
                z = true;
            } else {
                z = false;
            }
            String str = this.d;
            if (!d.F(cdzVar.c, str)) {
                cdzVar.c = str;
            } else {
                z2 = z;
            }
            Object[] objArr = this.f;
            Object obj = this.e;
            cdzVar.a = this.b;
            cdzVar.d = obj;
            cdzVar.e = objArr;
            cee.a aVar = cdzVar.f;
            if (aVar != null && z2) {
                aVar.a();
                cdzVar.f = null;
                cdzVar.a();
            }
            return arnb.a;
        }
    }

    public static final String a(Object obj) {
        Objects.toString(obj);
        return obj.toString().concat(" cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x004f: INVOKE (r12v0 ?? I:bwj), (r8v0 ?? I:java.lang.Object) INTERFACE call: bwj.B(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:80)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public static final java.lang.Object b(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x004f: INVOKE (r12v0 ?? I:bwj), (r8v0 ?? I:java.lang.Object) INTERFACE call: bwj.B(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:80)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
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
