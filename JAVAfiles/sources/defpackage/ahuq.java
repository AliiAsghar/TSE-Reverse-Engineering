package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.util.Log;
import android.view.KeyEvent;
import androidx.cardview.widget.CardView;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahuq {
    public final boolean a;
    public final Object b;
    public final Object c;
    public final Object d;

    public ahuq(CardView cardView, Dialog dialog, akro akroVar, boolean z) {
        this.b = cardView;
        this.d = dialog;
        this.c = akroVar;
        this.a = z;
    }

    public static boolean e(Editable editable, KeyEvent keyEvent, boolean z) {
        ekb[] ekbVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (!i(selectionStart, selectionEnd) && (ekbVarArr = (ekb[]) editable.getSpans(selectionStart, selectionEnd, ekb.class)) != null && (ekbVarArr.length) > 0) {
                for (ekb ekbVar : ekbVarArr) {
                    int spanStart = editable.getSpanStart(ekbVar);
                    int spanEnd = editable.getSpanEnd(ekbVar);
                    if (z) {
                        if (spanStart == selectionStart) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                        if (selectionStart <= spanStart && selectionStart < spanEnd) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                    } else {
                        if (spanEnd == selectionStart) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                        if (selectionStart <= spanStart) {
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r8 != (-1)) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean f(android.view.inputmethod.InputConnection r5, android.text.Editable r6, int r7, int r8, boolean r9) {
        /*
            r0 = 0
            if (r6 == 0) goto L79
            if (r7 < 0) goto L79
            if (r8 >= 0) goto L9
            goto L79
        L9:
            int r1 = android.text.Selection.getSelectionStart(r6)
            int r2 = android.text.Selection.getSelectionEnd(r6)
            boolean r3 = i(r1, r2)
            if (r3 != 0) goto L79
            if (r9 == 0) goto L2f
            int r7 = java.lang.Math.max(r7, r0)
            int r7 = defpackage.d.u(r6, r1, r7)
            int r8 = java.lang.Math.max(r8, r0)
            int r8 = defpackage.d.v(r6, r2, r8)
            r9 = -1
            if (r7 == r9) goto L79
            if (r8 == r9) goto L79
            goto L3d
        L2f:
            int r1 = r1 - r7
            int r7 = java.lang.Math.max(r1, r0)
            int r2 = r2 + r8
            int r8 = r6.length()
            int r8 = java.lang.Math.min(r2, r8)
        L3d:
            java.lang.Class<ekb> r9 = defpackage.ekb.class
            java.lang.Object[] r9 = r6.getSpans(r7, r8, r9)
            ekb[] r9 = (defpackage.ekb[]) r9
            if (r9 == 0) goto L79
            int r1 = r9.length
            if (r1 <= 0) goto L79
            r2 = r0
        L4b:
            if (r2 >= r1) goto L62
            r3 = r9[r2]
            int r4 = r6.getSpanStart(r3)
            int r3 = r6.getSpanEnd(r3)
            int r7 = java.lang.Math.min(r4, r7)
            int r8 = java.lang.Math.max(r3, r8)
            int r2 = r2 + 1
            goto L4b
        L62:
            int r7 = java.lang.Math.max(r7, r0)
            int r9 = r6.length()
            int r8 = java.lang.Math.min(r8, r9)
            r5.beginBatchEdit()
            r6.delete(r7, r8)
            r5.endBatchEdit()
            r5 = 1
            return r5
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahuq.f(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public static final void h(Spannable spannable, ejy ejyVar, int i, int i2) {
        spannable.setSpan(new ekb(ejyVar), i, i2, 33);
    }

    private static boolean i(int i, int i2) {
        if (i != -1 && i2 != -1 && i == i2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ahvi, java.lang.Object] */
    public final Object a(String str, String str2) {
        try {
            return this.c.a(str2);
        } catch (IOException | IllegalArgumentException e) {
            Log.e("PhenotypeCombinedFlags", "Invalid Phenotype flag value for flag ".concat(str), e);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set, java.lang.Object] */
    public final ahut b(ahta ahtaVar, String str) {
        boolean z = this.a;
        ?? r4 = this.b;
        ahlp ahlpVar = ahut.f;
        mma mmaVar = new mma(ahtaVar, str, z, (Set) r4, 10);
        algx algxVar = new algx(str, "");
        Object obj = (ahut) ahlpVar.a.get(algxVar);
        if (obj == null) {
            obj = mmaVar.get();
            Object obj2 = (ahut) ahlpVar.a.putIfAbsent(algxVar, obj);
            if (obj2 == null) {
                Context context = ahtaVar.d;
                ahvc.c.putIfAbsent(algxVar, new asqc(obj));
                if (!ahvc.b) {
                    synchronized (ahvc.a) {
                        if (!ahvc.b && !Objects.equals(context.getPackageName(), "com.google.android.gms")) {
                            if (abvk.d()) {
                                context.registerReceiver(new ahvc(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                            } else {
                                context.registerReceiver(new ahvc(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                            }
                            ahvc.b = true;
                        }
                    }
                }
                ahux.a.putIfAbsent(algxVar, new ahsz(obj, 5));
            } else {
                obj = obj2;
            }
        }
        ahut ahutVar = (ahut) obj;
        boolean z2 = ahutVar.d;
        albo.N(true, "Package %s cannot be registered both with and without stickyAccountSupport", str);
        return ahutVar;
    }

    public final Resources c() {
        return ((CardView) this.b).getContext().getResources();
    }

    public final ejy d(CharSequence charSequence) {
        eka ekaVar = new eka((fcp) ((euu) this.b).b, this.a, (int[]) this.c);
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int codePointAt = Character.codePointAt(charSequence, i);
            if (ekaVar.a(codePointAt) == 2) {
                i += Character.charCount(codePointAt);
            } else {
                return null;
            }
        }
        if (ekaVar.d()) {
            return ekaVar.b();
        }
        return null;
    }

    public final boolean g(CharSequence charSequence, int i, int i2, ejy ejyVar) {
        int i3;
        if (ejyVar.b == 0) {
            Object obj = this.d;
            gku e = ejyVar.e();
            int a = e.a(8);
            if (a != 0) {
                ((ByteBuffer) e.b).getShort(a + e.a);
            }
            if (ejz.a.get() == null) {
                ejz.a.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) ejz.a.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = ((ejz) obj).b;
            String sb2 = sb.toString();
            int i4 = ear.a;
            if (true != textPaint.hasGlyph(sb2)) {
                i3 = 1;
            } else {
                i3 = 2;
            }
            ejyVar.b = i3;
        }
        if (ejyVar.b != 2) {
            return false;
        }
        return true;
    }

    public ahuq(euu euuVar, ejv ejvVar, boolean z, int[] iArr) {
        this.b = euuVar;
        this.d = ejvVar;
        this.a = z;
        this.c = iArr;
    }

    public ahuq(boolean z, Set set, ahvi ahviVar, ahvi ahviVar2) {
        this.a = z;
        this.b = set;
        this.c = ahviVar;
        this.d = ahviVar2;
    }
}
