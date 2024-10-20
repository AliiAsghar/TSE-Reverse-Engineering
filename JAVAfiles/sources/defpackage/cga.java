package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface cga {
    public static final a e = a.a;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public interface b extends cga {
    }

    cga a(cga cgaVar);

    Object b(Object obj, arqv arqvVar);

    boolean c(arqr arqrVar);

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public abstract class c implements cwo {
        private arwe a;
        private boolean b;
        private boolean c;
        public int q;
        public c s;
        public c t;
        public cyw u;
        public cyn v;
        public boolean w;
        public boolean x;
        public arqg y;
        public boolean z;
        public c p = this;
        public int r = -1;

        @Override // defpackage.cwo
        public final c A() {
            return this.p;
        }

        public final arwe B() {
            arwe arweVar = this.a;
            if (arweVar == null) {
                arwe e = arwi.e(((dai) cwp.g(this)).e.plus(new arxo((arxm) ((dai) cwp.g(this)).e.get(arxm.c))));
                this.a = e;
                return e;
            }
            return arweVar;
        }

        public void C() {
            if (this.z) {
                csg.c("node attached multiple times");
            }
            if (this.v == null) {
                csg.c("attach invoked on a node without a coordinator");
            }
            this.z = true;
            this.b = true;
        }

        public void D() {
            if (!this.z) {
                csg.c("Cannot detach a node that is not attached");
            }
            if (this.b) {
                csg.c("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.c) {
                csg.c("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.z = false;
            arwe arweVar = this.a;
            if (arweVar != null) {
                arwi.g(arweVar, new cgc());
                this.a = null;
            }
        }

        public void E() {
            if (!this.z) {
                csg.c("reset() called on an unattached node");
            }
            eb();
        }

        public void F() {
            if (!this.z) {
                csg.c("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.b) {
                csg.c("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.b = false;
            dQ();
            this.c = true;
        }

        public void G() {
            if (!this.z) {
                csg.c("node detached multiple times");
            }
            if (this.v == null) {
                csg.c("detach invoked on a node without a coordinator");
            }
            if (!this.c) {
                csg.c("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.c = false;
            arqg arqgVar = this.y;
            if (arqgVar != null) {
                arqgVar.a();
            }
            s();
        }

        public void H(c cVar) {
            this.p = cVar;
        }

        public void I(cyn cynVar) {
            this.v = cynVar;
        }

        public boolean dL() {
            return true;
        }

        public void dQ() {
        }

        public void eb() {
        }

        public void s() {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a implements cga {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        @Override // defpackage.cga
        public final boolean c(arqr arqrVar) {
            return true;
        }

        public final String toString() {
            return "Modifier";
        }

        @Override // defpackage.cga
        public final cga a(cga cgaVar) {
            return cgaVar;
        }

        @Override // defpackage.cga
        public final Object b(Object obj, arqv arqvVar) {
            return obj;
        }
    }
}
