package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zqn {
    final int a;
    final int b;
    public final int c;
    Integer d;
    public String e;

    public zqn(int i, int i2, int i3, Integer num) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqn)) {
            return false;
        }
        zqn zqnVar = (zqn) obj;
        if (this.a == zqnVar.a && this.b == zqnVar.b && this.c == zqnVar.c && Objects.equals(this.d, zqnVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d);
    }

    public zqn(int i, int i2, int i3) {
        this(i, i2, i3, null);
    }
}
