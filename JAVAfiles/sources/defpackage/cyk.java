package defpackage;

import defpackage.cga;
import defpackage.cyl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyk {
    public final cxn a;
    public final cxc b;
    public cyn c;
    public final cga.c d;
    public cga.c e;
    public cbh f;
    public cbh g;
    private a h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a implements cwv {
        public cga.c a;
        public int b;
        public cbh c;
        public cbh d;
        public boolean e;

        public a(cga.c cVar, int i, cbh cbhVar, cbh cbhVar2, boolean z) {
            this.a = cVar;
            this.b = i;
            this.c = cbhVar;
            this.d = cbhVar2;
            this.e = z;
        }

        @Override // defpackage.cwv
        public final boolean a(int i, int i2) {
            cbh cbhVar = this.c;
            int i3 = this.b;
            if (cyl.a((cga.b) cbhVar.a[i + i3], (cga.b) this.d.a[i3 + i2]) != 0) {
                return true;
            }
            return false;
        }
    }

    public cyk(cxn cxnVar) {
        this.a = cxnVar;
        cxc cxcVar = new cxc(cxnVar);
        this.b = cxcVar;
        this.c = cxcVar;
        czn cznVar = cxcVar.f;
        this.d = cznVar;
        this.e = cznVar;
    }

    public static final cga.c k(cga.b bVar, cga.c cVar) {
        cga.c cwgVar;
        if (bVar instanceof cyg) {
            cwgVar = ((cyg) bVar).d();
            cwgVar.q = cyp.c(cwgVar);
        } else {
            cwgVar = new cwg(bVar);
        }
        if (cwgVar.z) {
            csg.c("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        cwgVar.w = true;
        cga.c cVar2 = cVar.t;
        if (cVar2 != null) {
            cVar2.s = cwgVar;
            cwgVar.t = cVar2;
        }
        cVar.t = cwgVar;
        cwgVar.s = cVar;
        return cwgVar;
    }

    public static final cga.c l(cga.c cVar) {
        if (cVar.z) {
            cyp.f(cVar);
            cVar.G();
            cVar.D();
        }
        cga.c cVar2 = cVar.t;
        cga.c cVar3 = cVar.s;
        if (cVar2 != null) {
            cVar2.s = cVar3;
            cVar.t = null;
        }
        if (cVar3 != null) {
            cVar3.t = cVar2;
            cVar.s = null;
        }
        cVar3.getClass();
        return cVar3;
    }

    public static final void m(cga.b bVar, cga.b bVar2, cga.c cVar) {
        if ((bVar instanceof cyg) && (bVar2 instanceof cyg)) {
            cyl.AnonymousClass1 anonymousClass1 = cyl.a;
            cVar.getClass();
            ((cyg) bVar2).e(cVar);
            if (cVar.z) {
                cyp.g(cVar);
                return;
            } else {
                cVar.x = true;
                return;
            }
        }
        if (cVar instanceof cwg) {
            cwg cwgVar = (cwg) cVar;
            if (cwgVar.z) {
                cwgVar.y();
            }
            cwgVar.a = bVar2;
            cwgVar.q = cyp.a(bVar2);
            if (cwgVar.z) {
                cwgVar.v(false);
            }
            if (cVar.z) {
                cyp.g(cVar);
                return;
            } else {
                cVar.x = true;
                return;
            }
        }
        throw new IllegalStateException("Unknown Modifier.Node type");
    }

    public final int a() {
        return this.e.r;
    }

    public final void b() {
        for (cga.c cVar = this.e; cVar != null; cVar = cVar.t) {
            cVar.C();
        }
    }

    public final void c() {
        for (cga.c cVar = this.d; cVar != null; cVar = cVar.s) {
            if (cVar.z) {
                cVar.D();
            }
        }
    }

    public final void d(cga.c cVar, cyn cynVar) {
        cyn cynVar2;
        for (cga.c cVar2 = cVar.s; cVar2 != null; cVar2 = cVar2.s) {
            if (cVar2 == cyl.a) {
                cxn t = this.a.t();
                if (t != null) {
                    cynVar2 = t.x();
                } else {
                    cynVar2 = null;
                }
                cynVar.v = cynVar2;
                this.c = cynVar;
                return;
            }
            if ((cVar2.q & 2) == 0) {
                cVar2.I(cynVar);
            } else {
                return;
            }
        }
    }

    public final void e() {
        for (cga.c cVar = this.e; cVar != null; cVar = cVar.t) {
            cVar.F();
            if (cVar.w) {
                cyp.d(cVar);
            }
            if (cVar.x) {
                cyp.g(cVar);
            }
            cVar.w = false;
            cVar.x = false;
        }
    }

    public final void f() {
        for (cga.c cVar = this.d; cVar != null; cVar = cVar.s) {
            if (cVar.z) {
                cVar.G();
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v4 ??, still in use, count: 1, list:
          (r11v4 ?? I:cyk$a) from 0x001e: IPUT (r11v4 ?? I:cyk$a), (r27v0 'this' ?? I:cyk A[IMMUTABLE_TYPE, THIS]) (LINE:31) cyk.h cyk$a
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public final void g(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v4 ??, still in use, count: 1, list:
          (r11v4 ?? I:cyk$a) from 0x001e: IPUT (r11v4 ?? I:cyk$a), (r27v0 'this' ?? I:cyk A[IMMUTABLE_TYPE, THIS]) (LINE:31) cyk.h cyk$a
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r28v0 ??
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

    public final void h() {
        int i = 0;
        for (cga.c cVar = this.d.s; cVar != null && cVar != cyl.a; cVar = cVar.s) {
            i |= cVar.q;
            cVar.r = i;
        }
    }

    public final void i() {
        cyn cynVar;
        cyn cynVar2;
        cyn cynVar3 = this.b;
        for (cga.c cVar = this.d.s; cVar != null; cVar = cVar.s) {
            cxi d = cwp.d(cVar);
            if (d != null) {
                cyn cynVar4 = cVar.v;
                if (cynVar4 != null) {
                    cxj cxjVar = (cxj) cynVar4;
                    cxi cxiVar = cxjVar.f;
                    cxjVar.E(d);
                    cynVar2 = cxjVar;
                    if (cxiVar != cVar) {
                        cxjVar.ag();
                        cynVar2 = cxjVar;
                    }
                } else {
                    cyn cxjVar2 = new cxj(this.a, d);
                    cVar.I(cxjVar2);
                    cynVar2 = cxjVar2;
                }
                cynVar3.v = cynVar2;
                cynVar2.u = cynVar3;
                cynVar3 = cynVar2;
            } else {
                cVar.I(cynVar3);
            }
        }
        cxn t = this.a.t();
        if (t != null) {
            cynVar = t.x();
        } else {
            cynVar = null;
        }
        cynVar3.v = cynVar;
        this.c = cynVar3;
    }

    public final boolean j(int i) {
        if ((i & a()) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        cga.c cVar = this.e;
        if (cVar != this.d) {
            while (true) {
                if (cVar == null || cVar == this.d) {
                    break;
                }
                sb.append(cVar.toString());
                if (cVar.t == this.d) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                cVar = cVar.t;
            }
        } else {
            sb.append("]");
        }
        return sb.toString();
    }
}
