package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acyq {
    acyh a;
    acyq b;
    boolean c;

    public final String toString() {
        String a;
        String a2 = this.a.a();
        boolean z = this.c;
        acyq acyqVar = this.b;
        if (acyqVar == null) {
            a = "null";
        } else {
            a = acyqVar.a.a();
        }
        return "state=" + a2 + ",active=" + z + ",parent=" + a;
    }
}
