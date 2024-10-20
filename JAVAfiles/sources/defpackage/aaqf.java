package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaqf {
    public final aaqe a;
    public final int b;

    public aaqf(aaqe aaqeVar, int i) {
        this.a = aaqeVar;
        this.b = i;
    }

    public final void a(aaqi aaqiVar) {
        this.a.e(aaqiVar, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aaqf aaqfVar = (aaqf) obj;
            if (this.b == aaqfVar.b && Objects.equals(this.a, aaqfVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b));
    }
}
