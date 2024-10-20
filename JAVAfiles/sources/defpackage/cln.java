package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cln {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a extends cln {
        public final clr a;

        public a(clr clrVar) {
            this.a = clrVar;
        }

        @Override // defpackage.cln
        public final cjp a() {
            return this.a.b();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class b extends cln {
        public final cjp a;

        public b(cjp cjpVar) {
            this.a = cjpVar;
        }

        @Override // defpackage.cln
        public final cjp a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && d.F(this.a, ((b) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class c extends cln {
        public final cjr a;
        public final clr b;

        public c(cjr cjrVar) {
            this.a = cjrVar;
            cke ckeVar = null;
            byte b = 0;
            if (!cjs.c(cjrVar)) {
                cke ckeVar2 = new cke((byte[]) (b == true ? 1 : 0));
                clq.c(ckeVar2, cjrVar);
                ckeVar = ckeVar2;
            }
            this.b = ckeVar;
        }

        @Override // defpackage.cln
        public final cjp a() {
            cjr cjrVar = this.a;
            return new cjp(cjrVar.a, cjrVar.b, cjrVar.c, cjrVar.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && d.F(this.a, ((c) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public abstract cjp a();
}
