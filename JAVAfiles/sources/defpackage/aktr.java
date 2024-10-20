package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aktr {
    public final akry a;

    private aktr(akry akryVar) {
        this.a = akryVar;
    }

    public static aktr b() {
        return new aktr(akqj.e());
    }

    public static aktr c() {
        return new aktr(akqj.j);
    }

    public static Runnable d(aktr aktrVar, Runnable runnable) {
        akry akryVar = aktrVar.a;
        akryVar.getClass();
        long j = akto.a;
        akryVar.getClass();
        return new aktj(akryVar, runnable);
    }

    public static void e(aktr aktrVar) {
        akqj.g(aktrVar.a);
    }

    public static aktr g() {
        return new aktr(akqj.c());
    }

    public final aksa a() {
        akry akryVar = this.a;
        akry c = akqj.c();
        akqj.g(akryVar);
        return new akpq((Object) c, 6);
    }

    public final boolean f() {
        if (this.a == null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        akry akryVar = this.a;
        if (akryVar == null) {
            return "null ref";
        }
        return akryVar.toString();
    }
}
