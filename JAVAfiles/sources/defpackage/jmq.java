package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Trace;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jmq extends arrp implements arqr {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmq(Object obj, boolean z, CharSequence charSequence, Object obj2, int i) {
        super(1);
        this.e = i;
        this.d = obj;
        this.a = z;
        this.b = charSequence;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r2v12, types: [cti, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, dli$a] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, miz] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        Object obj2;
        kbp kbpVar;
        jfq jfqVar;
        jfq jfqVar2;
        arqr e;
        int i = this.e;
        boolean z = true;
        if (i != 0) {
            jfq jfqVar3 = null;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        Context context = (Context) obj;
                        context.getClass();
                        afzd afzdVar = new afzd(context, this.d);
                        afzdVar.n = this.a;
                        afzdVar.setText((CharSequence) this.b);
                        afzdVar.setSelection(afzdVar.length());
                        afzdVar.setId(R.id.compose_message_text);
                        afzdVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        afzdVar.setGravity(16);
                        afzdVar.requestFocus();
                        if (Build.VERSION.SDK_INT >= 29 && this.c == null) {
                            afzdVar.setTextCursorDrawable((Drawable) null);
                        }
                        return afzdVar;
                    }
                    long j = ((cjn) obj).a;
                    if (this.a) {
                        if (this.c == null) {
                            return false;
                        }
                    } else if (this.c == null) {
                        throw new IllegalStateException("textLayoutResult should never be null!");
                    }
                    if (this.d != null) {
                        int j2 = ((diy) this.c).j(j);
                        long k = this.d.k(j);
                        ?? r2 = this.b;
                        int i2 = aeim.a;
                        Iterator it = r2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                aeig aeigVar = (aeig) it.next();
                                if (j2 >= aeigVar.b() && j2 < aeigVar.a() && (e = aeigVar.e()) != null && ((Boolean) e.a(new cjn(k))).booleanValue()) {
                                    break;
                                }
                            } else {
                                z = false;
                                break;
                            }
                        }
                        return Boolean.valueOf(z);
                    }
                    throw new IllegalStateException("layoutCoordinates should never be null!");
                }
                lrc lrcVar = (lrc) obj;
                lrcVar.getClass();
                Object obj3 = this.d;
                Context context2 = ((kcy) obj3).b;
                ?? r11 = this.c;
                boolean t = adom.t(context2);
                boolean bY = lga.bY(r11);
                boolean ca = lga.ca(r11);
                kcy kcyVar = (kcy) obj3;
                arxm l = qjh.l(kcyVar.c, null, new kcw(kcyVar, (miz) r11, lrcVar, ca, (arpe) null, 0), 3);
                kbp kbpVar2 = new kbp(l, lrcVar, 16, null);
                ?? r0 = this.c;
                boolean n = r0.n();
                boolean bW = lga.bW(r0);
                if (!t) {
                    kbpVar = new kbp(this.d, kbpVar2, 17);
                } else {
                    kbpVar = null;
                }
                if (lga.bL(this.c)) {
                    jfqVar = new jfq(this.d, this.c, kbpVar2, 15, (short[]) null);
                } else {
                    jfqVar = null;
                }
                Object obj4 = this.d;
                ?? r6 = this.c;
                ((Boolean) ((kcy) obj4).f.b()).booleanValue();
                if (lga.bK(r6)) {
                    jfqVar2 = new jfq(this.d, kbpVar2, this.c, 16);
                } else {
                    jfqVar2 = null;
                }
                if (lga.bJ(this.c)) {
                    jfqVar3 = new jfq(this.d, kbpVar2, this.c, 14);
                }
                return new kik(new kav(l, 15), kbpVar, jfqVar, jfqVar2, jfqVar3, bW, n, bY, ca, (String) this.b, this.a, t);
            }
            Throwable th = (Throwable) obj;
            if (th instanceof gvh) {
                ((gsx) this.d).i(((gvh) th).a);
            }
            if (this.a && (obj2 = this.b) != null) {
                int hashCode = ((gys) ((lhm) this.c).f).hashCode();
                if (Build.VERSION.SDK_INT >= 29) {
                    Trace.endAsyncSection(gvf.bg((String) obj2), hashCode);
                } else {
                    String bg = gvf.bg((String) obj2);
                    try {
                        if (gvf.s == null) {
                            gvf.s = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        Method method = gvf.s;
                        if (method != null) {
                            method.invoke(null, Long.valueOf(gvf.q), bg, Integer.valueOf(hashCode));
                        } else {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } catch (Exception e2) {
                        gvf.bf("asyncTraceEnd", e2);
                    }
                }
            }
            return arnb.a;
        }
        float floatValue = ((Number) obj).floatValue();
        if (this.a) {
            ((kbn) this.d).a();
            this.b.f(true);
        }
        this.c.f(Float.valueOf(floatValue));
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmq(kcy kcyVar, miz mizVar, String str, boolean z, int i) {
        super(1);
        this.e = i;
        this.d = kcyVar;
        this.c = mizVar;
        this.b = str;
        this.a = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmq(boolean z, diy diyVar, cti ctiVar, List list, int i) {
        super(1);
        this.e = i;
        this.a = z;
        this.c = diyVar;
        this.d = ctiVar;
        this.b = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmq(boolean z, kbn kbnVar, ascd ascdVar, ascd ascdVar2, int i) {
        super(1);
        this.e = i;
        this.a = z;
        this.d = kbnVar;
        this.b = ascdVar;
        this.c = ascdVar2;
    }
}
