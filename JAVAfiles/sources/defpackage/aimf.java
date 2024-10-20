package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aimf extends aimm {
    public aimf() {
    }

    @Override // defpackage.aimh
    public final String a() {
        aila ailaVar = this.e;
        if (ailaVar != null && !ailaVar.h()) {
            return this.d + ";" + this.e.c();
        }
        return albo.ag(this.d);
    }

    @Override // defpackage.aimm, defpackage.aimh
    public final aila d() {
        return this.e;
    }

    public aimf(String str, String str2) {
        super(str);
        this.d = str2;
    }
}
