package defpackage;

import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ebo {
    final String a;
    final String b;
    final List c;

    public ebo(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebo)) {
            return false;
        }
        ebo eboVar = (ebo) obj;
        if (Objects.equals(this.a, eboVar.a) && Objects.equals(this.b, eboVar.b) && Objects.equals(this.c, eboVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
