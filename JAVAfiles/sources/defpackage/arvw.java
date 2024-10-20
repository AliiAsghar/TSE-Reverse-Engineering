package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arvw {
    public final Object a;
    public final arvn b;
    public final arqw c;
    public final Object d;
    public final Throwable e;

    public arvw(Object obj, arvn arvnVar, arqw arqwVar, Throwable th) {
        this.a = obj;
        this.b = arvnVar;
        this.c = arqwVar;
        this.d = null;
        this.e = th;
    }

    public static /* synthetic */ arvw b(arvw arvwVar, arvn arvnVar, Throwable th, int i) {
        Object obj;
        arqw arqwVar = null;
        if ((i & 1) != 0) {
            obj = arvwVar.a;
        } else {
            obj = null;
        }
        if ((i & 2) != 0) {
            arvnVar = arvwVar.b;
        }
        if ((i & 4) != 0) {
            arqwVar = arvwVar.c;
        }
        if ((i & 8) != 0) {
            Object obj2 = arvwVar.d;
        }
        if ((i & 16) != 0) {
            th = arvwVar.e;
        }
        return new arvw(obj, arvnVar, arqwVar, th);
    }

    public final boolean a() {
        if (this.e != null) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arvw)) {
            return false;
        }
        arvw arvwVar = (arvw) obj;
        if (!d.F(this.a, arvwVar.a) || !d.F(this.b, arvwVar.b) || !d.F(this.c, arvwVar.c)) {
            return false;
        }
        Object obj2 = arvwVar.d;
        if (d.F(null, null) && d.F(this.e, arvwVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Object obj = this.a;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        arvn arvnVar = this.b;
        if (arvnVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = arvnVar.hashCode();
        }
        int i2 = hashCode * 31;
        arqw arqwVar = this.c;
        if (arqwVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = arqwVar.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Throwable th = this.e;
        if (th != null) {
            i = th.hashCode();
        }
        return ((i3 + hashCode3) * 961) + i;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=null, cancelCause=" + this.e + ")";
    }

    public /* synthetic */ arvw(Object obj, arvn arvnVar, arqw arqwVar, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : arvnVar, (i & 4) != 0 ? null : arqwVar, (i & 16) != 0 ? null : th);
    }
}
