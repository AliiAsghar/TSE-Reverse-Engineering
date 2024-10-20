package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agan extends arsm {
    final /* synthetic */ agap a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agan(Object obj, agap agapVar) {
        super(obj);
        this.a = agapVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        afwv afwvVar = (afwv) obj2;
        afwv afwvVar2 = (afwv) obj;
        if (afwvVar2 instanceof agal) {
            ((agal) afwvVar2).a.b();
        }
        if (afwvVar instanceof agal) {
            ((agal) afwvVar).a.a(this.a);
        }
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
