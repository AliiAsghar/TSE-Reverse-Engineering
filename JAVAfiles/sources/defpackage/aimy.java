package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aimy extends ailq {
    public aimy() {
        super("To");
    }

    @Override // defpackage.ailq, defpackage.aimh
    public final String a() {
        String str;
        aikn aiknVar = this.a;
        int i = aiknVar.c;
        String c = aiknVar.c();
        int i2 = this.a.c;
        if (i != 1) {
            str = "<";
        } else {
            str = "";
        }
        String concat = str.concat(c);
        if (i2 != 1) {
            concat = concat.concat(">");
        }
        if (!this.e.h()) {
            return concat + ";" + this.e.c();
        }
        return concat;
    }

    public final void e() {
        this.e.i("tag");
    }

    @Override // defpackage.ailq, defpackage.aimm, defpackage.aimh
    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj.getClass().equals(getClass())) {
                return super.equals(obj);
            }
            return false;
        }
        return false;
    }

    public final void f(String str) {
        k("tag", str);
    }

    @Override // defpackage.ailq, defpackage.aimm, defpackage.aimh
    public final int hashCode() {
        return 89076;
    }
}
