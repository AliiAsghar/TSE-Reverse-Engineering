package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class atky {
    public final int e;

    public atky(int i) {
        int i2 = atmx.j;
        this.e = i;
    }

    public abstract String a();

    public abstract void b(atkt atktVar);

    public abstract void c(atkv atkvVar);

    final byte[] d() {
        atkv atkvVar = new atkv();
        c(atkvVar);
        return atkvVar.h();
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof atky)) {
            atky atkyVar = (atky) obj;
            if (this.e == atkyVar.e) {
                return Arrays.equals(d(), atkyVar.d());
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        for (byte b : d()) {
            i += (i << 3) + (b & 255);
        }
        return i;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("{");
        stringBuffer.append(atkx.a.c(this.e));
        stringBuffer.append(": ");
        stringBuffer.append(a());
        stringBuffer.append("}");
        return stringBuffer.toString();
    }
}
