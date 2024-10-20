package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ailu extends aimh implements Cloneable {
    protected ailv a;

    public ailu() {
        super("Call-Id");
    }

    @Override // defpackage.aimh
    public final String a() {
        ailv ailvVar = this.a;
        if (ailvVar == null) {
            return "";
        }
        return ailvVar.c();
    }

    public final void b(String str) {
        this.a = new ailv(str);
    }

    @Override // defpackage.aimh, defpackage.aiku
    public final String c() {
        return this.c + ": " + this.a.c() + VCardBuilder.VCARD_END_OF_LINE;
    }

    @Override // defpackage.aimh, defpackage.aiku
    public final Object clone() {
        ailu ailuVar = new ailu();
        ailv ailvVar = this.a;
        if (ailvVar != null) {
            ailuVar.a = (ailv) ailvVar.clone();
        }
        return ailuVar;
    }

    @Override // defpackage.aimh
    public final aila d() {
        return null;
    }

    @Override // defpackage.aimh
    public final boolean equals(Object obj) {
        if (!(obj instanceof ailu)) {
            return false;
        }
        return this.a.equals(((ailu) obj).a);
    }

    @Override // defpackage.aimh
    public final int hashCode() {
        return 11127650;
    }
}
