package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agxe {
    public static final agxe a = new agxe();
    public static final agxe b = new agxe(null);
    public final Integer c = null;
    public final boolean d = false;

    private agxe() {
    }

    public final boolean a() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        agxe agxeVar = (agxe) obj;
        if (!d.B(this.c, agxeVar.c) || this.d != agxeVar.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.c;
        int i = Integer.MIN_VALUE;
        if (num == null) {
            return Integer.MIN_VALUE;
        }
        if (true != this.d) {
            i = 0;
        }
        num.intValue();
        return Integer.MAX_VALUE ^ i;
    }

    public final String toString() {
        if (equals(a)) {
            return "Disabled";
        }
        algv aj = albo.aj(this);
        aj.b("metaVersion", this.c);
        aj.h("replaceAll", this.d);
        return aj.toString();
    }

    public agxe(byte[] bArr) {
    }
}
