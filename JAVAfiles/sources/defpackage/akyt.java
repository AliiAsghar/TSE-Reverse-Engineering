package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akyt {
    public final String a;
    public final Function b;
    public final akys c;

    public akyt() {
        throw null;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        if (obj instanceof akyt) {
            akyt akytVar = (akyt) obj;
            if (this.a.equals(akytVar.a)) {
                equals = this.b.equals(akytVar.b);
                if (equals && this.c.equals(akytVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        hashCode = this.b.hashCode();
        return (((hashCode2 * 1000003) ^ hashCode) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        akys akysVar = this.c;
        return "ParamBinding{name=" + this.a + ", paramGetter=" + this.b.toString() + ", argumentSetter=" + akysVar.toString() + "}";
    }

    public akyt(String str, Function function, akys akysVar) {
        this.a = str;
        this.b = function;
        this.c = akysVar;
    }
}
