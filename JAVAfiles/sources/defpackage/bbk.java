package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bbk implements doe {
    public a b;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public interface a {
        ddz a();
    }

    @Override // defpackage.doe
    public /* synthetic */ void b(cjp cjpVar) {
        throw null;
    }

    @Override // defpackage.doe
    public /* synthetic */ void c() {
        throw null;
    }

    public abstract void e();

    @Override // defpackage.doe
    public /* synthetic */ void h(doj dojVar, dob dobVar, diy diyVar, arqr arqrVar, cjp cjpVar, cjp cjpVar2) {
        throw null;
    }

    @Override // defpackage.doe
    public final void i() {
        ddz a2;
        a aVar = this.b;
        if (aVar != null && (a2 = aVar.a()) != null) {
            a2.a();
        }
    }

    public final void j(a aVar) {
        if (this.b != null) {
            aju.d("Expected textInputModifierNode to be null");
        }
        this.b = aVar;
    }

    @Override // defpackage.doe
    public final void k() {
        ddz a2;
        a aVar = this.b;
        if (aVar != null && (a2 = aVar.a()) != null) {
            a2.b();
        }
    }

    public final void l(a aVar) {
        if (this.b != aVar) {
            aju.d("Expected textInputModifierNode to be " + aVar + " but was " + this.b);
        }
        this.b = null;
    }
}
