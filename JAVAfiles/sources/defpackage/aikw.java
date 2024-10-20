package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aikw implements Cloneable {
    public aikv a;
    public int b;

    public aikw() {
        this.a = null;
        this.b = -1;
    }

    public final String a() {
        String str;
        if (this.a == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        aikv aikvVar = this.a;
        if (aikvVar.b == 3 && !aikv.a(aikvVar.a)) {
            str = "[" + aikvVar.a + "]";
        } else {
            str = aikvVar.a;
        }
        sb.append(str);
        if (this.b > 0) {
            sb.append(':');
            sb.append(this.b);
        }
        return sb.toString();
    }

    public final Object clone() {
        return new aikw(this);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof aikw)) {
            return false;
        }
        aikw aikwVar = (aikw) obj;
        if (this.b != aikwVar.b) {
            return false;
        }
        aikv aikvVar = this.a;
        if (aikvVar == null && aikwVar.a != null) {
            return false;
        }
        if (aikvVar != null && !aikvVar.equals(aikwVar.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.b * 37;
        aikv aikvVar = this.a;
        aikvVar.getClass();
        return i + aikvVar.hashCode();
    }

    public aikw(aikw aikwVar) {
        this.a = null;
        this.b = -1;
        this.a = aikwVar.a;
        this.b = aikwVar.b;
    }
}
