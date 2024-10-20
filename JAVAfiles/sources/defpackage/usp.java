package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class usp {
    public final arwl a;
    public final int b;
    public final gvf c;

    public usp(int i, gvf gvfVar, arwl arwlVar) {
        this.b = i;
        this.c = gvfVar;
        this.a = arwlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usp)) {
            return false;
        }
        usp uspVar = (usp) obj;
        if (this.b == uspVar.b && d.F(this.c, uspVar.c) && d.F(this.a, uspVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.b;
        a.bm(i);
        int hashCode2 = (i * 31) + this.c.hashCode();
        arwl arwlVar = this.a;
        if (arwlVar == null) {
            hashCode = 0;
        } else {
            hashCode = arwlVar.hashCode();
        }
        return (hashCode2 * 31) + hashCode;
    }

    public final String toString() {
        return "RunResult(finalStatus=" + ((Object) ush.a(this.b)) + ", workerResult=" + this.c + ", followUpWork=" + this.a + ")";
    }

    public usp(int i, gvf gvfVar) {
        this(i, gvfVar, null);
    }
}
