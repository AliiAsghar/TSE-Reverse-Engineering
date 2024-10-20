package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apxx implements apxw, apwt {
    public final Object a;

    private apxx(Object obj) {
        this.a = obj;
    }

    public static apxw a(Object obj) {
        obj.getClass();
        return new apxx(obj);
    }

    @Override // defpackage.armf, defpackage.arme
    public final Object b() {
        return this.a;
    }
}
