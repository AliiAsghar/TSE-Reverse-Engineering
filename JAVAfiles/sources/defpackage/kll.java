package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kll extends kmf {
    private final kmk a;
    private final int b;
    private final int c;

    public kll(kmk kmkVar, int i, int i2) {
        if (kmkVar != null) {
            this.a = kmkVar;
            this.b = i;
            this.c = i2;
            return;
        }
        throw new NullPointerException("Null messageList");
    }

    @Override // defpackage.kmf
    public final int a() {
        return this.c;
    }

    @Override // defpackage.kmf
    public final int b() {
        return this.b;
    }

    @Override // defpackage.kmf
    public final kmk c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kmf) {
            kmf kmfVar = (kmf) obj;
            if (this.a.equals(kmfVar.c()) && this.b == kmfVar.b() && this.c == kmfVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "EditTextEvent{messageList=" + this.a.toString() + ", messageListIndex=" + this.b + ", messageIndex=" + this.c + "}";
    }
}
