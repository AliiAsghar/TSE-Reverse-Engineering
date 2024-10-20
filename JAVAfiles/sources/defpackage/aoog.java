package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoog extends aood {
    public final aopi a = new aopi(aopi.a, false);

    public final aoog d(String str) {
        return (aoog) this.a.get(str);
    }

    public final void e(String str, aood aoodVar) {
        this.a.put(str, aoodVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof aoog) && ((aoog) obj).a.equals(this.a)) {
            return true;
        }
        return false;
    }

    public final void f(String str, String str2) {
        aood aooiVar;
        if (str2 == null) {
            aooiVar = aoof.a;
        } else {
            aooiVar = new aooi(str2);
        }
        e(str, aooiVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
