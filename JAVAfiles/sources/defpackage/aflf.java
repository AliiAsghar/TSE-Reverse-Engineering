package defpackage;

import android.widget.EditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aflf implements aflk, afll {
    public final afke a;
    public final EditText b;
    public final Set c = new LinkedHashSet();
    public final aflh d;
    private final /* synthetic */ afld e;
    private final afli f;
    private final afjy g;
    private final agcp h;
    private final aday i;

    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [armf, java.lang.Object] */
    public aflf(afjy afjyVar, agcp agcpVar, aday adayVar, afke afkeVar, EditText editText) {
        afli afliVar;
        this.e = new afld(editText);
        this.g = afjyVar;
        this.h = agcpVar;
        this.i = adayVar;
        this.a = afkeVar;
        this.b = editText;
        if (afjyVar != null) {
            arwe arweVar = (arwe) agcpVar.a.b();
            arweVar.getClass();
            anca ancaVar = (anca) agcpVar.b.b();
            ancaVar.getClass();
            afmq afmqVar = (afmq) agcpVar.c.b();
            afmqVar.getClass();
            afliVar = new afli(arweVar, ancaVar, afmqVar, afjyVar);
        } else {
            afliVar = null;
        }
        this.f = afliVar;
        ncd ncdVar = new ncd((Object) this, 15, (short[][][]) null);
        ncd ncdVar2 = new ncd((Object) this, 16, (int[][][]) null);
        arwe arweVar2 = (arwe) adayVar.a.b();
        arweVar2.getClass();
        afmd afmdVar = (afmd) adayVar.b.b();
        afmdVar.getClass();
        this.d = new aflh(arweVar2, afmdVar, ncdVar, ncdVar2);
        if (afliVar != null) {
            i(afliVar);
        }
        ejx b = ejx.b();
        b.getClass();
        aezb aezbVar = new aezb(this, 14);
        int a = b.a();
        if (a != 0) {
            if (a != 1) {
                if (a != 3) {
                    return;
                }
            } else {
                aezbVar.a(b);
                return;
            }
        }
        b.i(new afns(aezbVar, b));
    }

    @Override // defpackage.aflb
    public final CharSequence a() {
        return this.e.a();
    }

    @Override // defpackage.aflb
    public final void b(CharSequence charSequence) {
        this.e.b(charSequence);
    }

    @Override // defpackage.aflb
    public final void c(CharSequence charSequence) {
        this.e.c(charSequence);
    }

    @Override // defpackage.aflb
    public final void d() {
        this.e.d();
    }

    @Override // defpackage.aflb
    public final void e() {
        this.e.a.getText().clear();
    }

    @Override // defpackage.aflb
    public final void f(afnr afnrVar) {
        this.e.f(afnrVar);
    }

    @Override // defpackage.aflb
    public final void g() {
        List ax;
        aflh aflhVar = this.d;
        synchronized (aflhVar.a) {
            ax = aqjn.ax(aflhVar.a);
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((afkr) it.next()).c(ax);
        }
        aflh aflhVar2 = this.d;
        aflhVar2.b = true;
        arwi.g(aflhVar2.c, null);
        aflhVar2.c = aflhVar2.a();
        aflhVar2.a = new ArrayList();
    }

    @Override // defpackage.aflb
    public final void h(CharSequence charSequence) {
        this.e.h(charSequence);
    }

    @Override // defpackage.afle
    public final void i(afkr afkrVar) {
        this.c.add(afkrVar);
    }

    @Override // defpackage.aflk
    public final void j(aflj afljVar) {
        afld afldVar = this.e;
        if (afldVar.c == null) {
            EditText editText = afldVar.a;
            aflc aflcVar = new aflc(afldVar, 0);
            editText.addTextChangedListener(aflcVar);
            afldVar.c = aflcVar;
        }
        afldVar.b.add(afljVar);
    }

    @Override // defpackage.aflk
    public final void k(aflj afljVar) {
        afld afldVar = this.e;
        afldVar.b.remove(afljVar);
        if (afldVar.b.isEmpty()) {
            afldVar.a.removeTextChangedListener(afldVar.c);
            afldVar.c = null;
        }
    }

    @Override // defpackage.afle
    public final void l(afkr afkrVar) {
        this.c.remove(afkrVar);
    }
}
