package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class arvg extends arxw implements arxm, arpe, arwe, arwl {
    public final arpi a;

    public arvg(arpi arpiVar, boolean z) {
        super(z);
        N((arxm) arpiVar.get(arxm.c));
        this.a = arpiVar.plus(this);
    }

    @Override // defpackage.arwe
    public final arpi b() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.arxw
    public final String g() {
        return String.valueOf(arwi.a(this)).concat(" was cancelled");
    }

    @Override // defpackage.arxw
    public String h() {
        String str;
        String str2 = null;
        if (arwh.a) {
            arpi arpiVar = this.a;
            arwc arwcVar = (arwc) arpiVar.get(arwc.b);
            if (arwcVar != null) {
                arwd arwdVar = (arwd) arpiVar.get(arwd.b);
                if (arwdVar != null) {
                    str = arwdVar.a;
                } else {
                    str = "coroutine";
                }
                str2 = str + "#" + arwcVar.a;
            }
        }
        if (str2 == null) {
            return arwi.a(this);
        }
        return "\"" + str2 + "\":" + arwi.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void hh(Object obj) {
        hl(obj);
    }

    @Override // defpackage.arxw
    public final void hi(Throwable th) {
        arro.m(this.a, th);
    }

    @Override // defpackage.arxw
    protected final void hj(Object obj) {
        if (obj instanceof arvx) {
            arvx arvxVar = (arvx) obj;
            k(arvxVar.b, arvxVar.c.b());
        } else {
            l(obj);
        }
    }

    @Override // defpackage.arwl
    public final Object n(arpe arpeVar) {
        return hk(arpeVar);
    }

    @Override // defpackage.arwl
    public final Object o() {
        return F();
    }

    @Override // defpackage.arwl
    public final asqe p() {
        return W();
    }

    @Override // defpackage.arpe
    public final arpi u() {
        return this.a;
    }

    @Override // defpackage.arpe
    public final void w(Object obj) {
        Object H = H(arro.o(obj));
        if (H == arxx.b) {
            return;
        }
        hh(H);
    }

    protected void l(Object obj) {
    }

    protected void k(Throwable th, boolean z) {
    }
}
