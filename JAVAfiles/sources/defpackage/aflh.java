package defpackage;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aflh implements TextWatcher {
    public boolean b;
    public final afmd d;
    private final arwe e;
    private final arqr f;
    private final arqr g;
    private int h;
    private int i;
    public List a = new ArrayList();
    public arwe c = a();
    private final List j = new ArrayList();
    private final List k = new ArrayList();

    public aflh(arwe arweVar, afmd afmdVar, arqr arqrVar, arqr arqrVar2) {
        this.e = arweVar;
        this.d = afmdVar;
        this.f = arqrVar;
        this.g = arqrVar2;
    }

    private final void d(CharSequence charSequence, arqv arqvVar) {
        arrn.J(this.c, null, null, new aflg(this, charSequence.toString(), arqvVar, null), 3);
    }

    public final arwe a() {
        return arwi.e(this.e.b().plus(new arxo(null)));
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        editable.getClass();
        int i = this.i;
        int i2 = this.h;
        if (i > 0) {
            int i3 = i + i2;
            afla[] aflaVarArr = (afla[]) editable.getSpans(i2, i3, afla.class);
            aflaVarArr.getClass();
            if (aflaVarArr.length == 0) {
                CharSequence d = ejx.b().d(editable, i2, i3, Integer.MAX_VALUE, 1);
                d.getClass();
                Iterator a = arrj.a(((Spannable) d).getSpans(i2, i3, ekb.class));
                while (a.hasNext()) {
                    Object obj = (ekb) a.next();
                    int spanStart = editable.getSpanStart(obj);
                    CharSequence subSequence = editable.subSequence(spanStart, editable.getSpanEnd(obj));
                    if (!Collection.EL.removeIf(this.k, new zko(new mgc(spanStart, subSequence, 10), 19))) {
                        d(subSequence, new afib(this, 3, (short[]) null));
                    }
                }
            } else {
                Iterator a2 = arrj.a(aflaVarArr);
                while (a2.hasNext()) {
                    afla aflaVar = (afla) a2.next();
                    if (!Collection.EL.removeIf(this.j, new zko(new mgc(editable.getSpanStart(aflaVar), aflaVar.a, 9), 20))) {
                        b(this.a, aflaVar.a);
                    }
                }
            }
        }
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            c(this.a, (afnr) ((arny) it.next()).b);
        }
        this.j.clear();
        Iterator it2 = this.k.iterator();
        while (it2.hasNext()) {
            d((CharSequence) ((arny) it2.next()).b, new afib(this, 2, (char[]) null));
        }
        this.k.clear();
        this.b = false;
    }

    public final void b(List list, afnr afnrVar) {
        synchronized (list) {
            list.add(afnrVar);
        }
        this.f.a(afnrVar);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Spannable spannable;
        Object obj;
        charSequence.getClass();
        this.j.clear();
        this.k.clear();
        if (charSequence instanceof Spannable) {
            spannable = (Spannable) charSequence;
        } else {
            spannable = null;
        }
        if (spannable != null && i2 > 0 && !this.b) {
            int i4 = i2 + i;
            Iterator a = arrj.a(spannable.getSpans(i, i4, afla.class));
            while (a.hasNext()) {
                afla aflaVar = (afla) a.next();
                this.j.add(new arny(spannable.getSpanStart(aflaVar), aflaVar.a));
            }
            Iterator a2 = arrj.a(spannable.getSpans(i, i4, ekb.class));
            while (a2.hasNext()) {
                ekb ekbVar = (ekb) a2.next();
                int spanStart = spannable.getSpanStart(ekbVar);
                Iterator it = this.j.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((arny) obj).a == spanStart) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (obj == null) {
                    this.k.add(new arny(spanStart, spannable.subSequence(spanStart, spannable.getSpanEnd(ekbVar))));
                }
            }
        }
    }

    public final void c(List list, afnr afnrVar) {
        synchronized (list) {
            list.remove(afnrVar);
        }
        this.g.a(afnrVar);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
        this.h = i;
        this.i = i3;
    }
}
