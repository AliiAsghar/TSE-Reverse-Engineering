package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ailr extends aimm {
    public String a;

    public ailr(String str) {
        super(str);
        this.e.b = ",";
        this.a = "Digest";
    }

    @Override // defpackage.aimh
    public final String a() {
        return this.a + " " + this.e.c();
    }

    @Override // defpackage.aimh, defpackage.aiku
    public final Object clone() {
        try {
            ailr ailrVar = (ailr) getClass().newInstance();
            String str = this.a;
            if (str != null) {
                ailrVar.a = str;
            }
            aila ailaVar = this.e;
            if (ailaVar != null) {
                ailrVar.e = (aila) ailaVar.clone();
            }
            return ailrVar;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.aimm, defpackage.aimh
    public final boolean equals(Object obj) {
        if (!(obj instanceof ailr)) {
            return false;
        }
        ailr ailrVar = (ailr) obj;
        if (!this.a.equalsIgnoreCase(ailrVar.a) || !this.e.equals(ailrVar.e)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.aimm, defpackage.aimh
    public final int hashCode() {
        return 34765;
    }
}
