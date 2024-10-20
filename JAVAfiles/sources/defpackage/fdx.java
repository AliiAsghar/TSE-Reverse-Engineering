package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdx {
    public final Object a;
    public final Object b;

    public fdx(Intent intent, Bundle bundle) {
        this.b = intent;
        this.a = bundle;
    }

    public static final boolean e(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            return true;
        }
        return false;
    }

    public static final KeyListener f(KeyListener keyListener) {
        if (e(keyListener) && !(keyListener instanceof eln)) {
            if (keyListener == null) {
                return null;
            }
            if (!(keyListener instanceof NumberKeyListener)) {
                return new eln(keyListener);
            }
            return keyListener;
        }
        return keyListener;
    }

    public final void a(ezh ezhVar) {
        ezhVar.a();
        Object obj = this.a;
        if (obj != null) {
            ((Handler) obj).post(new ewq(this, ezhVar, 15, null));
        }
    }

    public final void b(Context context, Uri uri) {
        ((Intent) this.b).setData(uri);
        context.startActivity((Intent) this.b, (Bundle) this.a);
    }

    public final InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        if (!(inputConnection instanceof elk)) {
            return new elk((TextView) ((fvq) this.a).a, inputConnection, editorInfo);
        }
        return inputConnection;
    }

    public final void d(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, gc.j, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            elr elrVar = (elr) ((fvq) this.a).b;
            if (elrVar.b != z) {
                if (elrVar.c != null) {
                    ekt c = ekt.c();
                    dyp dypVar = elrVar.c;
                    d.aC(dypVar, "initCallback cannot be null");
                    c.c.writeLock().lock();
                    try {
                        ArrayList arrayList = new ArrayList();
                        tn tnVar = new tn((to) c.d);
                        while (tnVar.hasNext()) {
                            fvq fvqVar = (fvq) tnVar.next();
                            if (fvqVar.b == dypVar) {
                                arrayList.add(fvqVar);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            c.d.remove((fvq) it.next());
                        }
                    } finally {
                        c.c.writeLock().unlock();
                    }
                }
                elrVar.b = z;
                if (z) {
                    elr.a(elrVar.a, ekt.c().b());
                }
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void g(cg cgVar, Bundle bundle, boolean z) {
        cgVar.getClass();
        cg cgVar2 = ((da) this.a).p;
        if (cgVar2 != null) {
            cgVar2.H().y.g(cgVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            efu efuVar = (efu) it.next();
            if (!z) {
                Object obj = efuVar.a;
            }
        }
    }

    public final void h(cg cgVar, boolean z) {
        cgVar.getClass();
        da daVar = (da) this.a;
        Context context = daVar.n.c;
        cg cgVar2 = daVar.p;
        if (cgVar2 != null) {
            cgVar2.H().y.h(cgVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            efu efuVar = (efu) it.next();
            if (!z) {
                Object obj = efuVar.a;
            }
        }
    }

    public final void i(cg cgVar, Bundle bundle, boolean z) {
        cgVar.getClass();
        cg cgVar2 = ((da) this.a).p;
        if (cgVar2 != null) {
            cgVar2.H().y.i(cgVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            efu efuVar = (efu) it.next();
            if (!z) {
                Object obj = efuVar.a;
            }
        }
    }

    public final void j(cg cgVar, boolean z) {
        cgVar.getClass();
        cg cgVar2 = ((da) this.a).p;
        if (cgVar2 != null) {
            cgVar2.H().y.j(cgVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            efu efuVar = (efu) it.next();
            if (!z) {
                Object obj = efuVar.a;
            }
        }
    }

    public final void k(cg cgVar, boolean z) {
        cgVar.getClass();
        cg cgVar2 = ((da) this.a).p;
        if (cgVar2 != null) {
            cgVar2.H().y.k(cgVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            efu efuVar = (efu) it.next();
            if (!z) {
                Object obj = efuVar.a;
            }
        }
    }

    public final void l(cg cgVar, boolean z) {
        cgVar.getClass();
        cg cgVar2 = ((da) this.a).p;
        if (cgVar2 != null) {
            cgVar2.H().y.l(cgVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            efu efuVar = (efu) it.next();
            if (!z) {
                Object obj = efuVar.a;
            }
        }
    }

    public final void m(cg cgVar, boolean z) {
        cgVar.getClass();
        da daVar = (da) this.a;
        Context context = daVar.n.c;
        cg cgVar2 = daVar.p;
        if (cgVar2 != null) {
            cgVar2.H().y.m(cgVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            efu efuVar = (efu) it.next();
            if (!z) {
                Object obj = efuVar.a;
            }
        }
    }

    public final void n(cg cgVar, Bundle bundle, boolean z) {
        cgVar.getClass();
        cg cgVar2 = ((da) this.a).p;
        if (cgVar2 != null) {
            cgVar2.H().y.n(cgVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            efu efuVar = (efu) it.next();
            if (!z) {
                Object obj = efuVar.a;
            }
        }
    }

    public final void o(cg cgVar, boolean z) {
        cgVar.getClass();
        cg cgVar2 = ((da) this.a).p;
        if (cgVar2 != null) {
            cgVar2.H().y.o(cgVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            efu efuVar = (efu) it.next();
            if (!z) {
                Object obj = efuVar.a;
            }
        }
    }

    public final void p(cg cgVar, Bundle bundle, boolean z) {
        cgVar.getClass();
        cg cgVar2 = ((da) this.a).p;
        if (cgVar2 != null) {
            cgVar2.H().y.p(cgVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            efu efuVar = (efu) it.next();
            if (!z) {
                Object obj = efuVar.a;
            }
        }
    }

    public final void q(cg cgVar, boolean z) {
        cgVar.getClass();
        cg cgVar2 = ((da) this.a).p;
        if (cgVar2 != null) {
            cgVar2.H().y.q(cgVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            efu efuVar = (efu) it.next();
            if (!z) {
                Object obj = efuVar.a;
            }
        }
    }

    public final void r(cg cgVar, boolean z) {
        cgVar.getClass();
        cg cgVar2 = ((da) this.a).p;
        if (cgVar2 != null) {
            cgVar2.H().y.r(cgVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            efu efuVar = (efu) it.next();
            if (!z) {
                Object obj = efuVar.a;
            }
        }
    }

    public final void s(cg cgVar, View view, Bundle bundle, boolean z) {
        cgVar.getClass();
        view.getClass();
        cg cgVar2 = ((da) this.a).p;
        if (cgVar2 != null) {
            cgVar2.H().y.s(cgVar, view, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            efu efuVar = (efu) it.next();
            if (!z) {
                Object obj = efuVar.a;
                Object obj2 = this.a;
                cv cvVar = (cv) obj;
                if (cgVar == cvVar.a) {
                    fdx fdxVar = ((da) obj2).y;
                    synchronized (fdxVar.b) {
                        int size = ((CopyOnWriteArrayList) fdxVar.b).size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            if (((efu) ((CopyOnWriteArrayList) fdxVar.b).get(i)).a == obj) {
                                ((CopyOnWriteArrayList) fdxVar.b).remove(i);
                                break;
                            }
                            i++;
                        }
                    }
                    gnt.K(view, cvVar.b);
                } else {
                    continue;
                }
            }
        }
    }

    public final void t(cg cgVar, boolean z) {
        cgVar.getClass();
        cg cgVar2 = ((da) this.a).p;
        if (cgVar2 != null) {
            cgVar2.H().y.t(cgVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            efu efuVar = (efu) it.next();
            if (!z) {
                Object obj = efuVar.a;
            }
        }
    }

    public fdx(Handler handler, faa faaVar) {
        this.a = faaVar == null ? null : handler;
        this.b = faaVar;
    }

    public fdx(Handler handler, fdq fdqVar) {
        this.b = handler;
        this.a = fdqVar;
    }

    public fdx(Animation animation) {
        this.b = animation;
        this.a = null;
    }

    public fdx(dva dvaVar, int i) {
        this.b = dvaVar;
        this.a = d.j(i);
    }

    public fdx(dva dvaVar, int i, byte[] bArr) {
        this.b = dvaVar;
        this.a = d.i(i);
    }

    public fdx(Executor executor, hd hdVar) {
        this.a = executor;
        this.b = hdVar;
    }

    public fdx(byte[] bArr, String str) {
        this.a = bArr;
        this.b = str;
    }

    public fdx(Animator animator) {
        this.b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.a = animatorSet;
        animatorSet.play(animator);
    }

    public fdx(EditText editText) {
        this.b = editText;
        this.a = new fvq(editText);
    }

    public fdx(da daVar) {
        this.a = daVar;
        this.b = new CopyOnWriteArrayList();
    }

    public fdx(List list, int[] iArr, byte[] bArr, byte[] bArr2) {
        this.a = alog.n(list);
        this.b = iArr;
    }

    public fdx(enh enhVar) {
        enhVar.getClass();
        this.b = enhVar;
        this.a = new ArrayList();
    }

    public fdx(List list, int[] iArr, byte[] bArr) {
        this.a = alog.n(list);
        this.b = iArr;
    }

    public fdx(List list, int[] iArr) {
        this.a = alog.n(list);
        this.b = iArr;
    }

    public fdx(MediaCodec.CryptoInfo cryptoInfo) {
        this.b = cryptoInfo;
        this.a = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }
}
