package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hcy extends hig {
    final /* synthetic */ hig a;

    public hcy(hig higVar) {
        this.a = higVar;
    }

    @Override // defpackage.hig
    public final /* bridge */ /* synthetic */ Object a(hif hifVar) {
        Float f = (Float) this.a.a(hifVar);
        if (f == null) {
            return null;
        }
        return Float.valueOf(f.floatValue() * 2.55f);
    }
}
