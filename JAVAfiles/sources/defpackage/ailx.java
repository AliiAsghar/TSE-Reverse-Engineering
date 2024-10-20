package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ailx extends ailq {
    public boolean b;

    public ailx() {
        super("Contact");
        this.b = false;
    }

    private static aikn f(aikp aikpVar, String str, int i) {
        aikpVar.j(str);
        aikpVar.i(i);
        aikn aiknVar = new aikn();
        aiknVar.b = aikpVar;
        return aiknVar;
    }

    @Override // defpackage.ailq, defpackage.aimh
    public final String a() {
        if (this.b) {
            return "*";
        }
        aikn aiknVar = this.a;
        String str = "";
        if (aiknVar != null) {
            if (aiknVar.c == 1) {
                str = "".concat(aiknVar.c());
            } else {
                str = "<" + aiknVar.c() + ">";
            }
        }
        aila ailaVar = this.e;
        if (ailaVar != null && !ailaVar.h()) {
            return str + ";" + this.e.c();
        }
        return str;
    }

    @Override // defpackage.ailq
    public final void b(aikn aiknVar) {
        this.a = aiknVar;
    }

    @Override // defpackage.ailq, defpackage.aimh, defpackage.aiku
    public final /* bridge */ /* synthetic */ Object clone() {
        ailx ailxVar = new ailx();
        ailxVar.b = this.b;
        aila ailaVar = this.e;
        if (ailaVar != null) {
            ailxVar.e = (aila) ailaVar.clone();
        }
        aikn aiknVar = this.a;
        if (aiknVar != null) {
            ailxVar.a = aiknVar.clone();
        }
        return ailxVar;
    }

    public final String e() {
        return i("expires");
    }

    public ailx(aikp aikpVar, String str, int i, Optional optional, aila ailaVar) {
        super("Contact");
        this.b = false;
        this.a = f(aikpVar, str, i);
        optional.isPresent();
        aikz a = ailaVar.a("+sip.instance");
        if (a != null) {
            a.e = "<" + ((String) optional.get()) + ">";
            a.b();
        } else {
            aikz aikzVar = new aikz("+sip.instance", "<" + ((String) optional.get()) + ">");
            aikzVar.b();
            ailaVar.g(aikzVar);
        }
        this.e = ailaVar;
    }

    public ailx(aikp aikpVar, String str, int i, Optional optional, String[] strArr) {
        super("Contact");
        this.b = false;
        this.a = f(aikpVar, str, i);
        if (optional.isPresent()) {
            aikz aikzVar = new aikz("+sip.instance", "<" + ((String) optional.get()) + ">");
            aikzVar.b();
            j(aikzVar);
        }
        for (String str2 : strArr) {
            j(new aikz(str2, null));
        }
    }
}
