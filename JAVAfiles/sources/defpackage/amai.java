package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amai implements Iterable {
    public final Object a;
    public final Object b;

    public amai(Object obj, Object obj2) {
        this.a = obj;
        obj2.getClass();
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof amai)) {
            return false;
        }
        amai amaiVar = (amai) obj;
        if (this.a.equals(amaiVar.a) && this.b.equals(amaiVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new alqp(new Object[]{this.a, this.b});
    }

    public final String toString() {
        Object obj = this.b;
        return "<" + this.a.toString() + " -> " + obj.toString() + ">";
    }
}
