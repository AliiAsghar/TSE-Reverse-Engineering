package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hlt implements Cloneable {
    public hya a = hxx.b;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hlt clone() {
        try {
            return (hlt) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof hlt) {
            return d.F(this.a, ((hlt) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        hya hyaVar = this.a;
        if (hyaVar != null) {
            return hyaVar.hashCode();
        }
        return 0;
    }
}
