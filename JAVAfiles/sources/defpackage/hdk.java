package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdk extends hig {
    final /* synthetic */ hif a;
    final /* synthetic */ hig b;
    final /* synthetic */ hem c;

    public hdk(hif hifVar, hig higVar, hem hemVar) {
        this.a = hifVar;
        this.b = higVar;
        this.c = hemVar;
    }

    @Override // defpackage.hig
    public final /* bridge */ /* synthetic */ Object a(hif hifVar) {
        Object obj;
        this.a.a(hifVar.a, hifVar.b, ((hem) hifVar.c).a, ((hem) hifVar.d).a, hifVar.e, hifVar.f, hifVar.g);
        String str = (String) this.b.a(this.a);
        if (hifVar.f == 1.0f) {
            obj = hifVar.d;
        } else {
            obj = hifVar.c;
        }
        hem hemVar = (hem) obj;
        this.c.a(str, hemVar.b, hemVar.c, hemVar.m, hemVar.d, hemVar.e, hemVar.f, hemVar.g, hemVar.h, hemVar.i, hemVar.j, hemVar.k, hemVar.l);
        return this.c;
    }
}
