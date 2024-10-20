package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aimk extends aiku implements Cloneable {
    protected String a;
    protected String b;

    @Override // defpackage.aiku
    public final String c() {
        return this.a + "/" + this.b;
    }

    @Override // defpackage.aiku
    public final Object clone() {
        aimk aimkVar = new aimk();
        String str = this.a;
        if (str != null) {
            aimkVar.a = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            aimkVar.b = str2;
        }
        return aimkVar;
    }
}
