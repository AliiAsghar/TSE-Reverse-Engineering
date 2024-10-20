package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pyy {
    public final pza a;
    public final arwl b;
    public final aksr c;

    public pyy(pza pzaVar, aksr aksrVar, arwl arwlVar) {
        this.a = pzaVar;
        this.c = aksrVar;
        this.b = arwlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyy)) {
            return false;
        }
        pyy pyyVar = (pyy) obj;
        if (d.F(this.a, pyyVar.a) && d.F(this.c, pyyVar.c) && d.F(this.b, pyyVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PipelineInfo(entryPoint=" + this.a + ", pipelineContext=" + this.c + ", pipelineExecution=" + this.b + ")";
    }
}
