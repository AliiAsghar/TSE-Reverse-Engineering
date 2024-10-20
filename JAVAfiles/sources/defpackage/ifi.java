package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifi extends arpw implements arqv {
    int a;
    /* synthetic */ boolean b;
    final /* synthetic */ bhv c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifi(bhv bhvVar, String str, arpe arpeVar) {
        super(2, arpeVar);
        this.c = bhvVar;
        this.d = str;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((ifi) c(bool, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0 && this.b) {
            bhv bhvVar = this.c;
            String str = this.d;
            this.a = 1;
            if (bhvVar.b(str, bhn.a, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        ifi ifiVar = new ifi(this.c, this.d, arpeVar);
        ifiVar.b = ((Boolean) obj).booleanValue();
        return ifiVar;
    }
}
