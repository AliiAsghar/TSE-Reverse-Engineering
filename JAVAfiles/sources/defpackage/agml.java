package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class agml extends agpy {
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: Access modifiers changed from: protected */
    public agml(String str) {
        String str2;
        this.d = str;
        int indexOf = str.indexOf(".");
        if (indexOf >= 0) {
            this.f = str.substring(indexOf + 1);
            str2 = str.substring(0, indexOf);
        } else {
            this.f = str;
            str2 = null;
        }
        this.e = str2;
    }

    @Override // defpackage.agpy
    public void e(adwp adwpVar) {
        adwpVar.o(this.d, null);
    }

    public final String f(agox agoxVar) {
        String str = this.e;
        if (str == null) {
            return this.f;
        }
        Object apply = agoxVar.apply(str);
        return ((String) apply) + "." + this.f;
    }
}
